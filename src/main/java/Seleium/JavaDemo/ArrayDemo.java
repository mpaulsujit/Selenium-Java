package Seleium.JavaDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Array concept in java
		// To store similar type of data
		int rollNumber = 101;
		int rollNumbera[]=new int[6];
		//here 6 is the size of the array
		
		rollNumbera[0]=100;
		
		rollNumbera[1]=105;
		rollNumbera[2]=107;
		rollNumbera[3]=108;
		
		rollNumbera[4]=105;
		rollNumbera[5]=106;
		
		System.out.println(rollNumbera[2]);
		for (int i = 0; i<rollNumbera.length; i++) {
			System.out.println(rollNumbera[i]);
			
			//Other way to stire the data in Array
			//int rollNumbers[]= {1,2,3,5,5,8,9};
			
		}
	}

}
