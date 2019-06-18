package base.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import base.entities.User;
import base.repository.UserRepository;

@Component(value = "todoService")
public class UserService extends GenericService<User>{
 
    @Autowired
    private UserRepository rep;
    
    public UserService(){
    }

    protected JpaRepository<User, Long> getJpaRepository() {
    	return this.rep;
    }

 
 

}