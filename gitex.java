public class gitex {
	public static void main(String [] args){
		sayHello();
		sayBye();
		System.out.println("Sum of 3 and 5 is "+sumOfNumbers(3,5));
	}

	public static void sayHello(){
		System.out.println("Hello Friend");
	}

	public static void sayBye(){
		System.out.println("Bye Friend");
	}

	public static int sumOfNumbers(int a,int b){

		return (a+b);
	}
}
