import java.util.HashSet;
import java.util.Iterator;

public class Hset {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("12");
		h.add(12);
		h.add(12.00);
		h.add(false);
		h.add(null);
		
		h.remove(null);  // null silindi
		
		System.out.println(h.contains(12));
		System.out.println(h.size());
		
		Iterator itr = h.iterator();
		/*
		while(itr.hasNext()) {
			System.out.println(itr.next()); // sıralama hash mapa göre oluyor o yüzden sırasız gibi
			
		}
		*/
		h.forEach(item -> System.out.println(item + " ")); // bu üstteki while iteratoü ile aynı işleve sahip

	
	}

}
