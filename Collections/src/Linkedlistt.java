import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistt {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("Armut");
		list.add("Çilek");
		list.add("Kavun");
		
		list.add(0, "Muz");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
