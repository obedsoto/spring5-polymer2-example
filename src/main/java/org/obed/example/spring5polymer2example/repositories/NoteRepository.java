package org.obed.example.spring5polymer2example.repositories;

import org.obed.example.spring5polymer2example.models.Note;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by obed on 3/27/18.
 */

public interface NoteRepository extends CrudRepository<Note, Long> {

    Note findOneById(Long noteId);

    List<Note> findAll();
}
