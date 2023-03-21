package com.example.notes.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notes.note.Note;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  /**
   * crea un usuario en la BBDD
   * @param user
   * @return user
   */
  User createUser(User user) {
	  return userRepository.save(user);
  }
  
  /**
   * Busca un usuario por id
   * @param Long id
   * @return Optional<User> 
   */
  public Optional<User> getUserById(Long id) {
	  return userRepository.findById(id);
  }
  
  /**
   * Busca un usuario por nombre
   * @param String username
   * @return Optional<User> 
   */
  public Optional<User> getUserByUsername(String user) {
	  return userRepository.findByUsername(user);
  }
  
  /**
   * Borra un usuario por id
   * @param Long id
   * @return Optional<User> 
   */
  void deleteById(Long id) {
	  userRepository.deleteById(id);
  }
  
  /**
   * actualiza un usuario en la BBDD
   * @param user
   * @return user
   */
  User updateUser(User user) {
	  return userRepository.save(user);
  }
  
}
