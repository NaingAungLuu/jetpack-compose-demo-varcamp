package me.naingaungluu.jetpackcomposedemo.ui.screens.webView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import me.naingaungluu.jetpackcomposedemo.databinding.FragmentWebViewBinding

class WebViewFragment : Fragment() {

    private lateinit var binding : FragmentWebViewBinding

    companion object {
        const val GOOGLE_URL = "https://www.google.com/"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWebViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUi()
    }

    private fun setupUi() {
        setupWebView()
    }

    private fun setupWebView() {
        binding.webView.loadUrl(GOOGLE_URL)
    }

}