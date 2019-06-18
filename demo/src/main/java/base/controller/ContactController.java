package base.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import base.entities.Contact;
import base.repository.ContactRepository;

@RestController
@RequestMapping({"/contacts"})
public class ContactController {

  private ContactRepository repository;

  ContactController(ContactRepository contactRepository) {
      this.repository = contactRepository;
  }

  @GetMapping
  public List<Contact> findAll(){
    return repository.findAll();
  }
  
  @PostMapping
  public Contact create(@RequestBody Contact contact){
	  System.out.println(contact);
      return repository.save(contact);
  }

}
