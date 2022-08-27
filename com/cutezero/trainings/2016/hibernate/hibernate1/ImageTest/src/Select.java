import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Select {
	public static void main(String args[]) throws SQLException, IOException{
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		
		Session session=factory.openSession();
		Emp e=(Emp)session.get(Emp.class, 56014);
		Blob b=e.getEmpImages();
		int length=(int)b.length();
		byte bytes[]=b.getBytes(1,length);
		FileOutputStream fos=new FileOutputStream("G:/Hibernate_1/lucky.jpg");
		fos.write(bytes);
		fos.close();
		session.close();
		factory.close();
		
	}
}
