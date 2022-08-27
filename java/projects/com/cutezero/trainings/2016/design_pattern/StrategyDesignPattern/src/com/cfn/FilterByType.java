package com.cfn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterByType implements FilteringStrategy {
	private String type;
	
	public FilterByType(String type) {
		this.type = type;
	}

	@Override
	public List<Message> filter(List<Message> messagesList) {
		List<Message> outputList= new ArrayList<Message>();
		Iterator<Message> itr=messagesList.iterator();
		while (itr.hasNext())
		{
			Message msg=itr.next();
			if (msg.getType().equals(type))
			{
				outputList.add(msg);
			}
		}
		return outputList;
	}
}
