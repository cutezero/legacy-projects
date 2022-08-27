package com.app.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestJava8 {

	static List<Person> persons;
	static String str;
	
	public static void main(String ...args){
//		doLambda();		//for lamda task 
		System.out.println("creating the List : ");
		makePersonsList();
		str=persons.getClass().getName();
		System.out.println("The Preapared List's Implementation name: "+str);
		
/*		
		System.out.println("sorting by Last name java7: ");
		sortInJava7();
		System.out.println("printing only the List : ");
		printPersons(persons);
		System.out.println("printPersonsByLastName : ");
		printPersonsByLastName(persons);
*/		
		System.out.println("sorting by Last name java8: ");
		doInJava8();
		System.out.println("printing only the List : ");
		printPersons(persons);
	}
	
	public static void doInJava8(){
//		Collections.sort(persons,(Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		Collections.sort(persons,(p1,p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()));
	}
	public static void makePersonsList(){
/*		List<Person> persons= new ArrayList<>();
		persons.add(new Person("Srikanta", "Panigrahy", 24));
		persons.add(new Person("Bisu", "pradhan", 23));
		persons.add(new Person("Badri", "Panigrahy", 23));
		persons.add(new Person("Lucky", "Panigrahy", 22));
		persons.add(new Person("Lucky", "Korad", 24));
		persons.add(new Person("Srikanta", "Panigrahy", 24));
		*/
		persons= Arrays.asList(	//inline listing of objects
		new Person("Srikanta", "Panigrahy", 24),
		new Person("Bisu", "pradhan", 23),
		new Person("Badri", "Mahanty", 23),
		new Person("Lucky", "Panigrahy", 22),
		new Person("Lucky", "Korad", 24),
		new Person("Srikanta", "Panigrahy", 24),
		new Person("Santa", "canigrahy", 24),
		new Person("kanta", "danigrahy", 24)
		);
		
		//sort list by last name
		//method to print all elements
		//method to print all person which fast name begins with "L"
		 
	}
	
	public static void sortInJava7(){
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.lastName.compareToIgnoreCase(p2.lastName);
			}
		});
		
		System.out.println("printing by Last name begining with p : ");
		printConditionally(persons, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("p");
			}
		});
		System.out.println("printing by First name begining with L : ");
		printConditionally(persons, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("L");
			}
		});
		System.out.println("printing by First name begining with L : ends here ");
		
		
		printPersons(persons);
	}
	
	public static void printConditionally(List<Person> persons, Condition c){
		System.out.println("printing by Conditions : ");
		for (Person p: persons){
			if (c.test(p)){
				System.out.println(p);
			}
		}
	}
	
	public static void printPersons(List<Person> persons){
		for(Person p: persons)
			System.out.println(p);
	}
	public static void printPersonsByLastName(List<Person> persons){
		for(Person p: persons){
			if (p.lastName.startsWith("P"))
			System.out.println(p);
		}
	}
	
	
	
	public static void doLambda(){
		//	variable1=(int a, int b)-> a+b;
		//	MyLambda a1= (int a, int b)-> a+b;
		//	MyLambda a1= (int a, int b)-> 2+3;
		//	System.out.println(a1.add(67, 567));
		//	System.out.println(MyLambda b= (34,78));
		//	MyLambda st= (s)-> s.length();	//in case one arrgument passed you can remove the paranthesis as like below
		/*	MyLambda st= s-> s.length();	//only for single arg methods
	System.out.println(st.getLength("rgfb"));*/
		typeInference(s-> s.length());	//#2
		
	}
	public static void typeInference(MyLambda m){	//#2
		System.out.println(m.getLength("from Type Inference : "));
	}

}
@FunctionalInterface
interface MyLambda{		//#doLamda
	//	int add(int a, int b);	//must and should one method only
	int getLength(String s);
}
interface Condition{
	boolean test(Person p);
}