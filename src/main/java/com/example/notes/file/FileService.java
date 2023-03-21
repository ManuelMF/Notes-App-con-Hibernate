package com.example.notes.file;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {

  @Autowired
  FileRepository fileRepository;

  /**
   * Crea un file
   * @param file
   * @return
   */
  File createFile(File file) {
    return fileRepository.save(file);
  }

  /**
   * Actualiza un file
   * @param file
   * @return
   */
  File updateFile(File file) {
	  return fileRepository.save(file);
  }
  
  /**
   * Borramos un file por id
   * @param id
   */
  void deleteById(Long id) {
	  fileRepository.deleteById(id);
  }

  /**
   * Obtenemos los Files que esten asociados a un noteID
   * @param noteId
   * @return
   */
  List<File> getFilesByNoteId(Long noteId) {
	  return fileRepository.findAllbyNoteId(noteId);
  }
  
  /**
   * Obtenemos un File con el id que le pasemos
   * @param id
   * @return
   */
  Optional<File> getFileById(Long id) {
    return fileRepository.findById(id);
  }
}
