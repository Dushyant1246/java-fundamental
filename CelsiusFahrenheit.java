import java.util.Scanner;

class CelsiusFahrenheit{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for Celsius
		System.out.print("Enter value for celsius : ");
		float celsius = scan.nextFloat();

		//Calculate value for Fahrenheit
		float fahrenheit = (celsius * 9/5) + 32;

		//Print the result
		System.out.println(celsius + " C in Fahrenheit = " + fahrenheit + " F");
		
		//Close the Scanner object
		scan.close();
	}
}
