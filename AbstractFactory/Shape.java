
public abstract class Shape {
	public abstract int getPerimeter();
	public abstract int getArea();
	public abstract String Draw();
	public String toString() {
		return "Shape [getPerimeter()=" + getPerimeter() + ", getArea()="
				+ getArea() + ", Draw()=" + Draw() + "]";
	}
	
}
