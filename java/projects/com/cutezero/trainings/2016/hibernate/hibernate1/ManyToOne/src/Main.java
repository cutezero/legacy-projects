import com.sathya.hibernate.dao.MTODao;
import com.sathya.hibernate.dao.MTODaoImpl;

public class Main 
{
	public    static    void   main(String[ ]   args)
	{
		MTODao     dao = new  MTODaoImpl();
		//dao.savePatientWithDoctor();
		dao.removePatient(9003);
	}

}
