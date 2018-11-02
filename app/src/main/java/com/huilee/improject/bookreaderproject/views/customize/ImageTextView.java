package com.huilee.improject.bookreaderproject.views.customize;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import com.huilee.improject.bookreaderproject.R;

/*
 * Created by huilee on 2018-11-01
 */
public class ImageTextView extends View {

    Context mContext;

    public ImageTextView(Context context) {
        super(context);
        this.mContext = context;
    }

    public ImageTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void init(){
        View view  = LayoutInflater.from(mContext).inflate(R.layout.image_text_layout,null);
    }


}
