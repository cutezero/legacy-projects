package com.app.test;

public class JustTest {

	public static void main(String[] args) {
		
		/*		System.out.println("---------A Program to test the System class and its properties-------------");
		Properties properties = System.getProperties();
		Set<Object>  sysPropertiesKeys = properties.keySet();
		for (Object key : sysPropertiesKeys) {
			System.out.println(key + " : " + properties.getProperty((String)key)); 
		}
		System.out.println("---------A Program to test the System class and its properties ( Ends here )-------------");
*/				

		System.out.println("---------The above Program using java8 and lambda expresion with smaller piece code-------------");
		System.getProperties().entrySet().stream().map(e -> e.getKey() + " : " + e.getValue()).forEach(System.out::println);
		

	}

}
