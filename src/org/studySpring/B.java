package org.studySpring;

public class B extends A{

	private int x= 5;
	

	public B () {
		super();
	}

	public B(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
