package org.obed.example.spring5polymer2example.business;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.obed.example.spring5polymer2example.models.ApiResponse;
import org.obed.example.spring5polymer2example.models.Note;
import org.obed.example.spring5polymer2example.repositories.NoteRepository;
import org.obed.example.spring5polymer2example.utils.Constants;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by obed on 3/28/18.
 */
public class NoteBOImpTest {

    private NoteBO noteBO;

    @Mock
    private NoteRepository noteRepository;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        this.noteBO = new NoteBOImp(this.noteRepository);
    }

    @Test
    public void add() throws Exception {

        Note note = new Note(null, "Foo content", new Date());

        Mockito.when(this.noteRepository.save(note)).thenReturn(note);

        ApiResponse<Note> response = this.noteBO.add(note);

        assertEquals(response.getContent().getAuthor(), Constants.ANONYMOUS);
    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void getAll() throws Exception {

    }

}