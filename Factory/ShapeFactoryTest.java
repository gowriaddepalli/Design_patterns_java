import java.util.*;
import java.io.*;

public class ShapeFactoryTest {

	public static void main(String[] args){
		Shape rect = ShapeFactory.getShape("Rectangle",3,4,5);
		Shape triangle = ShapeFactory.getShape("Triangle",3,4,5);
		System.out.println(rect);
		System.out.println(triangle);
	}
}
