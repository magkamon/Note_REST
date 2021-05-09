package com.example.note.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(NoteNotFoundException.class)
    public void handleNoteNotFoundException(HttpServletResponse res) throws IOException {
        res.sendError(HttpStatus.NOT_FOUND.value());
    }
}
