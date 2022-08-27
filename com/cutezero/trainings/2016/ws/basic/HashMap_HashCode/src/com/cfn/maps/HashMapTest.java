package com.cfn.maps;

import java.util.HashMap;
import java.util.Map;

import com.cfn.po.Address;
import com.cfn.po.Student;

public class HashMapTest {
	public static void main(String[] args) {

		/*
		 * Student student= new Student(101,"Rama"); Student student2= new
		 * Student(102,"Bhima"); Student student3= new Student(103,"Shyama");
		 * Student student4= new Student(104,"Dhana"); Student student5= new
		 * Student(105,"Bisu"); Student student6= new Student(102,"Srikanta");
		 */

		Address address = new Address(761004, "Bhimapur", "BAM");
		Address address2 = new Address(761010, "Nuapada", "Chikiti");
		Address address3 = new Address(500038, "Ameerpet", "HYD");
		Address address4 = new Address(500409, "Kandivali", "Mumbai");

		Map<Student, Address> map = new HashMap<Student, Address>();

		/*
		 * map.put(student, address); map.put(student2, address2);
		 * map.put(student3, address3); map.put(student4, address4);
		 * map.put(student5, address); map.put(student6, address4);
		 */
		Map<Student, String> map2 = new HashMap<Student, String>();
		/*map2.put(new Student(101), "address");
		map2.put(new Student(102), "address2");
		map2.put(new Student(103), "address3");
		map2.put(new Student(104), "address4");
		map2.put(new Student(105), "address");
		map2.put(new Student(101), "address4");
		map2.put(new Student(102), "address3");*/

		map2.put(new Student(101,"A"), "address");
		map2.put(new Student(102,"B"), "address2");
		map2.put(new Student(103,"C"), "address3");
		map2.put(new Student(104,"D"), "address4");
		map2.put(new Student(105,"E"), "address");
		map2.put(new Student(101,"A"), "address4");
		map2.put(new Student(102,"F"), "address3");
		
		
		

		System.out.println("map data are ");
		for (Object o : map2.keySet()) {
			// System.out.println(o);

			System.out.println(o.hashCode() + " : " + map2.get(o));
		}
	}

}
