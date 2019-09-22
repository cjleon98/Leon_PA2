import java.util.Scanner;

//module leon_p1_ {
	public class leon_p1{ 
	public static void main(String[]args) {

	int i;
	int temp1 = 0;
	int temp2 = 0;
	System.out.print("Please enter a 4 digit passcode: ");
	Scanner in = new Scanner(System.in);
	int [] password = new int[4];
	for(i=0; i < 4; i++) {
		password[i] = in.nextInt();
		//System.out.print(password[i] + " ");
	}
	int p1;
	int p2;
	int p3;
	int p4;
	String fullPassword;
	
	p1 = password[0];
	p2 = password[1];
	p3 = password[2];
	p4 = password[3];
	Integer.toString(p1);
	Integer.toString(p2);
	Integer.toString(p3);
	Integer.toString(p4);
	fullPassword = ""+ p1 + p2 + p3 + p4;	
	
	password[0] = (password[0] + 7) % 10;
	password[1] = (password[1] + 7) % 10;
	password[2] = (password[2] + 7) % 10;
	password[3] = (password[3] + 7) % 10;
	
	temp1 = password[0];
	temp2 = password[2];
	password[0] = temp2;
	password[2] = temp1;
	temp1 = password[1];
	temp2 = password[3];
	password[1] = temp2;
	password[3] = temp1;
	
	System.out.println("This is your encrypted password: ");
	System.out.print(password[0] + " ");
	System.out.print(password[1] + " ");
	System.out.print(password[2] + " ");
	System.out.println(password[3] + " ");
	
	System.out.println("Would you like to decrypt it? Respond 1 for yes and 0 for no.");
	int response = in.nextInt();
	if(response == 1) {
	temp1 = password[0];
	temp2 = password[2];
	password[0] = temp2;
	password[2] = temp1;
	temp1 = password[1];
	temp2 = password[3];
	password[1] = temp2;
	password[3] = temp1;
	
	/*password[0] =  (10 % password[0]) - 7;
	password[1] =  (10 % password[1]) - 7;
	password[2] =  (10 % password[2]) - 7;
	password[3] =  (10 % password[3]) - 7;*/
	
	System.out.print(fullPassword);
	
	} else {
		System.out.println("Okay. Bye.");
	}
	in.close();
	
	
}}

	 
		// TODO Auto-generated method stub
		
	