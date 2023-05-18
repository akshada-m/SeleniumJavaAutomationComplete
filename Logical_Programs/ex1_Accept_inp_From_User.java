package Logical_Programs;

import java.util.Scanner;

public class ex1_Accept_inp_From_User 
{
public static void main(String[] args) {
	//int input
	Scanner scan =new Scanner(System.in);
	System.out.println("enter num1: ");
	int num1 = scan.nextInt();
	System.out.println("enter num2: ");
	int num2 = scan.nextInt();
	System.out.println("Addition: "+(num1+num2));
	
	//String inp
	System.out.println("enter name: ");
	String Studentname = scan.next();
	System.out.println(Studentname);
}
}
