import java.util.Scanner;

public class NameEntry {

	public static void main(String[] args){
		
	Scanner takeInput = new Scanner(System.in);
	System.out.println("What's your name :");
	String userInput = takeInput.next();
	System.out.print("Welcome :"+userInput);
	
	}
	
}
