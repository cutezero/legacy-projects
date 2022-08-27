package one2one.bidirectional.test;


import one2one.bidirectional.entities.Address;
import one2one.bidirectional.entities.Customer;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cfn.util.SessionFactoryRegistry;

/**
 * One-to-One as Many-to-One
 * @author Srikanta.ydon
 *
 */
public class OTOaMTOTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory= null;
		Session session= null;
		Transaction transaction= null;
		boolean flag= false;
		Customer customer= null;
		Address address= null;
		
		try {
			sessionFactory= SessionFactoryRegistry.getSessionFactory();
			session= sessionFactory.getCurrentSession();
			transaction= session.beginTransaction();
			
			address= new Address();
//			address.setAddressId("ADDR07809");	//Auto generate is not working in my case 
			address.setAddressLine1("4th floor");
			address.setAddressLine2("Maitrivabanam");
			address.setCity("Hederabad");
			address.setState("Telengana");
			address.setCountry("India");
			address.setZipCode(500038);
			session.save(address);
			
			customer= new Customer();
//			customer.setCustomerId("CU0199");
			customer.setFirstName("Lucky");
			customer.setLastName("Panigrahy");
			customer.setMobileNumber("8895749052");
			customer.setEmailAddress("srikanta.ydon@gmail.com");
			customer.setAddress(address);
			session.save(customer);
			
			flag= true;
		} 
		finally{
			if(transaction!= null){
				if(flag)
					transaction.commit();
				else
					transaction.rollback();
				
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}

}
