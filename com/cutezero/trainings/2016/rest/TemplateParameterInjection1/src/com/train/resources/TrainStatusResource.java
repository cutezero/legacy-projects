package com.train.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//@Path("/train") 	//not Applicable
public abstract class TrainStatusResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/status/{train-no}/{date}")
	public String trainRunningStatus(@PathParam("train-no")String trainNo, @PathParam("date")String date) throws ParseException {
		
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
		Date dt=simpleDateFormat.parse(date);
		System.out.println("Train No : "+trainNo);
		System.out.println("Date Accepted : "+date);
		System.out.println("Date Converted : "+dt);
		System.out.println("Region Status : "+getRegionStatus(trainNo));
		
		return trainNo+" reached at SCB at : "+new Date();
	}
	
	abstract String getRegionStatus(String trainNo);
}
