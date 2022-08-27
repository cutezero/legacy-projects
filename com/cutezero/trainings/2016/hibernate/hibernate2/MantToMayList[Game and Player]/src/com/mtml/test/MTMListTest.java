package com.mtml.test;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtml.entities.Game;
import com.mtml.entities.Player;
import com.mtml.util.SessionFacotryRegistry;




public class MTMListTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Game game=null;
		Player player=null;
		List<Player> players;
		boolean flag = false;
		try {
			sessionFactory = SessionFacotryRegistry.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			players=new ArrayList<Player>();
						
			player=new Player();
			player.setName("Ravindra");
			player.setAge(24);
			player.setGender("Male");
			player.setFormate("All");
			session.save(player);
			players.add(player);
			
			player=new Player();
			player.setName("Rahul");
			player.setAge(23);
			player.setGender("Male");
			player.setFormate("Test");
			session.save(player);
			players.add(player);
			
			game=new Game();
			game.setGameName("Cricket");
			game.setType("One Day");
			game.setDate(new Date());
			game.setPlayers(players);
			session.save(game);
			
			

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			SessionFacotryRegistry.closedSessionfactory();
		}
	}
}
