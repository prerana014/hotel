package dlproject;

import java.util.Scanner;

public class checktrans {
	
	Scanner inchoice=new Scanner(System.in);
	int choice;
	
	public void SelectChoice()
	{
		System.out.println("Enter the the choice you want to proceed ");
		System.out.println("1:Check balance");
		System.out.println("2:Balance Withdraw");
		System.out.println("3:Exit");
	}
	public void choiceRead(){
		choice=inchoice.nextInt();
		
	}
	
	

}
