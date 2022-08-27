package com.cfn;


import java.util.List;

public class FilterMessages {
	public static List<Message> filtermsgs(List<Message> messagesList, FilteringStrategy strategy)
	{
		List<Message> outputList= strategy.filter(messagesList);
		return outputList;
	}
}
