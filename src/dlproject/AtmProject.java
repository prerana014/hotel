package dlproject;

import java.util.Scanner;

public class AtmProject {

	 public static void main(String[] args) {
		 int pin=123;
		 double balance=50000;
		 
		 Scanner scan= new Scanner(System.in);
		 PinRead objpin=new PinRead();
		 checktrans objchoi=new checktrans();
		 
		 System.out.println("Welcome to the XYZ BAnks ATM!!");
		 System.out.println("press 'P' to proceed");
		 String key= scan.next();
		  
		 if(key.equals("p")) {
			 System.out.println("Enter the pin no:");
			 objpin.pinread();
			 
			
			 if(pin==123){
				 
				 objchoi.SelectChoice();
				 objchoi.choiceRead();
				 
				 
				 
				 
			 }
			
			 
		 }
		 
		 
		
	}
}
