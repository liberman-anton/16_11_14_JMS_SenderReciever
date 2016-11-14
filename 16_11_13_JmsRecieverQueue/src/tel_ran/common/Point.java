package tel_ran.common;

import java.io.Serializable;

public class Point implements Serializable{
	int x;
	int y;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
