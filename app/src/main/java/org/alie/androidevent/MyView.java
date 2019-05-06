package org.alie.androidevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Alie on 2019/5/3.
 * 类描述
 * 版本
 */
public class MyView extends View {

    private static final String TAG = "MyView";
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 触摸事件分发
     * @param event
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("TheEvent",TAG +" dispatchTouchEvent ");
        boolean result = super.dispatchTouchEvent(event);
//        Log.i("TheEvent",TAG +" dispatchTouchEvent "+ result);
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
