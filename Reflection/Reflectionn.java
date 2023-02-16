import java.util.ArrayList;
import java.util.List;

public class Reflectionn {
	
	public static void main(String [] args) {
		/*
		Class<String> stringClass = String.class;
		HashMap<String,Integer> mapObject = new HashMap<>();
		
		Class<?> hashmapClass = mapObject.getClass();
		try {
			Class<?> squareClass = Class.forName("reflection1$Square");
		}catch(e ){
			
		}
		
		
	}
	
	private static void printClassInfo(Class<?> ...classes ) {
		
		for (Class<?> clazz : classes) {
			
			System.out.println(String.format("class name: %s, class name: %s",
					clazz.getSimpleName(),
					clazz.getPackageName()));
			
			Class<?> [] implementedInterfaces = clazz.getInterfaces();
			
			for(Class<?> implementedInterface : implementedInterfaces) {
				System.out.println(String.format("class %s implements : %s ",
						clazz.getSimpleName(),
						implementedInterface.getSimpleName()));
			}
		}
		
	}
		
	private static class Square implements Drawable{

		@Override
		public int getNumberCorners() {
			return 4;
		}
		
		
		
		
	}
	private static interface Drawable{
			
		int getNumberCorners();
			
	}
	
	private enum Color{
		
		BLUE,
		RED,
		GREEN
		
	}
	*/
	List<String> names = new ArrayList<>();
	
	Class<?> clazz = names.getClass();
	
	System.out.println(clazz.getTypeName());
	
	
		
	}

}


