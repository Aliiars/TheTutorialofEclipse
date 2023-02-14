import java.util.*;

public class Tset {
	
	public static void main(String[] args) {
		
		
		TreeSet tree = new TreeSet();
		
		tree.add(5);
		tree.add(8);
		tree.add(11);
		tree.add(22); 
		//tree.add(null); //TreeSet null kabul etmez bu görmek iin bir try catch hazırlayalım
		try {
			tree.add(null);
			
		} catch(Exception e) {
			System.out.println(e.toString()); //hatanın sınıfını gösterdik getMessage() ile ne olduğunu da görebiliriz.
		}
		
		tree.forEach(item -> System.out.println(item + " "));
	}

}
