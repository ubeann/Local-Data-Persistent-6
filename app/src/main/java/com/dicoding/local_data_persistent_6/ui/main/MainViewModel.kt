package com.dicoding.local_data_persistent_6.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.local_data_persistent_6.database.Note
import com.dicoding.local_data_persistent_6.repository.NoteRepository

class MainViewModel(application: Application) : ViewModel() {
    // Setup variable
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}