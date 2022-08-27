package com.serilize.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {

	/**
	 * When we try to de-serialize a singleton class object it always create a new Object 
	 * Thats why we'll always get multiple object 
	 * 
	 * To solve this kind of issue we need to implement readResolve() in the serialized Singleton class
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializedSingleton instanceOne= SerializedSingleton.getInstance();
		ObjectOutput out= new ObjectOutputStream(new FileOutputStream("fileName.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		//deserialize it from file to Object
		ObjectInput in= new ObjectInputStream(new FileInputStream("fileName.ser"));
		SerializedSingleton instanceTwo= (SerializedSingleton) in.readObject();
		in.close();
		
		System.out.println("Object1 = Object2 ? :"+( instanceOne.hashCode()==instanceTwo.hashCode()));
		System.out.println("Object1 :"+instanceOne.hashCode());
		System.out.println("Object2 :"+instanceTwo.hashCode());
		
	}

}
