package com.picasso.loadview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
/**
 * Created by kangaroo on 2017-2-16.
 * 测试的例子。
 */

public class SampleActivity extends AppCompatActivity {

    private LoadingPager load_view;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        load_view= (LoadingPager) findViewById(R.id.load_view);
        load_view.setFreshListener(new LoadingPager.RefreshListener() {
            @Override
            public void refresh() {

                load_view.setState(0);
                runChange();
            }
        });
        runChange();
       /* try{
            test();
        }catch (URISyntaxException e){
            e.printStackTrace();
        }*/
        try {
            testUrl();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        //
        testInputStream();
    }
    private void testInputStream() {
    }

    private void testUrl() throws MalformedURLException,IOException{

        URL jj=new URL("http://www.baidu.com");

        URLConnection con= jj.openConnection();
        con.setDoInput(true);
        con.setDoOutput(true);
        con.setIfModifiedSince(19999999);
        con.setUseCaches(true);
        con.setAllowUserInteraction(true);
        con.setRequestProperty("key","value");
        con.setConnectTimeout(1000);
        con.setReadTimeout(1000);
        con.connect();//连接。
        con.getHeaderField(100);
        con.getContent();
        con.getContentType();
        con.getContentLength();
        con.getContentEncoding();
        con.getDate();
        con.getExpiration();
        con.getLastModified();
        con.getInputStream();// jj.openStream(); 相同。

        con.setIfModifiedSince(1000);


    }

    /**
     * 知识点测试。
     */
    private void test() throws URISyntaxException{
        URI hh=new URI("http://www.baidu.com");

        Log.i("uri---","getScheme--"+hh.getScheme());
        Log.i("uri---","getSchemeSpecificPart--"+hh.getSchemeSpecificPart());
        Log.i("uri---","getRawSchemeSpecificPart--"+hh.getRawSchemeSpecificPart());
        Log.i("uri---","getAuthority--"+hh.getAuthority());
        Log.i("uri---","getRawAuthority--"+hh.getRawAuthority());
        Log.i("uri---","getUserInfo--"+hh.getUserInfo());

        Log.i("uri---","getRawUserInfo--"+hh.getRawUserInfo());

        Log.i("uri---","getHost--"+hh.getHost());
        Log.i("uri---","getPort--"+hh.getPort());
        Log.i("uri---","getPath--"+hh.getPath());
        Log.i("uri---","getQuery--"+hh.getQuery());
        Log.i("uri---","getFragment--"+hh.getFragment());

    }
    private void runChange() {

        new Handler().postDelayed(new Runnable(){

            public void run() {
                //execute the task
                load_view.setState(4);
                load_view.setCompleteImageResources(R.mipmap.no_message_icon);
                load_view.setCompleteTexHint("呜呜~~您暂时还没有消息哦~");
            }
        }, 1000);

    }
}
