
public class RectangleFactory implements ShapeAbstractFactory {

	public Shape getShape(int x, int y, int z) {
		// TODO Auto-generated method stub
		return new Rectangle(x,y);
	}

}
