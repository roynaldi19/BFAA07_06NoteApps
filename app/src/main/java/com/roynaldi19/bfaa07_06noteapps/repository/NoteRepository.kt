package com.roynaldi19.bfaa07_06noteapps.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.roynaldi19.bfaa07_06noteapps.database.Note
import com.roynaldi19.bfaa07_06noteapps.database.NoteDao
import com.roynaldi19.bfaa07_06noteapps.database.NoteRoomDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class NoteRepository(application: Application) {
    private val notesDao: NoteDao
    private val executorService: ExecutorService = Executors.newSingleThreadExecutor()

    init {
        val db = NoteRoomDatabase.getDatabase(application)
        notesDao = db.noteDao()
    }

    fun getAllNotes(): LiveData<List<Note>> = notesDao.getAllNotes()

    fun  insert(note: Note) {
        executorService.execute{ notesDao.insert(note)}
    }

    fun delete(note: Note) {
        executorService.execute{ notesDao.delete(note)}
    }

    fun update(note: Note) {
        executorService.execute{notesDao.update(note)}
    }
}