/*package com.vinod.insurance.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vinod.insurance.entity.Credential;

@Service
public class LoginService {
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public boolean validateUser(@RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("role") String role){
		
		SessionFactory factory= new Configuration()
									.configure("/insurance-project/src/main/resources/hibernate.cfg.xml")
									.addAnnotatedClass(Credential.class)
									.buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		try{
			Credential creds = new Credential(userName, password, role);

			// begin transaction
			
			session.beginTransaction();
			
			session.save(creds);
			
			session.getTransaction().commit();
			
			
			
			
		}finally{
			session.close();
			factory.close();
		}
		
		return true;
	}

}
*/