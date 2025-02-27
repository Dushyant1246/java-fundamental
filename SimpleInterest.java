import java.util.Scanner;

class SimpleInterest{
	public static void main(String[] args){
		//Declare Scanner object
		Scanner scan = new Scanner(System.in);

		//Take input for principal, rate and time
		System.out.print("Enter Principal : ");
		float principal = scan.nextFloat();
		
		System.out.print("Enter Rate : ");
		float rate = scan.nextFloat();

		System.out.print("Enter Time : ");
		float time = scan.nextFloat();
		
		//Calculate Simple Interest
		float simpleInterest = (principal * rate * time) / 100;
		
		//Print Simple Interest
		System.out.print("Simple Interest : " + simpleInterest);
		
		//Close scanner
		scan.close();

	}
}
