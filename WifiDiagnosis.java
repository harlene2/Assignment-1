/*

 * Class: CMSC203 

 * Instructor: Ashique Tanveer

 * Description: This program helps the user diagnose there wifi problems. 

 * Due: 02/06/2023

 * I pledge that I have completed the programming 

 * assignment independently. I have not copied the code 

 * from a student or any source. I have not given my code 

 * to any student.

   Print your Name here: Harlene Kaur

*/

import java.util.*;



public class WifiDiagnosis {

	private static final String QUESTION = "Did that fix the problem? (Yes or No)";

	private static final String PNAME = "\nProgrammer: Harlene Kaur";

	private static final String YES = "yes";

	private static final String NO = "no";



	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");

		System.out.println("Reboot your computer and try to connect");

		System.out.println(QUESTION);

		String input = myObj.nextLine();


		
		if (input.equalsIgnoreCase(YES)) {

			System.out.println("Done. " + PNAME);

			return;

		}
		if (input.equalsIgnoreCase(NO)) {

			System.out.println("Reboot the router and try to connect.");

			System.out.println(QUESTION);

			input = myObj.nextLine();
		}
		
		if (input.equalsIgnoreCase(YES)) {

			System.out.println("Done. " + PNAME);

			return;

		}

		if (input.equalsIgnoreCase(NO)) {

			System.out.println(

					"Make sure the cables connecting the router are firmly plugged in and power is getting to the router");

			System.out.println(QUESTION);

			input = myObj.nextLine();



			if (input.equalsIgnoreCase(YES)) {

				System.out.println("Done. " + PNAME);

				return;

			}

			if (input.equalsIgnoreCase(NO)) {

				System.out.println("Move the computer closer to the router and try to connect");

				System.out.println(QUESTION);

				input = myObj.nextLine();



				if (input.equalsIgnoreCase(YES)) {

					System.out.println("Done. " + PNAME);

					return;

				}

				if (input.equalsIgnoreCase(NO)) {

					System.out.println("Contact your ISP");

					System.out.println("Done. " + PNAME);

				}

			}

		} else {

			System.out.println("Invalid answer; try again.");

			System.out.println(PNAME);

			return;

		}

	}

}
