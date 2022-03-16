package com.example.bottomnav_09

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ProfileViewModel {
    private val _text = MutableLiveData<String>().apply {
        value = "This is profile Fragment"
    }
    val text: LiveData<String> = _text
}