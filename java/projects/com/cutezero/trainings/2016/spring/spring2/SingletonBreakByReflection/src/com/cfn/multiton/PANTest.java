package com.cfn.multiton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PANTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {
		
/*		Class<?> clazz= Class.forName("com.cfn.multiton.PAN");		//#1
		Constructor<?> constructor=clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
*/		
		PAN pan= null;
		
//			pan= PAN.getInstance();

/*			pan= PAN.getInstance();
			PAN pan2= (PAN) pan.clone();			//#3
//			System.out.println("PAN of 2"+"["+i+"]"+pan2.hashCode());
*/			
			//System.out.println("PAN of "+"["+i+"]"+pan.hashCode());
			
			PAN pan3= PAN.getInstance();
			FileOutputStream fos=new FileOutputStream("resources\\pan.ser");
			ObjectOutputStream oos= new ObjectOutputStream(fos);			//#4
			oos.writeObject(pan3);
			
			ObjectInputStream ois= new ObjectInputStream(new FileInputStream("resources\\pan.ser"));
			PAN p=(PAN) ois.readObject();
			System.out.println(p.hashCode());
			System.out.println(p.hashCode()==pan3.hashCode());
			
		}
		
	}

