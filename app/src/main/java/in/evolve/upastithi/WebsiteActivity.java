package in.evolve.upastithi;


import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class WebsiteActivity extends AppCompatActivity {
    private WebView webView;
    private TextView appName;
    private ProgressBar progressBar;
    private LinearLayout splashScreen;
    private AlertDialog.Builder alertDialog;
    private SwipeRefreshLayout swipe;


    private String RETRY_URL = "http://upastithi.herokuapp.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        splashScreen = (LinearLayout) findViewById(R.id.splash_layout);
        progressBar = (ProgressBar) findViewById(R.id.web_view_progress_bar);
        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe_layout);


        appName = (TextView) findViewById(R.id.app_name);
        appName.setTypeface(Typeface.createFromAsset(WebsiteActivity.this.getAssets(),"Xipital -BRK-.ttf"));

        webView= (WebView) findViewById(R.id.website_webview);
        webView.getSettings().setJavaScriptEnabled(true);

        alertDialog = new AlertDialog.Builder(WebsiteActivity.this)
                .setMessage("There Is Some Error Try Again")
                .setCancelable(false)
                .setPositiveButton("RETRY", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(isNetworkStatusAvialable(getApplicationContext())) {
                            webView.setWebViewClient(new CustomWebViewClient());
                            webView.canGoBack();
                            webView.loadUrl(RETRY_URL);
                        }
                        else{
                            alertDialog.setMessage("Internet is not Available");
                            progressBar.setVisibility(View.INVISIBLE);
                            alertDialog.show();
                        }
                    }
                });

        if(isNetworkStatusAvialable(getApplicationContext())) {
            webView.setWebViewClient(new CustomWebViewClient());
            webView.canGoBack();
            webView.loadUrl(RETRY_URL);
        }
        else{
            alertDialog.setMessage("Internet is not Available");
            progressBar.setVisibility(View.INVISIBLE);
            alertDialog.show();
        }

        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipe.setRefreshing(true);
                webView.loadUrl(RETRY_URL);
            }
        });

    }

    public static boolean isNetworkStatusAvialable (Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)   context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null)
        {
            NetworkInfo netInfos = connectivityManager.getActiveNetworkInfo();
            if(netInfos != null)
                if(netInfos.isConnected())
                    return true;
        }
        return false;
    }

    protected class CustomWebViewClient extends WebViewClient{

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            RETRY_URL = url;
            progressBar.setVisibility(View.VISIBLE);
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            swipe.setRefreshing(false);
            splashScreen.setVisibility(View.GONE);
            webView.setVisibility(View.VISIBLE);
            RETRY_URL = url;
            progressBar.setVisibility(View.INVISIBLE);
            super.onPageFinished(view, url);
        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            alertDialog.setMessage(error.getDescription());
            alertDialog.show();
            progressBar.setVisibility(View.INVISIBLE);
            super.onReceivedError(view, request, error);

        }

        @Override
        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
            alertDialog.setMessage(errorResponse.getReasonPhrase());
            alertDialog.show();
            progressBar.setVisibility(View.INVISIBLE);
            super.onReceivedHttpError(view, request, errorResponse);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                if(webView.canGoBack()){
                    webView.goBack();
                    if(!webView.canGoBack()){
                        //getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }


    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
            if (webView.canGoBack()){
                //getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            }
        }
        else {
            super.onBackPressed();
        }
    }
}
