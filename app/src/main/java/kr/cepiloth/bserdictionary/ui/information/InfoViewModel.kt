package kr.cepiloth.bserdictionary.ui.information

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Game Information Fragment"
    }
    val text: LiveData<String> = _text
}