package com.vinod.insurance.signup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vinod.insurance.entity.Credential;

@Controller
@SessionAttributes(names="email")
public class SignupController {
	
	@RequestMapping (value="/signup", method =  RequestMethod.GET)
	public String signup(){
		return "signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String saveUserData(@RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("role") String role, ModelMap model){
		
		SessionFactory factory= new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Credential.class)
									.buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		try{
			Credential creds = new Credential(email, password, role);
			
			model.put("email", email);

			// begin transaction
			
			session.beginTransaction();
			
			session.save(creds);
			
			session.getTransaction().commit();
		
		}finally{
			session.close();
			factory.close();
		}
		
		return "welcome";
	}

}
