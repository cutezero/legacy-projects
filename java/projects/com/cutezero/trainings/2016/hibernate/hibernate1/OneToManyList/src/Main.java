import com.cfn.hibernate.dao.OTMDao;
import com.cfn.hibernate.dao.OTMDaoFactory;
import com.cfn.hibernate.model.Patient;

public class Main 
{
	public static void main(String []args)
	{
		OTMDao dao=OTMDaoFactory.getInstance();
		//dao.saveDoctorWithPatients();
		Patient p= new Patient(2004, "facebook", "clf");
		//dao.addPatientToDoctor(p);
		//dao.removePatientFromDoctor(2003);
		//dao.removeDoctor(1001);
	}
}
