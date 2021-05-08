package com.example.note.dto;

import com.example.note.utils.Type;

import java.util.Date;

public class NoteForm {

    private String title;

    private Type type;

    private String content;

    private String key;

    private Date creationDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "NoteForm{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", key='" + key + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

}
