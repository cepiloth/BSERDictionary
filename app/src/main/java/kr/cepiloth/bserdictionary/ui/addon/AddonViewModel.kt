package kr.cepiloth.bserdictionary.ui.addon

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddonViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Addon Fragment"
    }
    val text: LiveData<String> = _text
}