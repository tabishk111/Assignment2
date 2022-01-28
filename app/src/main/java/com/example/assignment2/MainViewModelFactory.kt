package com.example.assignment2

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.assignment2.repository.TractorRepository

class MainViewModelProviderFactory(val app: Application, val tractorRepository: TractorRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(app, tractorRepository) as T
    }
}