package com.example.notes.note;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notes.file.File;

@Service
public class NoteService {

  @Autowired
  NoteRepository noteRepository;

  /**
   * Creamos una nota en la BBDD
   * @param note
   * @return Note
   */
  Note createNote(Note note) {
	  return noteRepository.save(note);
  }
  
  /**
   * Borramos una nota de la BBDD por ID
   * @param id
   */
  void deleteById(Long id) {
	  noteRepository.deleteById(id);
  }
  
  /**
   * Busca todas las notas que hay asociadas a un usuario en la BBDD
   * @param userId
   * @return List<Note>
   */
  List<Note> getNotesByUserId(Long userId) {
	  return noteRepository.findAllByUserId(userId);
  }
  
  /**
   * obtiene la nota asociada a una id
   * @param userId
   * @return List<Note>
   */
  public Optional<Note> getNoteById(Long id) {
    return noteRepository.findById(id);
  }
  
  /**
   * Busca una nota por URL en la BBDD
   * @param URL
   * @return
   */
  Optional<Note> getNoteByURL(String url) {
	    return noteRepository.findByURL(url);
	  }
  
  /**
   * Busca una nota que contenga parte del titulo que se le envia
   * @param nota
   * @return Note
   */
  Optional<Note> getNoteByUserIDAndTile(Long userId, String text) {
	    return noteRepository.findByUserIdAndTitleContaining(userId, text);
	  }
  
  /**
   * Busca una nota que contenga parte del texto que se le envia
   * @param nota
   * @return Note
   */
  Optional<Note> getNoteByUserIDAndText(Long userId, String text) {
	    return noteRepository.findByUserIdAndTextContaining(userId, text);
	  }
  
  /**
   * Modifica un nota, se le pasa la nota ya modificada
   * @param note
   * @return
   */
  Note updateNote(Note note) {
	  return noteRepository.save(note);
  }
  
  /**
   * Obtiene una lista de las notas ordenadas por la fecha de creacion de manera ascendente
   * @return List<Note> 
   */
  List<Note> getNotesByUserIdOrderByFechaCreacionAsc(Long userId) {
	  return noteRepository.findAllByUserIdOrderByFechaCreacionAsc(userId);
  }
 
  /**
   * Obtiene una lista de las notas ordenadas por la fecha de creacion de manera descendente
   * @param id
   * @return List<Note>
   */
  List<Note> getNotesByUserIdOrderByFechaCreacionDesc(Long userId) {
	  return noteRepository.findAllByUserIdOrderByFechaCreacionDesc(userId);
  }
  
  /**
   * obtiene una lista de las notas que han sido modificadas
   * @param id
   * @return List<Note>
   */
  List<Note> getNotasModificadas(Long userId) {
	  return noteRepository.findAllByUserIdAndfechaModificacionNotNull(userId);
  }
  
  /**
   * Obtiene una lista de las notas modificadas ordenadas de manera ascendente
   * @param id
   * @return List<Note>
   */
  List<Note> getNotesByUserIdOrderByFechaModificacionAsc(Long userId) {
	  return noteRepository.findAllByUserIdOrderByfechaModificacionnAsc(userId);
  }
 
  /**
   * Obtiene una lista de las notas modificadas ordenadas de manera descendente
   * @param id
   * @return List<Note>
   */
  List<Note> getNotesByUserIdOrderByFechaModificacionDesc(Long userId) {
	  return noteRepository.findAllByUserIdOrderByfechaModificacionDesc(userId);
  }
  
  /**
   * Devuelve todos los textos por id
   * @param id
   * @param categoria
   * @return
   */
  List<Note> getAllTextByUserId(Long userId) {
	  return noteRepository.findAllTextByUserId(userId);
  }
  /**
   * Devuelve todas las notas de voz por id
   * @param userId
   * @return
   */
  List<Note> getAllVoiceNoteByUserId(Long userId) {
	  return noteRepository.findAllVoiceNotByUserId(userId);
  }
  
  /**
   * Obtiene una lista de las notas ordenadas por la fecha de creacion de manera ascendente
   * @return List<Note> 
   */
  List<Note> getNotesByUserIdOrderByTitleAsc(Long userId) {
	  return noteRepository.findAllByUserIdOrderByTitleAsc(userId);
  }
 
  /**
   * Obtiene una lista de las notas ordenadas por la fecha de creacion de manera descendente
   * @param id
   * @return List<Note>
   */
  List<Note> getNotesByUserIdOrderByTitleDesc(Long userId) {
	  return noteRepository.findAllByUserIdOrderByTitleDesc(userId);
  }
}
