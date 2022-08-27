import com.cfn.hibernate.dao.PaymentDao;
import com.cfn.hibernate.dao.PaymentDaoFactory;
import com.cfn.hibernate.model.Card;
import com.cfn.hibernate.model.Cheque;

public class Main 
{
	public static void main(String []args)
	{
		PaymentDao dao=PaymentDaoFactory.getInstance();
		Card card=new Card("tx0123",5000,new java.util.Date(),12347896,"VISA");
		dao.saveCard(card);
		System.out.println("******************");
		Cheque cheque=new Cheque("tx0456",9000,new java.util.Date(),98765413,"ORDER");
		dao.saveCheque(cheque);
	}
}
