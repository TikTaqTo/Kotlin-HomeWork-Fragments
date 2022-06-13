package com.example.fragmentshomework.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Тут должно быть главное меню"
    }
    val text: LiveData<String> = _text
}