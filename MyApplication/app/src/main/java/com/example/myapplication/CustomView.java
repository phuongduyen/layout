package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by nguyennghia on 10/19/16.
 */
public class CustomView extends View {
    private static final String TAG = "CustomView";
    public CustomView(Context context) {
        super(context);
        Log.e(TAG, "CustomView: 1");
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.e(TAG, "CustomView: 2");
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.e(TAG, "CustomView: 3");
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(TAG, "onAttachedToWindow: ");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "onMeasure: ");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.e(TAG, "onLayout: ");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG, "onDraw: ");
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e(TAG, "onDetachedFromWindow: ");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG, "dispatchTouchEvent: " + event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent: " + event);
        return super.onTouchEvent(event);

    }
}

//        2019-11-10 23:34:21.815 19699-19699/? E/CustomView: CustomView: 2
//        2019-11-10 23:34:21.855 19699-19699/? E/CustomView: onAttachedToWindow:
//        2019-11-10 23:34:21.862 19699-19699/? E/CustomView: onMeasure:
//        2019-11-10 23:34:21.862 19699-19699/? E/CustomView: onMeasure:
//        2019-11-10 23:34:21.886 19699-19699/? E/CustomView: onMeasure:
//        2019-11-10 23:34:21.887 19699-19699/? E/CustomView: onMeasure:
//        2019-11-10 23:34:21.888 19699-19699/? E/CustomView: onLayout:
//        2019-11-10 23:34:21.928 19699-19699/? E/CustomView: onDraw:
//        2019-11-10 23:34:44.783 19699-19699/com.example.myapplication E/CustomView: dispatchTouchEvent: MotionEvent { action=ACTION_DOWN, actionButton=0, id[0]=0, x[0]=514.0, y[0]=335.0, toolType[0]=TOOL_TYPE_FINGER, buttonState=0, metaState=0, flags=0x0, edgeFlags=0x0, pointerCount=1, historySize=0, eventTime=99791705, downTime=99791705, deviceId=8, source=0x1002 }
//        2019-11-10 23:34:44.784 19699-19699/com.example.myapplication E/CustomView: onTouchEvent: MotionEvent { action=ACTION_DOWN, actionButton=0, id[0]=0, x[0]=514.0, y[0]=335.0, toolType[0]=TOOL_TYPE_FINGER, buttonState=0, metaState=0, flags=0x0, edgeFlags=0x0, pointerCount=1, historySize=0, eventTime=99791705, downTime=99791705, deviceId=8, source=0x1002 }
//        2019-11-10 23:34:48.220 19699-19699/com.example.myapplication E/CustomView: dispatchTouchEvent: MotionEvent { action=ACTION_DOWN, actionButton=0, id[0]=0, x[0]=335.0, y[0]=650.0, toolType[0]=TOOL_TYPE_FINGER, buttonState=0, metaState=0, flags=0x0, edgeFlags=0x0, pointerCount=1, historySize=0, eventTime=99795141, downTime=99795141, deviceId=8, source=0x1002 }
//        2019-11-10 23:34:48.220 19699-19699/com.example.myapplication E/CustomView: onTouchEvent: MotionEvent { action=ACTION_DOWN, actionButton=0, id[0]=0, x[0]=335.0, y[0]=650.0, toolType[0]=TOOL_TYPE_FINGER, buttonState=0, metaState=0, flags=0x0, edgeFlags=0x0, pointerCount=1, historySize=0, eventTime=99795141, downTime=99795141, deviceId=8, source=0x1002 }
