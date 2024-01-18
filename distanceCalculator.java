import java.util.Scanner;/*Importing the Scanner class so 
							as to be able to take the input from the user.*/
public class distanceCalculator {
	public static void main(String[] args) {
		Scanner newScanner = new Scanner(System.in);// I am creating a Scanner object for the user input.
		
		System.out.print("Input distance travelled in miles: "); //This asks the user to provide the miles travelled. 
		double inputMiles = newScanner.nextDouble(); //This code takes the miles input from the user and interprets it as a double type.
		
		System.out.print("Input time travelled in hours: "); //This asks the user to provide the time spent travelling. 
		double inputHours = newScanner.nextDouble(); //This code takes the hours input from the user and interprets it as a double type.
		
		System.out.print("Input gallons of petrol used: "); //This asks the user to provide the gallons of petrol used in the journey. 
		double inputGallons = newScanner.nextDouble(); //This code takes the gallons input from the user and interprets it as a double type.
		
		newScanner.close();/*I added this line to tell the Scanner not to wait for user input anymore.*/
		
		double milesPerHour =  inputMiles / inputHours; //Calculating the miles per hour.
		System.out.println("Average miles per hour: " + milesPerHour);//Printing the result on the screen.

		double milesPerGallon =  inputMiles / inputGallons; //Calculating the miles per gallon.
		System.out.println("Average miles per gallon: " + milesPerGallon);//Printing the result on the screen.
		
	}

}


