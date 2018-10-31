package com.example.dream.ex4_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TestView tView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView = (TestView) findViewById(R.id.testView1);
        tView.setOnTouchListener(new mOnTouch());

    }

    class mOnTouch implements View.OnTouchListener {
        @Override
        public boolean onTouch(View v, MotionEvent event)
        {
            int x1, y1;
            x1 = (int) event.getX();
            y1 = (int) event.getY();
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                tView.getXY(x1, y1);
                tView.invalidate();
                return true;
            } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                tView.getXY(x1, y1);
                tView.invalidate();
                return true;
            }
         //  v.performClick();
            return tView.onTouchEvent(event);
        }
    }
}
