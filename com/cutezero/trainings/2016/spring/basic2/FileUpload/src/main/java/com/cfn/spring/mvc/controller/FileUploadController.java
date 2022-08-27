package com.cfn.spring.mvc.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {
	
	@RequestMapping(value="/uploadfile")
	public ModelAndView getFileUploadPage(){
		return new ModelAndView("uploadfile");
	}
	
	
	
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public ModelAndView fileUpload(@RequestParam("file1") MultipartFile file, HttpServletRequest request) {
		String fail="";
		String success="";
		if (file.getSize()!=0){
			if (file.getContentType().equals("text/xml")){
				try {
				HttpSession session=request.getSession();
				ServletContext ctx=session.getServletContext();
				String path=ctx.getInitParameter("location");
				String finalPath=path.concat("/"+file.getOriginalFilename());
				
					FileOutputStream fos=new FileOutputStream(finalPath);//throws FileNotFoundException
					byte b[]=file.getBytes();
					fos.write(b);//IOException
					
					success="Your file "+file.getOriginalFilename()+"uploaded successfully";
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
			else{
				fail="The file must be an XML only";
			}			
		}
		else{
			fail="The file must not be an empty";
		}
		if (success.length()>1){
			return new ModelAndView("success", "message", success);
		}
		else{
			return new ModelAndView("uploadfile", "message", fail);				
		}
	}
}// end of class
