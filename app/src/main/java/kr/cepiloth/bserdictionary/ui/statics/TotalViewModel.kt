package kr.cepiloth.bserdictionary.ui.statics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Total Fragment"
    }
    val text: LiveData<String> = _text
}