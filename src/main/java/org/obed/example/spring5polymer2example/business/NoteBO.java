package org.obed.example.spring5polymer2example.business;

import org.obed.example.spring5polymer2example.models.ApiResponse;
import org.obed.example.spring5polymer2example.models.Note;

import java.util.List;

/**
 * Created by obed on 3/27/18.
 */
public interface NoteBO {


    ApiResponse<Note> add(Note note);

    ApiResponse<Note> get(Long noteId);

    ApiResponse<List<Note>> getAll();
}
