import java.util.Scanner;

public class DataCollection {

	public static void main(String[] args){
		
	Scanner takeInput = new Scanner(System.in);
	System.out.println("Please Enter Your Name :");
	String userInput = takeInput.next();
	System.out.println("Please Enter Your Age :");
	String userInput1 = takeInput.next();
	System.out.println("Please Enter Your Email :");
	String userInput2 = takeInput.next();
	System.out.println("Please Enter Your Faculty :");
	String userInput3 = takeInput.next();
	System.out.print("Name: "+userInput);
	System.out.print("\nAge: "+userInput1);
	System.out.print("\nEmail "+userInput2);
	System.out.print("\nFaculty: "+userInput3);
	
	}
	
}
