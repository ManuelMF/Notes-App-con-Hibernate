package com.example.notes.user;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	 /**
	   * Busca un usuario por id
	   * @param id
	   * @return Optional<User> 
	   */
	Optional<User> findById(Long id);
	
	 /**
	   * Busca un usuario por nombre
	   * @param username
	   * @return Optional<User> 
	   */
	Optional<User> findByUsername(String username);
	

}
