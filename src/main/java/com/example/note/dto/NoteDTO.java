package com.example.note.dto;

import com.example.note.utils.NoteType;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

public class NoteDTO {

    private UUID id;

    private String title;

    private NoteType noteType;

    private String content;

    @NotNull
    @Length(min = 3, max = 10)
    private String keyWord;

    private LocalDate created;

    public NoteDTO(UUID id, String title, NoteType noteType, String content, String keyWord, LocalDate created) {
        this.id = id;
        this.title = title;
        this.noteType = noteType;
        this.content = content;
        this.keyWord = keyWord;
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

    public NoteType getType() {
        return noteType;
    }

    public void setType(NoteType noteType) {
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
