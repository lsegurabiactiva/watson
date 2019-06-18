package base.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import base.entities.Contact;
import base.entities.User;
import base.repository.ContactRepository;
import base.services.UserService;

@RestController
@RequestMapping({"/users"})
public class UserController {

  private UserService service;

  public UserController(UserService service) {
      this.service = service;
  }

  @GetMapping
  public Collection<User> findAll(){
    return this.service.getAll();
  }
  
  @GetMapping(value = "/{id}")
  public User find(@PathVariable Long id) throws Exception{
    return this.service.findById(id);
  }

  @PatchMapping(value = "/{id}")
  public User update(@RequestBody User entity, @PathVariable Long id) throws Exception{
    return this.service.update(entity, id);
  }

  
  @PostMapping
  public User create(@RequestBody User entity){
	  System.out.println(entity);
      return this.service.save(entity);
  }

}
