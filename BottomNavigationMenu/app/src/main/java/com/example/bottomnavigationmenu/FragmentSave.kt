package com.example.bottomnavigationmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class FragmentSave : Fragment() {
    val HOMEPAGE_URL="https://www.instagram.com/explore/"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_home, container, false)
        view.webViewSettings.settings.javaScriptEnabled=true
        view.webViewSettings.loadUrl(HOMEPAGE_URL)
        view.webViewSettings.webViewClient=object: WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {
                progressBar3.visibility=View.INVISIBLE
                super.onPageFinished(view, url)
            }
        }
        return view
    }
}