package leonp3;

import java.util.Scanner;

public class leon_p3 {
	public static void main(String[] args) {

		int i;
		int x;

		// one dimensional array

		String[] topics = new String[5];
		topics[0] = "thai";
		topics[1] = "pizza";
		topics[2] = "poke bowl";
		topics[3] = "tacos";
		topics[4] = "sushi";
		System.out.print("");

		// two dimensional array
		Scanner in = new Scanner(System.in);
		int[][] responses = new int[5][10];

		/*
		 * for(i=0; i < responses.length; i++) { for(x = 0; x <responses.length; x++) {
		 * responses[i][x]= 0; } }
		 */
		int rate = 0;
		int amntPpl;
		System.out.println("How many people will be taking this survey today? ");
		amntPpl = in.nextInt();

		for (x = 0; x < 5; i++) {
			for (i = 0; i < amntPpl; i++) {
				System.out.println("User " + i + "Please rate the following topic from to 10: " + topics[x]);
				rate = in.nextInt();
				responses[x][rate - 1] += 1;
			}
		}

		int avG = 0;
		for (x = 0; x < 5; i++) {
			System.out.print(topics[x]);
			for (i = 0; i < 10; i++) {
				System.out.print(responses[x][i]);
				avG += responses[x][i];

			}
		}
		System.out.print("average : " + avG / 10);
		System.out.println("");
		avG = 0;

		for (i = 0; i < amntPpl; i++) {
			for (x = 0; x < 5; x++) {
				System.out.println("Hello user:" + i + "Please rate the following topic from 1 to 10: " + topics[i]);
				x = in.nextInt();
			}
		}

		i = in.nextInt();
		in.close(); 
	}
}