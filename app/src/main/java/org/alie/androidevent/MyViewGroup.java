package org.alie.androidevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Alie on 2019/5/3.
 * 类描述
 * 版本
 */
public class MyViewGroup extends LinearLayout {

    private static final String TAG = "MyViewGroup";

    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//        requestDisallowInterceptTouchEvent(true);
    }



    /**
     * 触摸事件分发
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("TheEvent",TAG +" dispatchTouchEvent ");
        boolean result = super.dispatchTouchEvent(ev);
//        Log.i("TheEvent",TAG +" dispatchTouchEvent "+ result);
        return result;
    }

    /**
     * 触摸事件拦截
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("TheEvent",TAG +" onInterceptTouchEvent ");
        boolean result = super.onInterceptTouchEvent(ev);
//        Log.i("TheEvent",TAG +" onInterceptTouchEvent "+ result);
        return result;
    }

    /**
     * 触摸事件消费
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("TheEvent",TAG +" onTouchEvent ");
        boolean result = super.onTouchEvent(event);
//        Log.i("TheEvent",TAG +" onTouchEvent "+ result);
        return result;
    }
}
