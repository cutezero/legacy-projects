package com.client.magicbrick.test;

import com.client.magicbrick.invoker.Magicbrick;

public class MagicbrickTest {

	public static void main(String[] args) {
		Magicbrick magicbrick=null;
		String message=null;
		
		magicbrick=new Magicbrick();
		
//		message=magicbrick.search("Hyderabad", "business", 250, 2400, 5500, "Spar mall");
//		message= magicbrick.addProperty("Bhuri Godown", "Godown", "Commercial", "Hyd");
//		message=magicbrick.unlistProperty("Ammerpet", "PNko90", "AG7845");
//		message=magicbrick.getLastAcessDetails("Yesterday");
		
		System.out.println("Test- Result : "+ message);
		
	}

}
