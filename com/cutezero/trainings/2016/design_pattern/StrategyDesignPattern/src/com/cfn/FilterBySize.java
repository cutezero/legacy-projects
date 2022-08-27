package com.cfn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterBySize implements FilteringStrategy {
	private int size;
	public FilterBySize(int size) {
		this.size = size;
	}
	@Override
	public List<Message> filter(List<Message> messagesList) {
		List<Message> outputList= new ArrayList<Message>();
		Iterator<Message> itr=messagesList.iterator();
		while (itr.hasNext())
		{
			Message msg=itr.next();
			if (msg.getSize()==size)
			{
				outputList.add(msg);
			}
		}
		return outputList;
	}

}
