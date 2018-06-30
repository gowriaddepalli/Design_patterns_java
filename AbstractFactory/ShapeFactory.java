public class ShapeFactory {

	public static Shape getShape(ShapeAbstractFactory factory, int x, int y, int z){
		return factory.getShape(x, y, z);
	}
	
}
