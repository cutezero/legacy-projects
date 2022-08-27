package com.cfn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterByContent implements FilteringStrategy {
	
	public FilterByContent(String content) {
		this.content = content;
	}
	private String content;
	@Override
	public List<Message> filter(List<Message> messagesList) {
		List<Message> outputList= new ArrayList<Message>();
		Iterator<Message> itr=messagesList.iterator();
		while (itr.hasNext())
		{
			Message msg=itr.next();
			if (msg.getContent().contains(content))
			{
				outputList.add(msg);
			}
		}
		return outputList;
	}

}
