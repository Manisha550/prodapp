package com.example.prodapp.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.prodapp.Note;

import java.util.List;

@Dao
public interface NoteDao {

    // Insert a new note
    @Insert
    void insert(Note note);

    // Update an existing note
    @Update
    void update(Note note);

    // Delete a specific note
    @Delete
    void delete(Note note);

    // Delete all notes
    @Query("DELETE FROM notes")
    void deleteAllNotes();

    // Fetch all notes in descending order
    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Note> getAllNotes();
}