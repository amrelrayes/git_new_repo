import java.util.Scanner;

public class Method { 

       public static void main(String[] args) {
                     
              Scanner userInput =new Scanner(System.in);
              
              System.out.println("Please Enter your Name :");
              String name1 =userInput.next();
              
              System.out.println("Please Enter your Age :");
              int age1 =userInput.nextInt();
              
              System.out.println("Please Enter your Email :");
              String email1 =userInput.next();
              
              System.out.println("Please Enter your Faculty :");
              String faculty1 =userInput.next();
              
printUserData(name1, age1, email1, faculty1); 
       }
       public static void printUserData (String name,int age,String email,String faculty) { 
              System.out.println("Your name is: "+name);
              System.out.println("Your Age is: "+age);
              System.out.println("Your Email is: "+email);
              System.out.println("Your Faculty is: "+faculty);
              
               }
       
       }
