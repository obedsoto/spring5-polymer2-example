package org.obed.example.spring5polymer2example.controllers;

import org.obed.example.spring5polymer2example.models.ApiResponse;
import org.obed.example.spring5polymer2example.models.Note;
import org.obed.example.spring5polymer2example.services.NoteService;
import org.obed.example.spring5polymer2example.utils.Constants;
import org.obed.example.spring5polymer2example.utils.Endpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

/**
 * Created by obed on 3/27/18.
 */
@RestController
@RequestMapping(value = Endpoints.NOTES)
public class NoteController {

    private NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {

        // Dependency managed by Spring
        Assert.notNull(noteService, "Note Service must not be null");
        this.noteService = noteService;
    }

    @RequestMapping(value = Endpoints.POST_NOTE, method = RequestMethod.POST)
    public ResponseEntity post(@RequestBody Note note) {

        ApiResponse apiResponse = this.noteService.add(note);

        return new ResponseEntity<>(apiResponse, apiResponse.isSuccess()?HttpStatus.OK:HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @RequestMapping(value = Endpoints.GET_NOTE, method = RequestMethod.GET)
    public ResponseEntity get(@PathVariable(Constants.NOTE_ID) Long noteId) {

        ApiResponse apiResponse = this.noteService.get(noteId);

        return new ResponseEntity<>(apiResponse, apiResponse.isSuccess()?HttpStatus.OK:HttpStatus.UNPROCESSABLE_ENTITY);
    }


    @RequestMapping(value = Endpoints.GET_ALL_NOTES, method = RequestMethod.GET)
    public ResponseEntity getAll() {

        ApiResponse apiResponse = this.noteService.getAll();

        return new ResponseEntity<>(apiResponse, apiResponse.isSuccess()?HttpStatus.OK:HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
