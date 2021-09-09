// Victor Pacheco, Tri 2, Period 3
package test;
// import scanner
import java.util.Scanner;
public class DayOfTheWeek {
	public static void main(String [] args) {
		
		// instantiate scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user for date and read in input
		System.out.print("Enter birthdate (MM-DD-YYYY): ");
		String date = sc.nextLine();
		sc.close();
		// calling findDay to perform calculations
		int weekday = findDay(date);
		
		
		// printing result to user
		System.out.println("You were born on " + day(weekday));
	}
	
	public static int findDay(String str) {
		// parsing through date to find desired values
		String month = str.substring(0, 2);
		String day = str.substring(3, 5);
		String year = str.substring(8);
		String century = str.substring(6, 8);
		
		// converting strings to integers
		int monthInt = Integer.parseInt(month);
		int dayInt = Integer.parseInt(day);
		int yearInt = Integer.parseInt(year);
		int centuryInt = Integer.parseInt(century);
		
		// creating integer to store result of algorithm and returning it
		int total = dayInt + ((13 * (ifMonth(monthInt) + 1)) / 5) + yearInt + (yearInt / 4) + (centuryInt / 4) + (centuryInt * 5);
		return(total % 7);
	}
	
	public static int ifMonth(int x) {
		// creating integer to store result of ifMonth
		int i = 0;
		// assigning desired value to i based on month
		switch(x){
			case 1:
				i = 13;
				break;
			case 2:
				i = 14;
				break;
			case 3:
				i = 3;
				break;
			case 4:
				i = 4;
				break;
			case 5:
				i = 5;
				break;
			case 6:
				i = 6;
				break;
			case 7:
				i = 7;
				break;
			case 8:
				i = 8;
				break;
			case 9:
				i = 9;
				break;
			case 10:
				i = 10;
				break;
			case 11:
				i = 11;
				break;
			case 12:
				i = 12;
				break;
		}
		
		// returning value
		return(i);
	}
	
	public static String day(int x) {
		// creating string to store what weekday to print
		String str = "";
		
		// switch to find which weekday based on x
		switch(x) {
			case 0:
				str = "Saturday";
				break;
			case 1:
				str = "Sunday";
				break;
			case 2:
				str = "Monday";
				break;
			case 3:
				str = "Tuesday";
				break;
			case 4:
				str = "Wednesday";
				break;
			case 5:
				str = "Thursday";
				break;
			case 6:
				str = "Friday";
				break;
		}
		
		// returning value
		return(str);
	}
}
