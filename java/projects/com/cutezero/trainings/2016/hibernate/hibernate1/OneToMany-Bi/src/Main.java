import com.sathya.hibernate.dao.OTMDao;
import com.sathya.hibernate.dao.OTMDaoFactory;


public class Main 
{
	public    static    void   main(String  args[ ])
	{
		OTMDao    dao =OTMDaoFactory.getInstance();
		dao.saveDoctorWithPatients();
	}

}
