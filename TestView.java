package com.example.dream.ex4_4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


class TestView extends View
{
    int x=150,y=50;     //小球初始坐标
    //在XML文件中使用自定义组件时必须使用AttributeSet接口对象做参数
    public TestView(Context context, AttributeSet attrs)
    {
        super(context,attrs);
    }
    void getXY(int _x,int _y)
    {
        x=_x;
        y=_y;
    }
    Paint paint=new Paint();
    //重写View的抽象方法 onDraw（）
    @Override   //伪代码 表示重写 编译器可以给你验证@Override下面的方法名是否时你父类中所有的
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawColor(Color.DKGRAY);     //背景颜色
        paint.setAntiAlias(true);       //去锯齿
        paint.setColor(Color.BLACK);    //设置paint的颜色
        canvas.drawCircle(x,y,30,paint);    //画一个实心圆
        paint.setColor(Color.WHITE);
        //不在中心画是因为让圆看起来像立体的球体 显示效果更佳
        canvas.drawCircle(x-9,y-9,6,paint);     //实心圆上的小白点
    }
}
