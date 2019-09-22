import java.util.Scanner;

public class leon_p2_{ 
	public static void main(String[]args) {
	
		//BMI calculator
	float weightInPounds ;
	float heightInInches ;
	float BMI = 0;
	
	System.out.print("This is a BMI calculator. \nWhat is your weight in pounds followed by your height in inches? ");
	Scanner in = new Scanner(System.in);
	weightInPounds = in.nextInt() ;
	heightInInches = in.nextInt();
	
	BMI = (703 * weightInPounds) / (heightInInches * heightInInches);
	
	if(BMI < 18.5) {
		System.out.print("You are underweight.");
		} else if(18.5 <= BMI && BMI <= 24.9 ) {
			System.out.print("You are normal weight.");
			} else if (25 <= BMI && BMI <= 29.9 ) {
				System.out.print("You are overweight.");
				}else {
					System.out.print("You are obese.");
				}
	
	in.close();
	}
	}