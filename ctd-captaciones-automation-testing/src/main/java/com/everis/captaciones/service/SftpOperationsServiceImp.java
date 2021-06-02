package com.everis.captaciones.service;

import ch.qos.logback.classic.Logger;
import com.jcraft.jsch.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;

import java.util.List;
import java.util.Properties;
import java.util.Vector;

import com.everis.captaciones.util.LocalConfigConstants;

@Service
public class SftpOperationsServiceImp implements SftpOperationsService {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SftpOperationsServiceImp.class);

	private static JSch jsch = new JSch();
	private static final String RESOURCE_DIR = LocalConfigConstants.APP_RESOURCES_LOCATION;
	private static final String SFTP_HOST = LocalConfigConstants.PROP_FTP_HOST;
	private static final int SFTP_PORT = LocalConfigConstants.PROP_FTP_PORT;
	private static final String SFTP_USER = LocalConfigConstants.PROP_FTP_USER;
	private static final String STFP_CERTIFICATE_LOCATION = LocalConfigConstants.PROP_FTP_CERTIFICATE;

	@Override
	@Retryable(value = Exception.class, backoff = @Backoff(delay = 10000, maxDelay = 20000), maxAttempts = 5)
	public void downloadFile(String file, String sFtpWorkingDir, String targetPath)
			throws SftpException, JSchException, FileNotFoundException {

		List<String> nFileNameList = null;


		Session session = getSession();
		session.connect();
		Channel channel = session.openChannel("sftp");
		channel.connect();
		ChannelSftp channelSftp = (ChannelSftp) channel;
		LOGGER.info("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		Vector nVector = channelSftp.ls("/IN/CTS/store_notification/20210527");


		LOGGER.info("antes");

		int i;
		for (i = 0; i < nVector.size(); i++) {
			LOGGER.info(String.valueOf(i));
			LOGGER.info("entro");
			LOGGER.info(String.valueOf(nVector.size()));
			LOGGER.info("entro2");

			channelSftp.cd("/IN/CTS/store_notification/20210527");
            String nFileName = nVector.get(i).toString().substring(70, nVector.get(i).toString().length());
			//String nFileName = nVector.get(i).toString();
			LOGGER.info("nombre");
			LOGGER.info(nFileName);
			if (nFileName.contains(".TXT")) {


			LOGGER.info("uuuuuuuuuuuuuuuuuuuuuuuuuuu");
			File nFile = new File("/IN/CTS/store_notification/20210527" + nFileName);
			// 7. Descarga el archivo
			//channelSftp.get(nFileName, new FileOutputStream(nFile));
			// 7. Descarga el archivo

			channelSftp.get(nFileName, "C:/Alan/Automatizacion/descarga");
			}

		}


		//channelSftp.cd("/IN/CTS/store_notification/20210527");
		//channelSftp.ls("C:\\Alan\\Automatizacion\\descarga");

		//channelSftp.get( ; "C:/Alan/Automatizacion/descarga");
		channelSftp.exit();
		channel.disconnect();
		session.disconnect();
	}


	private Session getSession() throws JSchException {
		//String sFtpCertificado = RESOURCE_DIR + File.separator + STFP_CERTIFICATE_LOCATION;
		String sFtpCertificado = "C:\\Alan\\Automatizacion\\ctd-captaciones-automation-testing\\src\\main\\java\\com\\everis\\captaciones\\util\\usr_proyserv_digitales.ppk";
		jsch.addIdentity(sFtpCertificado);
		Session session = jsch.getSession("usr_proyserv_digitales", "sftpa.intercorp.com.pe", Integer.parseInt("22220"));
		session.setConfig("kex", "diffie-hellman-group1-sha1");
		Properties config = new Properties();
		config.put("StrictHostKeyChecking", "no");
		session.setConfig(config);
		return session;
	}

}
