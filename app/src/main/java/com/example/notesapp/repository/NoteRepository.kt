package com.example.notesapp.repository

import androidx.lifecycle.LiveData
import com.example.notesapp.database.NoteDatabase
import com.example.notesapp.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes(): LiveData<List<Note>> = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?): LiveData<List<Note>> = db.getNoteDao().searchNote(query)

}