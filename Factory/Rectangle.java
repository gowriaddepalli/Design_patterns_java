
public class Rectangle extends Shape {
int x;
int y;

	public Rectangle(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(x+y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getArea() {
		// TODO Auto-generated method stub
		return x*y;
	}

	public String Draw() {
		// TODO Auto-generated method stub
		return "Inside rectangle Class";
	}

}
