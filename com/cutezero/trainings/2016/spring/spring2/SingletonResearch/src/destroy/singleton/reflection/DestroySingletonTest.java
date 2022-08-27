package destroy.singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.eager.singleton.Cache;

public class DestroySingletonTest {

	public static void main(String[] args) {

		Cache cache= Cache.getInstatnce();
		Cache cache2=Cache.getInstatnce();
		System.out.println("Cache=Cache2 ? :"+(cache.hashCode()==cache2.hashCode()));
		
		Cache cacheReplica= null;
//		Constructor<?>[] constructors= cache.getClass().getConstructors();
		Constructor<?>[] constructors= cache.getClass().getDeclaredConstructors();
		
		try {
			for(Constructor<?> constructor: constructors){
				constructor.setAccessible(true);
				cacheReplica= (Cache) constructor.newInstance();
			}
		} catch (SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Cache : "+cache.hashCode());
		System.out.println("Cache2 : "+cache2.hashCode());
		System.out.println("Cache Replica : "+cacheReplica.hashCode());
		//hurreeeeyyyy We broke the Singleton
		
		//To solve this issue we can go for Enum Singleton class ( But might be inflexible like it'll never be lazy initializer
		//cloning an object and this Reflection is different I think
		//Incase of cloning an object, we can solve this issue by restricting the cloning of the object
		//implements from Clonable and override the clone() with throwing exception [Well no I never tried it, so I don't know  ]
	}

}
