package com.cfn;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Message> messagesList= new ArrayList<Message>();
		messagesList.add(new Message("text", 100, "This is a Sample Test"));
		messagesList.add(new Message("xml", 150, "This is a Sample Test"));
		messagesList.add(new Message("text", 200, "This Hi Bye Test"));
		messagesList.add(new Message("text", 100, "This is a How"));
		
		/*List<Message> outputList= FilterMessages.filtermsgs(messagesList, new FilterByType("text"));
		System.out.println("result by type: ");
		System.out.println(outputList);*/
		
		/*List<Message> outputList= FilterMessages.filtermsgs(messagesList, new FilterBySize(100));
		System.out.println("result by size: ");
		System.out.println(outputList);*/
		
		List<Message> outputList= FilterMessages.filtermsgs(messagesList, new FilterByContent("Sample"));
		System.out.println("result by content: ");
		System.out.println(outputList);
	}

}
