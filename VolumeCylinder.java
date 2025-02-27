import java.util.Scanner;

class VolumeCylinder{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for radius and height
		System.out.print("Enter Radius of cylinder : ");
		float radius = scan.nextFloat();
		
		System.out.print("Enter Height of cylinder : ");
		float height = scan.nextFloat();

		
		//Calculate Area
		float volume = (float) (Math.PI * radius * radius * height);
		
		//Print area
		System.out.print("Volume of Cylinder is " + volume + " units");
		
		//Close scanner
		scan.close();

	}
}
