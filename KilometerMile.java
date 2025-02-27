import java.util.Scanner;

class KilometerMile{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for Kilometers
		System.out.print("Enter value in Kilometers : ");
		float kilometers = scan.nextFloat();

		//Calculate value for Miles
		float miles = (float) (kilometers * 0.621371);

		//Print the result
		System.out.println(kilometers + " kms in Miles = " + miles + " miles");
		
		//Close the Scanner object
		scan.close();
	}
}
