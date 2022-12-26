package com.workprojects.company_data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.company_data_Util.HibernateUtil;
import com.workprojects.company_data.entity.company;

public class App 
{
    public static void main( String[] args )
    {
       company c=new company(1, "infosys", "albert");
  
        
       Configuration con = new Configuration().configure().addAnnotatedClass(company.class);
		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(c);

		tx.commit();
    }
}
