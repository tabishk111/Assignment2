package com.example.assignment2

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.assignment2.models.Tractor
import com.example.assignment2.repository.TractorRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(app: Application, val tractorRepository: TractorRepository) : AndroidViewModel(app) {

    val newDetails: MutableLiveData<Response<Tractor>> = MutableLiveData()
    fun pushPost() {
        viewModelScope.launch {
            val response = tractorRepository.getDetails()
            newDetails.value = response
        }
    }
}
