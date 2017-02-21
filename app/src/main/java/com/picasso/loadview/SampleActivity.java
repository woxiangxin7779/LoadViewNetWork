package com.picasso.loadview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
/**
 * Created by kangaroo on 2017-2-16.
 * 测试的例子。
 */

public class SampleActivity extends AppCompatActivity {

    private LoadingPager load_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
