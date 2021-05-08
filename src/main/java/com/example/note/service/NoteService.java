package com.example.note.service;

import com.example.note.dto.*;
import com.example.note.entities.NoteEntity;
import com.example.note.repository.NoteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.note.functions.NoteFunctions.*;
import static java.util.stream.Collectors.toList;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Transactional
    public NoteDTO saveNote(NoteDTO noteDTO) {
        NoteEntity noteEntity = noteDTOToNoteEntity.apply(noteDTO);
        return noteEntityToNoteDTO.apply(noteRepository.save(noteEntity));
    }

    public List<NoKeyWordNoteDTO> findByKeyWord(KeyWordDTO keyWord) {
        return noteRepository.findByKeyWord(keyWord.getKeyWord()).stream().map(noteEntityToNoKeyWordNoteDTO).collect(toList());
    }

    public List<NoIdNoteDTO> findById(IdDTO idDTO) {
        return noteRepository.findById(idDTO.getId()).stream().map(noteEntityToIdNoteDTO).collect(toList());
    }

}