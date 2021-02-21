package kr.cepiloth.bserdictionary.ui.broadcast

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

class BroadcastFragment : Fragment() {

    private lateinit var broadcastViewModel: BroadcastViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        broadcastViewModel =
                ViewModelProvider(this).get(BroadcastViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_broadcast, container, false)
        val textView: TextView = root.findViewById(R.id.text_broadcast)
        broadcastViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        var view = root.findViewById<WebView>(R.id.broadcast_webview)
        view.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        // https://developer.android.com/guide/webapps/webview?hl=ko
        view.settings.javaScriptEnabled = true
        view.webViewClient = WebViewClient()

        view.loadUrl("https://www.youtube.com/results?search_query=%EB%B8%94%EB%9E%99%EC%84%9C%EB%B0%94%EC%9D%B4%EB%B2%8C");

        return root
    }
}