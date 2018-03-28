package org.obed.example.spring5polymer2example.business;

import org.obed.example.spring5polymer2example.models.ApiResponse;
import org.obed.example.spring5polymer2example.models.Note;
import org.obed.example.spring5polymer2example.repositories.NoteRepository;
import org.obed.example.spring5polymer2example.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * Created by obed on 3/27/18.
 */
@Component
public class NoteBOImp implements NoteBO{

    private NoteRepository noteRepository;

    @Autowired
    public NoteBOImp(NoteRepository noteRepository) {
        Assert.notNull(noteRepository, "Note Repository cannot be null");
        this.noteRepository = noteRepository;
    }

    @Override
    public ApiResponse<Note> add(Note note) {

        if (note.getAuthor() == null || note.getAuthor().isEmpty()) {
            note.setAuthor(Constants.ANONYMOUS);
        }
        note.setCreationDate(new Date());

        return new ApiResponse<>(true, this.noteRepository.save(note), "Note saved successfully");
    }

    @Override
    public ApiResponse<Note> get(Long noteId) {

        Note note = this.noteRepository.findOneById(noteId);

        if (note == null) {

            return new ApiResponse<>(false, note, "The note with id " + noteId + " was not found!");
        }

        return new ApiResponse<>(true, note, "Success");
    }

    @Override
    public ApiResponse<List<Note>> getAll() {

        return new ApiResponse<>(true, this.noteRepository.findAll(), "Success");
    }
}
