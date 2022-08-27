import java.util.HashSet;
import java.util.Set;

import com.sathya.hibernate.dao.OTMDao;
import com.sathya.hibernate.dao.OTMDaoImpl;
import com.sathya.hibernate.model.Doctor;
import com.sathya.hibernate.model.Patient;

public class Main 
{
	public     static   void   main(String  args[ ])
	{
		OTMDao   dao = new   OTMDaoImpl();
		
/*		Doctor   doctor=new  Doctor();
		doctor.setDoctorId(1103);
		doctor.setDoctorName("Bisu");
		doctor.setQualification("BMA");
		
		Patient   p1 = new   Patient(9011,"A","Foreign");
		Patient   p2 = new   Patient(9022,"B","Delhi");
		Patient   p3 = new   Patient(9033,"C","Delhi");
		
		Set<Patient>   patients = new  HashSet<Patient>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		
		doctor.setPatients(patients);

		dao.saveDoctorWithPatients(doctor);
		*/
		//Patient    p = new  Patient(9004,"D","HYD");
		//dao.addPatientToDoctor(p);
		dao.removePatientFromDoctor(1103, 9033);
		//dao.removeDoctor(1101);
		System.out.println("Your Query has been Completed");
	}

}
