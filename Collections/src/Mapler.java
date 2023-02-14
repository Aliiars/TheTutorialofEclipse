import java.util.*;

public class Mapler {

	public static void main(String[] args) {
		
		//HashMap       //LinkedHashMap olsaydı sıralı olurdu  //TreeMap yaparsak stringe göre sıralar
		
		HashMap b = new HashMap();
		
		b.put("Türkiye","Maraş");
		b.put("Fransa", "Paris");
		b.put("Ingiltere","Londra");
		
		Set s = b.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry item = (Map.Entry) itr.next();
			System.out.println(item.getKey() + " --> " + item.getValue());
			
			
		}
		
	}

}
