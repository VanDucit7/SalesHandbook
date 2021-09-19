package com.trota.saleshandbook.ui.come

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class InOutComeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is In Out Come Fragment"
    }
    val text: LiveData<String> = _text
}