public class ShapeFactory {

	public static Shape getShape(String type, int x, int y, int z){
		if(type.equalsIgnoreCase("Rectangle")){
			return new Rectangle(x,y);
		}
		if(type.equalsIgnoreCase("Triangle")) {
			return new Triangle(x,y,z);
		}
		return null;
	}
	
}
