package com.everis.captaciones.test;

import com.everis.captaciones.service.SftpOperationsService;
import com.everis.captaciones.service.SftpOperationsServiceImp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

import java.io.FileNotFoundException;

public class Test {

    public static void main (String[] args) throws JSchException, SftpException, FileNotFoundException {

        SftpOperationsService services = new SftpOperationsServiceImp();
        services.downloadFile("s","s","s");
    }
}
