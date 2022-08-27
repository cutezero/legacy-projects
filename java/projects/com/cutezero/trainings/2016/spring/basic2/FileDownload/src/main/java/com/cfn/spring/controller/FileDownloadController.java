package com.cfn.spring.controller;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileDownloadController {

	@RequestMapping(value="/download")
	public void fileDownload(HttpServletResponse response){
		try{
			String location="G:/Others/qwer.pdf";
			InputStream in=new BufferedInputStream(new FileInputStream(location));
			response.setContentType("application/pdf");
			response.setHeader("Content-Disposition", "attachment; filename=java.pdf");
			OutputStream out=response.getOutputStream();
			FileCopyUtils.copy(in, out);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
