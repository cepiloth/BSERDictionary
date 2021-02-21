package kr.cepiloth.bserdictionary.ui.broadcast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BroadcastViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Broadcast Fragment"
    }
    val text: LiveData<String> = _text
}