package base.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import base.PasswordUtil;
import base.components.BiactivaEx;

@Entity
public class User extends GenericEntity{

  

  private String nombre;
  private String apellido;
  private String telefono;
  private String username;
  private String password;
  private String email;
  
@Override
public String toString() {
	return nombre+"-"+apellido;
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



@PrePersist
@PreUpdate
public void verifyAttributes() throws BiactivaEx {
	if(this.username==null)
		throw new BiactivaEx("El campo username es obligatorio", "El campo username es obligatorio", 400);
	this.password=PasswordUtil.generateSecurePassword(this.password);
}
public void setEmail(String email) {
	this.email=email;
}
  
  
}