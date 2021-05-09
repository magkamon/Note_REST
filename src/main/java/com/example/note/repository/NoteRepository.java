package com.example.note.repository;

import com.example.note.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NoteRepository extends JpaRepository<NoteEntity, UUID> {

    @Query(value = "SELECT n FROM NoteEntity n WHERE n.keyWord = :keyWord")
    List<NoteEntity> findByKeyWord(String keyWord);
}
