package com.trota.saleshandbook.ui.more

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MoreViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is More Fragment"
    }
    val text: LiveData<String> = _text
}