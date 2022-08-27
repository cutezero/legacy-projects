import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.LobCreator;
import org.hibernate.service.ServiceRegistry;

public class Insert {
	public static void  main(String...args) throws IOException{
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		
		Emp e=new Emp();
		e.setEmpno(56014);
		FileInputStream fis= new FileInputStream("C:\\Users\\Srikanta.ydon\\Pictures\\Saved Pictures\\Lucky_dear.jpg");
		int length=fis.available();
		byte[] bytes= new byte[length];
		fis.read(bytes);
		
		Session session=factory.openSession();
		LobCreator creator=Hibernate.getLobCreator(session);
		Blob blob= creator.createBlob(bytes);
		e.setEmpImages(blob);
		Transaction tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		factory.close();
		fis.close();
	}
}
