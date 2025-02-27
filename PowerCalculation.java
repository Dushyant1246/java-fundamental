import java.util.Scanner;

class PowerCalculation{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for both integers
		System.out.print("Enter Number : ");
		int number1 = scan.nextInt();
		System.out.print("Enter power Number : ");
		int number2 = scan.nextInt();

		//Print the Solution
		System.out.print(number1 + " to the power of " + number2 + " is " + ((int) Math.pow(number1, number2)));

		//Close the scanner
		scan.close();

	}
}
