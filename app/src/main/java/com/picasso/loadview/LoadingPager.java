package com.picasso.loadview;

import android.content.Context;
import android.graphics.Color;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import android.widget.TextView;

import com.wang.avi.AVLoadingIndicatorView;

/**
 * Created by kangaroo on 2017-2-16.
 * 自定义加载页面。
 */

public class LoadingPager extends FrameLayout implements View.OnClickListener{

    public static final int STATE_NONE = -1;// 默认状态
    public static final int STATE_LOADING = 0;//正在请求网络

    public static final int STATE_EMPTY = 1;//空状态
    public static final int STATE_ERROR = 2;//错误状态
    public static final int STATE_SUCCESS = 3;// 成功状态

    public static final int STATE_REQUEST_COMPLETE = 4;//请求完成。
    public static final int STATE_NO_NETWORK = 5;//没有网络

    private View mView;
    private LinearLayout loading_layout_ll;
    private AVLoadingIndicatorView loading_view;
    private ImageView state_image_icon;
    private TextView state_text_hint;
    private Button request_retry_button;

    private RefreshListener mRefreshListener;

   public interface  RefreshListener{
        void refresh();
    }
    public LoadingPager(Context context) {
        super(context);
        initView(context);
    }

    public LoadingPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public LoadingPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }
   /* public LoadingPager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context);
    }*/

    private void initView(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mView = inflater.inflate(R.layout.loading_pager, this);
        loading_layout_ll = (LinearLayout) mView.findViewById(R.id.loading_layout_ll);
        loading_view = (AVLoadingIndicatorView) mView.findViewById(R.id.loading_view);
        state_image_icon = (ImageView) mView.findViewById(R.id.state_image_icon);
        state_text_hint = (TextView) mView.findViewById(R.id.state_text_hint);
        request_retry_button = (Button) mView.findViewById(R.id.request_retry_button);
        loading_view.setIndicatorColor(Color.GREEN);
        state_image_icon.setImageResource(R.mipmap.no_order_icon);//设置默认的资源图片。
        state_text_hint.setText("");//设置状态提示。
       /* tvError.setText(Html.fromHtml(exchange));
        mRlError.setOnClickListener(this);*/
        // TODO: 2017-2-16
        request_retry_button.setOnClickListener(this);
        setState(STATE_NONE);
    }
    public void setState(int state) {

        setVisibility(View.VISIBLE);
        if(state==STATE_NONE){
            //默认状态。
            setVisibility(View.GONE);
            loading_layout_ll.setVisibility(View.GONE);
            loading_view.setVisibility(View.GONE);
        }else if(state==STATE_LOADING){
            //网络加载状态。
            loading_layout_ll.setVisibility(View.GONE);
            loading_view.setVisibility(View.VISIBLE);
        }else if(state==STATE_REQUEST_COMPLETE){
            //网络加载完成。
            loading_view.setVisibility(View.GONE);
            loading_layout_ll.setVisibility(View.VISIBLE);
        }else if(state==STATE_NO_NETWORK){

            loading_view.setVisibility(View.GONE);
            loading_layout_ll.setVisibility(View.VISIBLE);
            request_retry_button.setVisibility(View.VISIBLE);
            state_text_hint.setText("啊哦~服务器去月球了~~~");
        }
    }

    public void setCompleteImageResources(int resourcesId){

        state_image_icon.setImageResource(resourcesId);
    }
    public void setCompleteTexHint(String texHint){
        state_text_hint.setText(texHint);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.request_retry_button){
                if(mRefreshListener!=null){
                    mRefreshListener.refresh();
                }
        }
    }
    public void setFreshListener(RefreshListener freshListener){
        this.mRefreshListener=freshListener;
    }
}
