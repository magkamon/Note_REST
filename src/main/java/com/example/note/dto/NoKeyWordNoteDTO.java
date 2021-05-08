package com.example.note.dto;

import com.example.note.utils.NoteType;

import java.time.LocalDate;
import java.util.UUID;

public class NoKeyWordNoteDTO {

    private UUID id;

    private String title;

    private NoteType noteType;

    private String content;

    private LocalDate created;

    public NoKeyWordNoteDTO(UUID id, String title, NoteType noteType, String content, LocalDate created) {
        this.id = id;
        this.title = title;
        this.noteType = noteType;
        this.content = content;
        this.created = created;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
