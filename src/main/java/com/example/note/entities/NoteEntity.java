package com.example.note.entities;

import com.example.note.utils.NoteType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class NoteEntity {

    @Id
    @GeneratedValue(generator = "uuid4")
    @GenericGenerator(name = "UUID", strategy = "uuid4")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")
    private UUID id;

    private String title;

    @Enumerated(EnumType.STRING)
    private NoteType noteType;

    private String content;


    private String keyWord;

    private LocalDate created;

    public NoteEntity() {
    }

    public NoteEntity(UUID id, String title, NoteType noteType, String content, String keyWord, LocalDate created) {
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

    public void setKeyWord(String key) {
        this.keyWord = key;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate creationDate) {
        this.created = creationDate;
    }
}
