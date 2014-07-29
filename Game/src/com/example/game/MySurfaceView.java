package com.example.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView implements Callback, Runnable {
	int screenWidth, screenHeight;
	Canvas canvas;
	Paint paint;
	float cx, cy, cr;
	Thread thread;
	SurfaceHolder surfaceHolder;
	Bullet[] bullets = null;
	boolean runing;

	public MySurfaceView(Context context) {
		super(context);
		paint = new Paint();
		paint.setAntiAlias(true);
		paint.setColor(Color.RED);
		runing = true;
		surfaceHolder = getHolder();
		surfaceHolder.addCallback(this);
		thread = new Thread(this);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (runing) {
			draw(canvas, paint);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void draw(Canvas canvas, Paint paint) {
		canvas = surfaceHolder.lockCanvas();
		canvas.drawColor(Color.BLACK);
		for (Bullet bullet : bullets) {
			bullet.draw(canvas);
			
		}

		revise();

		canvas.drawCircle(cx, cy, cr, paint);
		surfaceHolder.unlockCanvasAndPost(canvas);

	}

	private void revise() {
		if (cx < cr) {
			cx = cr;
		} else if (cx > screenWidth - cr) {
			cx = screenWidth - cr;
		}
		if (cy < cr) {
			cy = cr;
		} else if (cy > screenHeight - cr) {
			cy = screenHeight - cr;
		}
	}

	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		screenWidth = getWidth();
		screenHeight = getHeight();
	}

	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		screenWidth = getWidth();
		screenHeight = getHeight();
		cx = screenWidth / 2;
		cy = screenHeight / 2;
		cr = screenWidth / 15;
		
		bullets = new Bullet[3];
		for (int i = 0; i < 3; i++) {
			bullets[i] = new Bullet(screenWidth, screenHeight, Color.GREEN);
		}
		
		thread.start();
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		runing = false;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
		case MotionEvent.ACTION_MOVE:
			cx = event.getX();
			cy = event.getY();

			break;

		default:
			break;
		}
		return true;
	}

}
