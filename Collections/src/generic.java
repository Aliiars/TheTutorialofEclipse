import java.util.ArrayList;
import java.util.HashMap;

public class generic {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		//Genericlerde Primitive variable kullanılamaz o sebebkle int yerine Integer yazdık.
		
		a.add(2);
		a.add(3);
		a.add(46);
		
		// a.add(true) bu yanlış çünkü genericte Integer verileri kabul edebilcegini belirtmiş.
		
		/* bu array örneği (basit)
		int[] list = new int [3];
		list[0]=46;
		*/
		
		for(Integer obj : a) {
			System.out.println(obj);
		}
		
		HashMap<String,Integer> c = new HashMap<>();
		
		c.put("Maraş", 46);
		c.put("Adana", 1);
		c.put("İstanbul", 34);
		
		for(String key : c.keySet()) {
			
			System.out.println("Key: " + key + " Value : " + c.get(key));
		}
		
		for (Integer value : c.values()) {
			System.out.println(value);
		}
		
		
			/*
			exp<String> m = new exp<> ("IBTech");
			System.out.println(m.getObj());
			
			exp<Integer> l = new exp<> (15);
			System.out.println(l.getObj());
			
		*/
		
	}
}
