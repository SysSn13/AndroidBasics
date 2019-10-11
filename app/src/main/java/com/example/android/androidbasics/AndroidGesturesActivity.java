package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.gesture.Gesture;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class AndroidGesturesActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private TextView text;
    private GestureDetectorCompat GestureDetect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_gestures);
        text=(TextView) findViewById(R.id.tvGestures);
        GestureDetect = new GestureDetectorCompat(this,this);
        GestureDetect.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        GestureDetect.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        text.setText("onSingleTapConfirmed  \n  "+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        text.setText("onDoubleTap   \n    " +motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        text.setText("onDoubleTapEvent   \n    " +motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        text.setText("onDown     \n  "+motionEvent.toString() );
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        text.setText("onShowPress       \n "+motionEvent.toString());

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        text.setText("onSingleTapUp      \n "+motionEvent.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {

        text.setText("onScroll     \n  " +motionEvent.toString() +"  "+ motionEvent1.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        text.setText("onLongPress   \n    "+motionEvent.toString());

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        text.setText("onFling    \n  " +motionEvent.toString() +"  "+motionEvent1.toString() );
        return false;
    }
}
