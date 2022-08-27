package com.train.resources;

import javax.ws.rs.Path;

@Path("train")
public class RegionalTrainStatus extends TrainStatusResource{

	@Override
	String getRegionStatus(String trainNo) {
		String message= null;
		if(trainNo.startsWith("0"))
			message="Welcome Central Railway";
		else if(trainNo.startsWith("1"))
			message="Welcome Northern Railway";
		else if(trainNo.startsWith("2"))
			message="Welcome Southern Railway";
		else if(trainNo.startsWith("3"))
			message="Welcome East-cost Railway";
		else if(trainNo.startsWith("4"))
			message="Welcome Western Railway";
		return message;
	}

	
}
