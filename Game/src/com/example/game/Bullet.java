package com.example.game;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Bullet {
	int screenW, screenH;
	float x, y, r = 10;
	double speed = 10, degree;
	double speed_x, speed_y;
	Paint paint = new Paint();

	public Bullet(int screenW, int screenH, int color) {
		super();
		this.screenW = screenW;
		this.screenH = screenH;
		paint.setColor(color);
		paint.setAntiAlias(true);

		degree = Math.random() * Math.PI;
		speed_x = speed * Math.cos(degree);
		speed_y = speed * Math.sin(degree);

		int m = (int) (4 * Math.random());
		switch (m) {
		case 0:
			x = -r;
			y = (float) (-r + (screenH + 2 * r) * Math.random());
			break;
		case 1:
			y = -r;
			x = (float) (-r + (screenW + 2 * r) * Math.random());
			break;
		case 2:
			x = screenW + r;
			y = (float) (-r + (screenH + 2 * r) * Math.random());
			break;
		case 3:
			y = screenH + r;
			x = (float) (-r + (screenW + 2 * r) * Math.random());
			break;

		default:
			break;
		}
	}

	public void draw(Canvas canvas) {
		move();
		canvas.drawCircle(x, y, r, paint);
	}

	private void move() {
		if (x<r) {
			speed_x=Math.abs(speed_x);
		} else if (x>screenW-r) {
			speed_x=-Math.abs(speed_x);
		}
		if (y<r) {
			speed_y=Math.abs(speed_y);
		} else if (y>screenH-r) {
			speed_y=-Math.abs(speed_y);
		}
		
		x += speed_x;
		y += speed_y;
	}

}
