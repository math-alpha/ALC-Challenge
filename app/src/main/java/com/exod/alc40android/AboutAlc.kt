package com.exod.alc40android

import android.net.http.SslError
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.ClientCertRequest
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.content_about_alc.*

import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutAlc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)
        setSupportActionBar(toolbar)

        webView.loadUrl("https://google.com")
        webView.webViewClient = WebViewClient().onReceivedClientCertRequest(WebView webView, ClientCertRequest request)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
