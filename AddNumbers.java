import java.util.Scanner;

class AddNumbers{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for both integers
		System.out.print("Enter First Number : ");
		int number1 = scan.nextInt();
		System.out.print("\nEnter Second Number : ");
		int number2 = scan.nextInt();

		//Print the Solution
		System.out.print("\nTotal Sum : " + (number1 + number2));

		//Close the scanner
		scan.close();
	}
}
