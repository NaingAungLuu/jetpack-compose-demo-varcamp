package me.naingaungluu.jetpackcomposedemo.ui.screens.webView

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidViewBinding
import me.naingaungluu.jetpackcomposedemo.databinding.FragmentWebViewBinding

@Composable
fun WebViewScreen() {
    AndroidViewBinding(
        factory = { inflater, container, attachToRoot ->
            FragmentWebViewBinding.inflate(inflater, container, attachToRoot)
        }
    ) {
        webView.loadUrl(WebViewFragment.GOOGLE_URL)
    }
}