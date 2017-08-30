package com.example.practical_training_project2.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.practical_training_project2.R;

/**
 * Created by 范晋炜 on 2017/8/30 0030.
 * com.example.practical_training_project2.view
 * MyTextView
 */


public class MyTextView extends View{

    private String text;
    private int textColor;
    private float textSize;

    public MyTextView(Context context) {
        super(context);
        initAttrs(null);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);
    }

    private void initAttrs(@Nullable AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyTextView);
        text = typedArray.getString(R.styleable.MyTextView_text);
        textColor = typedArray.getColor(R.styleable.MyTextView_textColor, 0xffffff);
        textSize = typedArray.getDimension(R.styleable.MyTextView_textSize, 16);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(textColor);
        paint.setTextSize(textSize);
        canvas.drawText(text, 10, 100, paint);
    }
}
