import java.util.*;
import java.io.*;

public class ShapeFactoryTest {

	public static void main(String[] args){
		Shape rect = ShapeFactory.getShape(new RectangleFactory(),3,4,5);
		Shape triangle = ShapeFactory.getShape(new TriangleFactory(),3,4,5);
		System.out.println(rect);
		System.out.println(triangle);
	}
}
