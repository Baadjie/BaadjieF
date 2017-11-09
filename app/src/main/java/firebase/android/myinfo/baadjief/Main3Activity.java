package firebase.android.myinfo.baadjief;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {


    private WebView browser,browser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        browser = (WebView)findViewById(R.id.webView1);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/customer/index.html");

        browser2 = (WebView)findViewById(R.id.webView2);
        browser2.getSettings().setJavaScriptEnabled(true);
        browser2.loadUrl("file:///android_asset/customer/index.html");

    }
}
