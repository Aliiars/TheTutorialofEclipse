import java.util.Vector;

public class Vectorr {

	public static void main(String[] args) {
	
		Vector v = new Vector(4,2); //başlangıç kapasite 4 kapsite arttırımı 2 şer 2 şer demek
		
		v.add("Muz");
		v.add("Kiraz");
		v.add("Kavun");
		v.add("Kavun");
		v.add("Kavun");
		
		
		System.out.println("Kapasite: " + v.capacity());
		System.out.println("Boyut: " + v.size());
		
	}

}
