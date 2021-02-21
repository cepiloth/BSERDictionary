package kr.cepiloth.bserdictionary.ui.addon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kr.cepiloth.bserdictionary.R

class AddonFragment : Fragment() {

    private lateinit var addonViewModel: AddonViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        addonViewModel =
                ViewModelProvider(this).get(AddonViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_addon, container, false)
        val textView: TextView = root.findViewById(R.id.text_addon)
        addonViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}