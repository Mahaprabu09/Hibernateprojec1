package com.company_data_Util; 

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


import com.workprojects.company_data.entity.company;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Configuration cf=new Configuration();
			Properties p=new Properties(); 
			p.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			p.put(Environment.URL,"jdbc:mysql://localhost:3306/companyrecord");
			p.put(Environment.USER,"root");
			p.put(Environment.PASS,"#Maha100");
			p.put(Environment.DIALECT,"org.hibernate.dialect.mysql8Dialect");
			p.put(Environment.SHOW_SQL,"true");
			p.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
			p.put(Environment.HBM2DDL_AUTO,"create-drop");
			
			cf.setProperties(p);
			cf.addAnnotatedClass(company.class); 
			
			ServiceRegistry sr=new StandardServiceRegistryBuilder()
					.applySettings(cf.getProperties()).build();
			sessionFactory=cf.buildSessionFactory(sr);
		}
			return sessionFactory;
		
	}

}
