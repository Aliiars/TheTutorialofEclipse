import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			Class calisan = Class.forName("Calisan");
			
			Constructor[] constructors = calisan.getConstructors();
			Constructor[] declaredConstructors = calisan.getDeclaredConstructors();
			
			Field[] fields = calisan.getFields();
			Field[] declaredFields = calisan.getDeclaredFields();
			
			Method[] methods = calisan.getMethods();
			Method[] declaredMethods = calisan.getDeclaredMethods();
			
			for(Constructor c : constructors) {
				System.out.println("constructors: " + c.getName()); 
			}
			
			for(Constructor c : declaredConstructors) {
				System.out.println("declared constructors: " + c.getName()); 
				 
			}
			
			for(Field f : fields) {
				System.out.println(" fields : " + f.getName()); 
				 
			}
			
			for(Field f : declaredFields) {
				System.out.println(" declared fields : " + f.getName()); 

				 
			}
			
			for(Method m : methods) {
				System.out.println(" methods : " + m.getName()); 

				 
			}
			
			for(Method m : declaredMethods) {
				System.out.println(" declared methods : " + m.getName()); 

				 
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
