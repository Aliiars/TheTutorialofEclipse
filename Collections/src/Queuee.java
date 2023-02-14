
import java.util.*;

public class Queuee {

	public static void main(String[] args) {
	
		Queue q = new LinkedList();
		
		q.add("Muz");
		q.add("Elma");
		
		q.offer("Kiraz");
		
		System.out.println("element(): " + q.element());
		System.out.println("Remove(): " + q.remove());
		
		q.forEach(a -> System.out.println(a + ""));
		
		
		
		
	}

}
