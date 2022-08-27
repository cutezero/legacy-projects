package com.cfn.app;

import com.cfn.app.AdditionStub.DoAdd;
import com.cfn.app.AdditionStub.DoAddResponse;

public class Bind {

	public static double execute(double x, double y){
		double val=-1;
		try{
			AdditionStub stub=new AdditionStub();
			DoAdd doAdd= new DoAdd();
			doAdd.setX(x);
			doAdd.setY(y);
			DoAddResponse res=stub.doAdd(doAdd);
			val=res.get_return();
		}catch(Exception e){e.printStackTrace();}
		return val;
	}
}
