
public class Stringss {

	public static void main(String[] args) {
		//inefficent
		String s = " ";
		s = "Ali";
		s += " ";
		s += "BARAN";
		System.out.println(s);
		
		StringBuilder sw = new StringBuilder(" ");
		sw.append("Ali").append("Arslan");
		
		System.out.println(sw.toString());
		
		
		for(int a = 0 ; a <= 20 ; a++ ) {
			System.out.printf("%2d: %s \n", a , "Sırası gelen no");
			
		}
		
	

	}

}
