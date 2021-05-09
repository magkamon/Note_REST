package com.example.note.controller;

import com.example.note.dto.*;
import com.example.note.errors.NoteNotFoundException;
import com.example.note.service.NoteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/add")
    public IdDTO saveNote(@Valid @RequestBody NoteDTO noteDTO) {
        noteDTO.setCreated(LocalDate.now());
        return noteService.saveNote(noteDTO);
    }

    @PostMapping("/list")
    public List<NoKeyWordNoteDTO> findByKeyWord(@RequestBody KeyWordDTO keyWord) {
        return noteService.findByKeyWord(keyWord);
    }

    @PostMapping("/get")
    public NoIdNoteDTO findById(@RequestBody IdDTO idDTO) throws NoteNotFoundException {
        return noteService.findById(idDTO);
    }
}
