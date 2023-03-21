package com.example.notes.file;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<File, Long> {

	/**
	 * Busca todos los files que tiene una nota
	 * @param noteId
	 * @return
	 */
	public List<File> findAllbyNoteId(Long noteId);

	/**
	 * Busca un file por id
	 */
	Optional<File> findById(Long id);

}
