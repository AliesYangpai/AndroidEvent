package org.alie.androidevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
