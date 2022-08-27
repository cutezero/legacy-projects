package com.cfn.beans;

import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.io.IOUtils;

public class FileTransfer {

	ExecutorService pool= Executors.newFixedThreadPool(10);
	public Future<String> startDownloading(final URL url){
		return pool.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				try(InputStream in=url.openStream()){
					return IOUtils.toString(in, StandardCharsets.UTF_8);
				}
			}
		});
	}
}
