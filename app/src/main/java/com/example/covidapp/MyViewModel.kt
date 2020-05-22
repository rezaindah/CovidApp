package com.example.covidapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.covidapp.repos.RemoteRepository
import com.example.covidapp.network.data.Country

class MyViewModel : ViewModel() {

    fun callAPI() : MutableLiveData<Country>
    {
        return RemoteRepository().callAPI()
    }
}