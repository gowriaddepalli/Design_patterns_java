import java.util.*;

// This works fine n Single threaded applications, and creates the object only
// when required.
public class Singleton {
	
private Singleton(){}
	
private static Singleton Lazyinstance; 

public static Singleton getSingletonInstance(){
	
	if(Lazyinstance == null){
		Lazyinstance = new Singleton();
	}
	return Lazyinstance;
}
}
