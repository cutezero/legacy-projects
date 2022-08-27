package com.cfn.hibernate.dao;

import com.cfn.hibernate.model.Card;
import com.cfn.hibernate.model.Cheque;

public interface PaymentDao {
	void saveCard(Card card);
	void saveCheque(Cheque cheque);
}
