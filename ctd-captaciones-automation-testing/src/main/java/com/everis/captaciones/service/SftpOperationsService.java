package com.everis.captaciones.service;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

import java.io.FileNotFoundException;

public interface SftpOperationsService {

	public void downloadFile(String file, String sFtpWorkingDir, String targetPath)
			throws SftpException, JSchException, FileNotFoundException;

	
}
