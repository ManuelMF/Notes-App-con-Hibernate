package com.example.notes.note;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.notes.file.File;
import com.example.notes.user.User;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {

	 /**
	   * Busca todas las notas que hay asociadas a un usuario en la BBDD
	   * @param userId
	   * @return List<Note>
	   */
	public List<Note> findAllByUserId(Long userId);
	
	/**
	   * Busca una nota por URL en la BBDD
	   * @param URL
	   * @return
	   */
	Optional<Note> findByURL(String url);
	
	 /**
	   * Busca una nota por id
	   * @param userId
	   * @return List<Note>
	   */
	Optional<Note> findById(Long id);
	
	/**
	   * Busca una nota que contenga parte del titulo que se le envia
	   * @param nota
	   * @return Note
	   */
	Optional<Note> findByUserIdAndTitleContaining(Long id, String title);
	
	/**
	   * Busca una nota que contenga parte del texto que se le envia
	   * @param nota
	   * @return Note
	   */
	Optional<Note> findByUserIdAndTextContaining(Long id, String text);
	
	/**
	   * Obtiene una lista de las notas ordenadas por la fecha de creacion de manera ascendente
	   * @return List<Note> 
	   */
	public List<Note> findAllByUserIdOrderByFechaCreacionAsc(Long userId);
	
	/**
	   * Obtiene una lista de las notas ordenadas por la fecha de creacion de manera descendente
	   * @param id
	   * @return List<Note>
	   */
	public List<Note> findAllByUserIdOrderByFechaCreacionDesc(Long userId);
	
	/**
	   * obtiene una lista de las notas que han sido modificadas
	   * @param id
	   * @return List<Note>
	   */
	public List<Note> findAllByUserIdAndfechaModificacionNotNull(Long userId);
	
	/**
	   * Obtiene una lista de las notas modificadas ordenadas de manera ascendente
	   * @param id
	   * @return List<Note>
	   */
	public List<Note> findAllByUserIdOrderByfechaModificacionnAsc(Long userId);

	  /**
	   * Obtiene una lista de las notas modificadas ordenadas de manera descendente
	   * @param id
	   * @return List<Note>
	   */
	public List<Note> findAllByUserIdOrderByfechaModificacionDesc(Long userId);
	
	/**
	  * Devuelve una lista de notas que tengan una categoria especifica
	  * @param id
	  * @param categoria
	  * @return
	  */
	public List<Note> findAllByUserIdAndCategoria(Long userId, String categoria);

	/**
	 * Obtener las notas de texto por id de usuario
	 * @param userId
	 * @return
	 */
	public List<Note> findAllTextByUserId(Long userId);
	
	/**
	 * Obtener las notas de voz por id de usuario
	 * @param userId
	 * @return
	 */
	public List<Note> findAllVoiceNotByUserId(Long userId);
	
	/**
	   * Obtiene una lista de las notas ordenadas por el titulo de manera ascendente
	   * @return List<Note> 
	   */
	public List<Note> findAllByUserIdOrderByTitleAsc(Long userId);
	
	/**
	   * Obtiene una lista de las notas ordenadas por el titulo de manera descendente
	   * @param id
	   * @return List<Note>
	   */
	public List<Note> findAllByUserIdOrderByTitleDesc(Long userId);
}
