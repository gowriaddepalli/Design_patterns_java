
public class TriangleFactory implements ShapeAbstractFactory{

	public Shape getShape(int x, int y, int z) {
		// TODO Auto-generated method stub
		return new Triangle(x,y,z);
	}

}
