
public class DefaultClass2 {
	String s1;
	{
		System.out.println("This is default class with using String in instance"+String.class.getClassLoader());
		
	}
	static{
		System.out.println("This is default class with using String in static"+String.class.getClassLoader());
	}
}
