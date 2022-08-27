package com.automobiles.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.automobiles.entities.Mechanic;

public class Test {
    public static void main(String[] args) {
        boolean flag = false;
        Transaction transaction = null;
        Configuration configuration = null;
        SessionFactory sessionFactory = null;

        configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        try {
            Mechanic mechanic = new Mechanic();
            mechanic.setMechanicNo(1);
            mechanic.setFirstName("Andrew");
            mechanic.setLastName("L");
            mechanic.setSpecialization("Painting");
            mechanic.setExperience(12);
            mechanic.setContactNo("919982988932");
            mechanic.setEmailAddress("andrew.l@gmail.com");

            session.save(mechanic);

            flag = true;
            System.out.println("Inserted Mechanic into database");
        } finally {
            if (session != null && transaction != null) {
                if (flag) {
                    transaction.commit();
                } else {
                    transaction.rollback();
                }
                session.close();
            }
            sessionFactory.close();
        }
    }
}
