package com.nb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nb.beans.Motor;
import com.nb.beans.Toy;

/**
 * This particular program shows how we can use a dependency of another IOC in our IOC
 * where one bean depends on another bean placed in another IOC
 * @author Srikanta.ydon
 *
 */
public class NBTest {
	public static void main(String[] args) {
		BeanFactory parentFactory= new XmlBeanFactory(new ClassPathResource("com/nb/common/parent-context.xml"));
		Motor motor=parentFactory.getBean("motor", Motor.class);
		System.out.println(motor);
		BeanFactory childFactory= new XmlBeanFactory(new ClassPathResource("com/nb/common/child-context.xml"), parentFactory);
		Toy toy=childFactory.getBean("toy", Toy.class);
		System.out.println(toy);
	}

}
