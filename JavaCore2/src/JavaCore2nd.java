
class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void direction(String direction , int distance ) {
		System.out.println("Robots is : " + distance + " metres far away from home \ndirection is :" + direction );
		
	}
}

class Person {
	
	String name;
	int age;
	
	/*
	void speak() {
		for(int i = 0 ; i < 3 ; i++) {
			
			System.out.println("My name is: " + name + " and I am " + age + " years old");
		}
		
	}
	*/  //Get metodu ile aldık
	
	int calculatingRetirement() {
		int a = 65 - age;
		return a;
		
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	
}




public class JavaCore2nd {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name="Ali Baran Arslan";
		person1.age = 22;
		//person1.speak();
		
		//System.out.println("Person name is: " +person1.name);   
		//Bunu yazmaya gerek kalmadı çünkü methodu çağırdık
		
		int years = person1.calculatingRetirement();
		System.out.println("Years Till the retirement: " + years);
		
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println("My name is : " + name);
		System.out.println("My age is:" + age);
		
		Robot sam = new Robot();
		sam.speak("Hello Ibtech how can help you?");
		int value = 41;
		String direct = "WEST";
		sam.direction(direct,value);
		

	}

}
