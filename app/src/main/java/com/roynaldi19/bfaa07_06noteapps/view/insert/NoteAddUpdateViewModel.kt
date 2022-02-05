package com.roynaldi19.bfaa07_06noteapps.view.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.roynaldi19.bfaa07_06noteapps.database.Note
import com.roynaldi19.bfaa07_06noteapps.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application) : ViewModel() {
    private val noteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note) {
        noteRepository.insert(note)
    }

    fun update(note: Note) {
        noteRepository.update(note)
    }

    fun delete(note: Note){
        noteRepository.delete(note)
    }
}