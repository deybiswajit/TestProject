package com.example;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadFile {
	public static void main(String[] args) {
		try (BufferedInputStream in = new BufferedInputStream(new URL("https://dev-db1.workfusion.pg.com:8443/dach-dispute-claims-ocr-processing/d026693b-1dbd-4423-9cd4-4b81407e6096/0e608667-9e49-4a5e-8dc4-c99fd0d88c82/006002716802-xmlForCorrectedImage-raw_processed.xml").openStream());
				  FileOutputStream fileOutputStream =new FileOutputStream("D:\\Auto-ML SDK\\PG Model\\TestData\\1.xml")) {
				    byte dataBuffer[] = new byte[1024];
				    int bytesRead;
				    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				        fileOutputStream.write(dataBuffer, 0, bytesRead);
				    }
				} catch (IOException e) {
				    e.printStackTrace();
				}
	}
}
