
class Frog{
	int age;
	String name;
	
	 int getAge() {
		return age;
	}
	
	 String getName() {
		return name;
	}
}


public class Settergetterandmore {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		frog1.name = "Nismo";              //constructor olmadan nesne olustuduk ve ad atadık...
		frog1.age = 3;
		
		System.out.println(frog1.getName());
//şimdi teker teker nesneadı.name nesneadı.age yamadan yapıcı metot (constructor kullanarak sınıf oluşturalım)
		
		Students student1 = new Students(245,"Ali Baran Arslan");
		Students student2 = new Students(199,"İbo");
		Students student3 = new Students(333,"Nevzat");
		
		student1.Takedata(); //burda constructor classından çağırdık 
		Students.school="MEF"; 
		student2.Takedata();
		Students.school="BAU";
		student3.Takedata();
		
	}

}
