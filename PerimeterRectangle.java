import java.util.Scanner;

class PerimeterRectangle{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for length and breadth
		System.out.print("Enter length of rectangle : ");
		float length = scan.nextFloat();
		
		System.out.print("Enter breadth of rectangle : ");
		float breadth = scan.nextFloat();
		
		//Calculate permimeter
		float permimeter = 2 * (length + breadth);
		
		//Print permimeter
		System.out.print("Perimeter of Rectangle is " + permimeter + " units");
		
		//Close Scanner
		scan.close();

	}
}
