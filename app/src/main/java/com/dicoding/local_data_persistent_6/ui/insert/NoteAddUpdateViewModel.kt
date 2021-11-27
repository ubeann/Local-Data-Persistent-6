package com.dicoding.local_data_persistent_6.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.dicoding.local_data_persistent_6.database.Note
import com.dicoding.local_data_persistent_6.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application) : ViewModel() {
    // Setup variable
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note) {
        mNoteRepository.insert(note)
    }

    fun update(note: Note) {
        mNoteRepository.update(note)
    }

    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }
}