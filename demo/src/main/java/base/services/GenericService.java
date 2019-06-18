package base.services;

import java.util.Collection;
import java.util.function.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;

import base.entities.GenericEntity;

public abstract class GenericService<E extends GenericEntity> {
	
	protected abstract JpaRepository<E,Long> getJpaRepository();
	
	public E save(E entity) {
		return getJpaRepository().save(entity);
    }
 
    public Collection<E> getAll() {
        return getJpaRepository().findAll();
    }
 
    public E findById(Long id) throws Exception {
        return getJpaRepository().findById(id).orElseThrow(()-> new Exception("No se encontro el registro con id: "+id));
    }	
    
    public void deleteById(Long id) {
    	getJpaRepository().deleteById(id);
    }	

    public E update(E entity, Long id) throws Exception {
    	this.findById(id);
    	entity.setId(id);
    	return this.save(entity);
    }	

}
