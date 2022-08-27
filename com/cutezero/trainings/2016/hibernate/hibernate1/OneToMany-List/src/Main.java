import com.sathya.hibernate.dao.OTMDao;
import com.sathya.hibernate.dao.OTMDaoImpl;
import com.sathya.hibernate.model.Patient;

public class Main 
{
	public     static   void   main(String  args[ ])
	{
		OTMDao   dao = new   OTMDaoImpl();
		//dao.saveDoctorWithPatients();
		dao.removePatientFromDoctor();
	}

}
