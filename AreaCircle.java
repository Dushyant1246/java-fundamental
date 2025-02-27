import java.util.Scanner;

class AreaCircle{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for radius
		System.out.print("Enter Radius of circle : ");
		float radius = scan.nextFloat();
		
		//Calculate Area
		float area = (float) (Math.PI * radius * radius);
		
		//Print area
		System.out.print("Area of circle is " + area + " units");

	}
}
