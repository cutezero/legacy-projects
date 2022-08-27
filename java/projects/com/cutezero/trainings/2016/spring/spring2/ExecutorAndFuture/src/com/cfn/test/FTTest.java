package com.cfn.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;

import com.cfn.beans.FileTransfer;

public class FTTest {

	public static void main(String[] args) throws MalformedURLException {
		FileTransfer transfer= new FileTransfer();
		Future<String> result=transfer.startDownloading(new URL("http://www.google.co.in"));
		System.out.println("Result : "+result.toString());
	}

}
