package base;

import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import base.entities.Contact;
import base.entities.User;
import base.repository.ContactRepository;
import base.repository.UserRepository;
import base.services.UserService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserService repository) {
		return args -> {
			User c = new User();
			c.setApellido("AAAAAAAAAAAAAAAAA");
			c.setEmail("contact@email.com");
			c.setTelefono("(111) 111-1111");
			c.setUsername("lsegura");
			c.setPassword("123456");
			repository.save(c);			
			System.out.println(repository.findById(new Long(2)));
		
		};
	}

}
