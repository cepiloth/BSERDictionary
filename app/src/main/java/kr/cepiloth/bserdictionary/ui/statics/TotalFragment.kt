package kr.cepiloth.bserdictionary.ui.statics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kr.cepiloth.bserdictionary.R

class TotalFragment : Fragment() {

    private lateinit var totalViewModel: TotalViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        totalViewModel =
                ViewModelProvider(this).get(TotalViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_total, container, false)
        val textView: TextView = root.findViewById(R.id.text_total)
        totalViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}