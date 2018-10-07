package com.contactmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactService1Application implements CommandLineRunner {
	
@Autowired
private IContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactService1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
   contactRepository.save(new Contact("Bassel", "Gaied", "bassel.gaied@sesame.com.tn", "20666553"));
   contactRepository.save(new Contact("Nour", "Gaied", "nour.gaied@sesame.com.tn", "27666553"));
   contactRepository.save(new Contact("Ibtihel", "Gaied", "ibtihel.gaied@sesame.com.tn", "27666557"));
     contactRepository.findAll().forEach(c->{
    	 System.out.println(c.getNom());
    	 System.out.println(c.getPrenom());
     });
	}
}
