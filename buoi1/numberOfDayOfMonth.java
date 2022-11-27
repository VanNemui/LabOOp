package lab01;
// Exercises 6.4: numberOfDayOfMonth.java

import java.util.Scanner;
public class numberOfDayOfMonth {
	  public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        int number_Of_DayOfMonth = 0; 
	        String MonthOfName = "Unknown";

	        System.out.print("Input a month number: ");
	        int dMonth = input.nextInt();

	        System.out.print("Input a year: ");
	        int dYear = input.nextInt();

	        switch (dMonth) {
	            case 1:
	                MonthOfName = "January";
	                number_Of_DayOfMonth = 31;
	                break;
	            case 2:
	                MonthOfName = "February";
	                if ((dYear % 400 == 0) || ((dYear % 4 == 0) && (dYear % 100 != 0))) {
	                    number_Of_DayOfMonth = 29;
	                } else {
	                    number_Of_DayOfMonth = 28;
	                }
	                break;
	            case 3:
	                MonthOfName = "March";
	                number_Of_DayOfMonth = 31;
	                break;
	            case 4:
	                MonthOfName = "April";
	                number_Of_DayOfMonth = 30;
	                break;
	            case 5:
	                MonthOfName = "May";
	                number_Of_DayOfMonth = 31;
	                break;
	            case 6:
	                MonthOfName = "June";
	                number_Of_DayOfMonth = 30;
	                break;
	            case 7:
	                MonthOfName = "July";
	                number_Of_DayOfMonth = 31;
	                break;
	            case 8:
	                MonthOfName = "August";
	                number_Of_DayOfMonth = 31;
	                break;
	            case 9:
	                MonthOfName = "September";
	                number_Of_DayOfMonth = 30;
	                break;
	            case 10:
	                MonthOfName = "October";
	                number_Of_DayOfMonth = 31;
	                break;
	            case 11:
	                MonthOfName = "November";
	                number_Of_DayOfMonth = 30;
	                break;
	            case 12:
	                MonthOfName = "December";
	                number_Of_DayOfMonth = 31;
	        }
	        System.out.print(MonthOfName + " " + dYear + " has " + number_Of_DayOfMonth + " days\n");
	    }
	}

