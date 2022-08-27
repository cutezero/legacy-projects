package com.cfn;

import java.util.HashMap;
import java.util.Map;

public class IntrinsicFactory {
	public static Map<String, IIntrinsic> m=new HashMap<String, IIntrinsic>();
	public static IIntrinsic getInstance(String division){
		if (m.containsKey(division))
		{
			IIntrinsic i1=(IIntrinsic)m.get(division);
			return i1;
		}
		else
		{
			IIntrinsic intr= new IntrinsicImpl("XYZ Ltd.", division);
			m.put(division,intr );
			return intr;
		}
			
	}
}
