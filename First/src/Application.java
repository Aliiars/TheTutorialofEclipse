import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir deger girin");
		
		String cond = input.nextLine();
		
		switch (cond) {
		
		case "start":
			System.out.println("Motor is moving");
			break;
		
		case "stop":
			System.out.println("Motor is stop");
			break;
		
		default:
			System.out.println("Commend is not recognized");
			break;
		
		}
		
	}

}