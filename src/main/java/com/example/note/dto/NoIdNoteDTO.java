package com.example.note.dto;

import com.example.note.utils.NoteType;

import java.time.LocalDate;

public class NoIdNoteDTO {

    private String title;

    private NoteType noteType;

    private String content;

    private String keyWord;

    private LocalDate created;

    public NoIdNoteDTO() {
    }

    public NoIdNoteDTO(String title, NoteType noteType, String content, String keyWord, LocalDate created) {
        this.title = title;
        this.noteType = noteType;
        this.content = content;
        this.keyWord = keyWord;
        this.created = created;
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

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
