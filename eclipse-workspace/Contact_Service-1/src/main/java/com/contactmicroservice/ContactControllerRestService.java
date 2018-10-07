package com.contactmicroservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactControllerRestService {

	@Autowired
	private IContactRepository contactRepository;
	
	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	public List<Contact> getContacts(){
		return contactRepository.findAll();
	}
		
	@RequestMapping(value="/contacts{id}",method=RequestMethod.GET)
	public List<Contact> getContacts(@PathVariable Long id){
		return contactRepository.findAll();
	}
	
	@RequestMapping(value="/cherchercontact",method=RequestMethod.GET)
	public List<Contact> Chercher (
	@RequestParam (name="mc", defaultValue="") String mc,
	@RequestParam (name="page", defaultValue="")int page,
	@RequestParam (name="size", defaultValue="")int size){
		return contactRepository.findAll();
	}
	
	@RequestMapping(value="/contacts",method=RequestMethod.POST)
	public Contact  Ajouter (@RequestBody Contact c ){
		return contactRepository.save(c);
    }
	
	@RequestMapping(value="/contacts",method=RequestMethod.DELETE)
	public boolean  Supprimer (@PathVariable Long id ){
		 contactRepository.deleteAll();
		 return true;
    }
}
