package com.example.note.functions;

import com.example.note.dto.NoIdNoteDTO;
import com.example.note.dto.NoKeyWordNoteDTO;
import com.example.note.dto.NoteDTO;
import com.example.note.entities.NoteEntity;

import java.util.function.Function;

public class NoteFunctions {

    public static final Function<NoteEntity, NoteDTO> noteEntityToNoteDTO = noteEntity -> new NoteDTO(
            noteEntity.getId(),
            noteEntity.getTitle(),
            noteEntity.getType(),
            noteEntity.getContent(),
            noteEntity.getKeyWord(),
            noteEntity.getCreated()
    );

    public static final Function<NoteDTO, NoteEntity> noteDTOToNoteEntity = noteDTO -> new NoteEntity(
            noteDTO.getId(),
            noteDTO.getTitle(),
            noteDTO.getType(),
            noteDTO.getContent(),
            noteDTO.getKeyWord(),
            noteDTO.getCreated()
    );

    public static final Function<NoteEntity, NoKeyWordNoteDTO> noteEntityToNoKeyWordNoteDTO = noteEntity -> new NoKeyWordNoteDTO(
            noteEntity.getId(),
            noteEntity.getTitle(),
            noteEntity.getType(),
            noteEntity.getContent(),
            noteEntity.getCreated()
    );


    public static final Function<NoteEntity, NoIdNoteDTO> noteEntityToIdNoteDTO = noteEntity -> new NoIdNoteDTO(
            noteEntity.getTitle(),
            noteEntity.getType(),
            noteEntity.getContent(),
            noteEntity.getKeyWord(),
            noteEntity.getCreated()
    );

}
