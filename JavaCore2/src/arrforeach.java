package arrayforeach;

public class arrforeach {

	public static void main(String[] args) {
		
		int [] liste = {1,2,4,5};
		
		int [] liste2 = new int [3];
		
		liste2[0]= 11;
		liste2[1]= 12;
		liste2[2]= 13;
		
		for(int i = 0 ; i < liste.length ; i++) {
			
			int value = liste[i];
			
			System.out.println(liste[i]);
		}
		System.out.println("------------------");
		for(int value : liste2 ) {
			System.out.println(value);
			
		}
		
		
	}

}
