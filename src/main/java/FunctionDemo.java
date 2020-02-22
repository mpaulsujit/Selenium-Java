
public class FunctionDemo {

	
		public static void main(String[] args) {
			//Function in Java 
			// Function is a set of code​
			//Function calling
			FunctionDemo obj=new FunctionDemo();
			obj.addTwoNumber(10, 12);
			
			int addtionResult=obj.addThreeNumber(1, 2, 3);
			System.out.println("Result="+addtionResult);
			
			//FunctionDemo.addTwoNumber(1,2);
			
			FunctionDemo.printName("Ramesh");
			obj.printName("Raj");
		}
		
		//Function definition
		//It takes 2 parameter and return nothing
		//does not return any value
		//Non static function can be called by object reference variable but statis is called by only with function.
		public void addTwoNumber(int x, int y) {
			System.out.println(x+y);
		}
		//Takes 3 parameter and return integer value
		public int addThreeNumber(int a, int b, int c) {
			int res;
			res=a+b+c;
			return res;
		}
		
		public static void printName(String name) {
			System.out.println("Hello "+name);
		}
	
}
