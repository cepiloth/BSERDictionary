package kr.cepiloth.bserdictionary.ui.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kr.cepiloth.bserdictionary.R

class InfoFragment : Fragment() {

    private lateinit var infoViewModel: InfoViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        infoViewModel =
                ViewModelProvider(this).get(InfoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_information, container, false)
        val textView: TextView = root.findViewById(R.id.text_info)
        infoViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        var view = root.findViewById<WebView>(R.id.info_webview)
        view.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        // https://developer.android.com/guide/webapps/webview?hl=ko
        view.settings.javaScriptEnabled = true
        view.webViewClient = WebViewClient()

        view.loadUrl("https://playeternalreturn.com/ko/category/patch-notes-kr/");

        return root
    }

}