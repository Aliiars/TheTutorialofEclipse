
import java.util.*;

public class Arraylistt {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("Adana");
		arr.add("İstanbul");
		arr.add("Giresun");
		
		arr.add(0,"KahramanMaraş");
		arr.remove(1);
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//arr.forEach(i -> System.out.println(i + " "));
		
		

	}

}
