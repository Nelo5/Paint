package com.example.paint;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setColor(getResources().getColor(R.color.d_green));
        canvas.drawRect(0, 1500, getWidth(),getHeight(), paint);;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.brown));
        Path path = new Path();
        path.moveTo(100,1250);
        path.lineTo(100,1700);
        path.lineTo(550,1700);
        path.lineTo(550,1250);
        path.lineTo(325,1020);
        path.lineTo(100,1250);
        path.lineTo(550,1250);
        canvas.drawPath(path,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawPath(path,paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(100,100,100,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawLine(100,100,500,170,paint);
        canvas.drawLine(100,100,490,190,paint);
        canvas.drawLine(100,100,480,210,paint);
        canvas.drawLine(100,100,460,250,paint);
        canvas.drawLine(100,100,450,270,paint);
        canvas.drawLine(100,100,430,310,paint);
        canvas.drawLine(100,100,420,330,paint);
        canvas.drawLine(100,100,400,370,paint);
        canvas.drawLine(100,100,390,390,paint);
        canvas.drawLine(100,100,370,430,paint);
        canvas.drawLine(100,100,360,450,paint);
        canvas.drawLine(100,100,350,470,paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.brown));
        canvas.drawRect(670,1650,720,1750,paint);
        paint.setColor(Color.GREEN);
        canvas.drawOval(590,900,800,1680,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawOval(590,900,800,1680,paint);
        path.reset();
        path.moveTo(830,1550);
        path.lineTo(1050,1550);
        path.lineTo(1050,1580);
        path.lineTo(830,1580);
        path.lineTo(830,1550);
        path.moveTo(880,1580);
        path.lineTo(880,1610);
        path.lineTo(900,1610);
        path.lineTo(900,1580);
        path.moveTo(980,1580);
        path.lineTo(980,1610);
        path.lineTo(1000,1610);
        path.lineTo(1000,1580);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GRAY);
        canvas.drawPath(path,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawPath(path,paint);
        canvas.drawCircle(325,1150,50,paint);
        canvas.drawRect(400,1500,500,1700,paint);
        canvas.drawRect(150,1400,250,1500,paint);
        paint.setColor(Color.BLUE);
        for (int x = 10;x<100;x+=20){
            canvas.drawLine(150+x,1400,150+x,1500,paint);
            canvas.drawLine(150,1400+x,250,1400+x,paint);
        }
        paint.setColor(Color.WHITE);
        for (int x = 1000;x<1300;x+=20){
            int x1=400;
            int x2=500;
            int y1 = x1+x;
            if (y1<1500){y1 = 1500; x1 = y1-x;}
            int y2 = x2+x;
            if (y2>1700){y2 = 1700;x2 = y2-x;}
            canvas.drawLine(x1,y1,x2,y2,paint);
        }
        paint.setColor(Color.CYAN);
        for (int x = 750;x<900;x+=20){
           int xc = 325;
           int yc = 1150;
           int r = 50;
           float a = 2;
           float b = -2*(xc+yc-x);
           float c = (xc*xc+yc*yc+x*x-r*r-2*yc*x);
           float d = (float) sqrt(b*b-4*a*c);
           float x1 = (-b+d)/(2*a);
           float x2 = (-b-d)/(2*a);
           float y1 = x1+x;
           float y2 = x2+x;
           canvas.drawLine(x1,y1,x2,y2,paint);
        }
    }

}
