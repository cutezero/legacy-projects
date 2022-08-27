import java.util.HashSet;
import java.util.Set;

import com.cfn.hibernate.dao.OTMDao;
import com.cfn.hibernate.dao.OTMDaoFactory;
import com.cfn.hibernate.model.Doctor;
import com.cfn.hibernate.model.Patient;

public class Main 
{
	public static void main(String []args)
	{
		OTMDao dao=OTMDaoFactory.getInstance();
		Patient p1=new Patient(2001, "Debu", "HYD");
		Patient p2=new Patient(2002, "Bisu", "MUM");
		Patient p3=new Patient(2003, "Shri", "BAM");
		
		Set<Patient> p= new HashSet<Patient>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		Doctor d1= new Doctor(7912, "ANIL", "MD", p);
		dao.savePatientDoctor(d1);
		System.out.println("******************");
		
	}
}
