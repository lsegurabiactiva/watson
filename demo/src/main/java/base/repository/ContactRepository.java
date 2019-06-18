package base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import base.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
