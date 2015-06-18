package com.google.zxing.client.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class TestView extends View {

	Paint paint;
	Rect rect, rect1;
	Canvas canvas;
	
	public TestView(Context context, AttributeSet attrs) {
		super(context, attrs);
		paint = new Paint();
		rect = new Rect(100, 100, 200, 200);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		this.canvas = canvas;
		paint.setColor(Color.BLUE);
		paint.setStrokeWidth(10);
		paint.setAlpha(50);
		canvas.drawRect(rect, paint);
		if (rect1 != null)
			canvas.drawRect(rect1, paint);
	}
	
	public void setRect(Rect rect, Rect rect1) {
		this.rect = rect;
		this.rect1 = rect1;
		this.invalidate();
	}

}
