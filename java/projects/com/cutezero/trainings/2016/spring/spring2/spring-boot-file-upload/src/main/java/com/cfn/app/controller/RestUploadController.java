package com.cfn.app.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cfn.app.model.UploadModel;


@RestController
public class RestUploadController {

	private final Logger logger=LoggerFactory.getLogger(RestUploadController.class);
	
	//save the uploaded file to a folder
	private static final String UPLOADED_FOLDER="G:\\Archive\\";
	
	// 3.1.1 Single file upload
    @PostMapping("/api/upload")
    // If not @RestController, uncomment this
    //@ResponseBody
	public ResponseEntity<?> uploadFile (@RequestParam("file")MultipartFile uploadedFile){
    	
    	logger.debug("Entered into : uploadFile()");
    	
    	if(uploadedFile.isEmpty())
			return new ResponseEntity("Please enter a file greater than 1KB", HttpStatus.OK);
    		try {
				saveUploadedFiles(Arrays.asList(uploadedFile));
			} catch (IOException e) {
				return new ResponseEntity(HttpStatus.BAD_REQUEST);
			}
    		return new ResponseEntity("Your file has succesfully uploded ", new HttpHeaders(),HttpStatus.OK);
    }
    
    //Multiple file upload
    @PostMapping("/api/upload/multi")
    public ResponseEntity<?> uploadFileMulti(@RequestParam("extraField") String extraField, @RequestParam("files") MultipartFile[] uploadFiles){
//    	String uploadedFileName= null; 
    	
    	logger.debug("Entered into : uploadFileMulti()");
    	
    	//get file name
/*    	String uploadedFileName= Arrays.stream(uploadFiles).map(x -> x.getOriginalFilename())
    			.filter(x ->  !StringUtils.isEmpty(x).collect(Collectors.joining(" , ")));
 */   	
    	 String uploadedFileName1 = Arrays.stream(uploadFiles).map(file -> file.getOriginalFilename())
                 .filter(fileName -> !StringUtils.isEmpty(fileName)).collect(Collectors.joining(" , "));
    	
    	 if(StringUtils.isEmpty(uploadedFileName1))
    		 return new ResponseEntity<>("It looks like you didnt selected any file. Please select a file.", HttpStatus.OK);
    	 
    	 try {
			saveUploadedFiles(Arrays.asList(uploadFiles));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
    	 
    	 return new ResponseEntity("File Name: "+uploadedFileName1+" has uploded succesfully." , HttpStatus.OK);
    }
    
 // maps html form to a Model
    @PostMapping("/api/upload/multi/model")
    public ResponseEntity<?> multiUploadFileModel(@ModelAttribute UploadModel uploadModel){
    	logger.debug("multipleUploadFileModel()");
    	
    	try {
			saveUploadedFiles(Arrays.asList(uploadModel.getFiles()));
		} catch (IOException e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
    	return new ResponseEntity("Successfully uploded ", HttpStatus.OK);
    }
    
    //save file
    private void saveUploadedFiles(List<MultipartFile> files) throws IOException{
    	byte[] bytes= null;
    	
    	for(MultipartFile file : files){
    		if(file.isEmpty()){
    			continue;	//check next file
    		}
    		
    		bytes= file.getBytes();
    		Path path= Paths.get(UPLOADED_FOLDER+file.getOriginalFilename());
    		Files.write(path, bytes);
    	}
    }
	
}
