package com.flatgine.camera;

import com.flatgine.camera.MapScroller;

public class Camera {
	private int x; 
	private int y;
	//TODO make variables for focusOn method: speed, acceleration
	
	
	public Camera(int x,int y) {
		setX(x);
		setY(y);
	}
	
	public void moveToCoord(int x, int y) {
		decreaseXBy(x);
		decreaseYBy(y);
		//TODO There is null argument until the groups objects is created
		MapScroller.scrollOfXAxisObjectsGroupByDistance(null, x);	
		MapScroller.scrollOfYAxisObjectsGroupByDistance(null, y);
	}
	
	
	//___Setters_And_Getters__
	private void setX(int X) {
		this.x = X;
	}
	
	private void setY(int Y) {
		this.y = Y;
	}
	
	private void increaseXBy(int delta) {
		this.x += delta;
	}
	
	private void decreaseXBy(int delta) {
		this.x -= delta;
	}
	
	private void increaseYBy(int delta) {
		this.y += delta;
	}
	
	private void decreaseYBy(int delta) {
		this.y -= delta;
	}
	
}
