
public class Triangle extends Shape{
int x;
int y;
int z;

public Triangle(int x, int y, int z) {
	super();
	this.x = x;
	this.y = y;
	this.z = z;
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

public int getZ() {
	return z;
}

public void setZ(int z) {
	this.z = z;
}

	public int getPerimeter() {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	public int getArea() {
		// TODO Auto-generated method stub
		return x/2*y;
	}

	public String Draw() {
		// TODO Auto-generated method stub
		return "Inside Triangle class";
	}

}
