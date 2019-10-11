package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebViewBasics extends AppCompatActivity {
    private Button openUrl;
    public EditText editUrl;
    private WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_basics);
        openUrl();
    }
    public void openUrl(){
        openUrl =(Button) findViewById(R.id.button_open_url_webViewBasics);
        editUrl =(EditText) findViewById(R.id.url_web_view);
        browser = (WebView) findViewById(R.id.web_view);
        openUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = editUrl.getText().toString();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    browser.getSettings().setMediaPlaybackRequiresUserGesture(false);
                }
                browser.getSettings().setLoadsImagesAutomatically(true);
                browser.getSettings().setJavaScriptEnabled(true);

                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl(url );



            }
        });


    }
}
