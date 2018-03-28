package org.obed.example.spring5polymer2example.services;

import org.obed.example.spring5polymer2example.business.NoteBO;
import org.obed.example.spring5polymer2example.models.ApiResponse;
import org.obed.example.spring5polymer2example.models.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by obed on 3/27/18.
 */
@Service
public class NoteService {

    private NoteBO noteBO;

    @Autowired
    public NoteService(NoteBO noteBO) {
        Assert.notNull(noteBO, "Note Business Object cannot be null");
        this.noteBO = noteBO;
    }

    public ApiResponse<Note> add(Note note) {

        return this.noteBO.add(note);
    }

    public ApiResponse<Note> get(Long noteId) {

        return this.noteBO.get(noteId);
    }

    public ApiResponse<List<Note>> getAll() {
        return this.noteBO.getAll();
    }
}
