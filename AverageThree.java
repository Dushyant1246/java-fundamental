import java.util.Scanner;

class AverageThree{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for all three integers
		System.out.print("Enter First Number : ");
		int number1 = scan.nextInt();
		System.out.print("Enter Second Number : ");
		int number2 = scan.nextInt();
		System.out.print("Enter Third Number : ");
		int number3 = scan.nextInt();
		
		//Print the Solution
		System.out.print("Average of all three numbers is : " + ((number1 + number2 + number3) / 3));

		//Close the scanner
		scan.close();
	}
}