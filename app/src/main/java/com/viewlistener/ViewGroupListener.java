package com.viewlistener;

import android.view.View;

/**
 * Created by kangaroo on 2017-2-21.
 *
 */

public interface ViewGroupListener {

    int onClickListener(View v,int position);
    View onClickListener(View v);
}
