

import com.cfn.hibernate.dao.PaymentDao;
import com.cfn.hibernate.dao.PaymentDaoFactory;
import com.cfn.hibernate.model.Card;
import com.cfn.hibernate.model.Cheque;

public class Main {
	static public void main(String []s)
	{
		PaymentDao dao= PaymentDaoFactory.getInstance();
		Card card= new Card("tx09214",8000, new java.util.Date(), 801345, "VISA");
		dao.saveCard(card);
		System.out.println("========================");
		Cheque cheque= new Cheque("tx09241",9000, new java.util.Date(), 801345, "ORDER");
		dao.saveCheque(cheque);
	}

}
