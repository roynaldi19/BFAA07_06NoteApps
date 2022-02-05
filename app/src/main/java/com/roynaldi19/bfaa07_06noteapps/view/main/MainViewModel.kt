package com.roynaldi19.bfaa07_06noteapps.view.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.roynaldi19.bfaa07_06noteapps.database.Note
import com.roynaldi19.bfaa07_06noteapps.repository.NoteRepository

class MainViewModel(application: Application) : ViewModel() {
    private val noteRepository: NoteRepository= NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = noteRepository.getAllNotes()
}