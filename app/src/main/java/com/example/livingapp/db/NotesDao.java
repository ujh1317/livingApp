package com.example.livingapp.db;

import androidx.room.Dao;

import com.example.livingapp.model.Note;

@Dao
public interface NotesDao {

    void insertNote(Note note);
    void deleteNote(Note note);

}
