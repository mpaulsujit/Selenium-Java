package Seleium.JavaDemo;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("Enter your name  ");
//nextLine() method helps to enter 
String name = obj.nextLine();
System.out.println("Hello  "+ name);
//first character of the name 
System.out.println(name.charAt(0));

System.err.println("Some error");


	}

}
