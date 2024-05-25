import java.text.NumberFormat;
import java.util.Scanner;
import java.text.DecimalFormat;
public class TripExpense {
	/* CHECKLIST:
	 * The decimals do not need to be aligned but align the equal "=" signs for readability.     |x|
	 * Constants and variables																	 |x|
	 * Input data																				 |x| 
	 * Calculation includes totals																 |x|
	 * Output display with readable formatting													 |x|
	 * Use the NumberFormat class to format the monetary values and percentages.				 |x|
	 * String class																				 |x|
	 * Check out the Payroll.java file that contains most of the syntax to help you get started. |x|
	 */

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".00");
		Scanner scan = new Scanner(System.in);
		// Declaring object scanner and setting number format for decimal places.
		System.out.print("What is your last name?:");
		String lname = scan.next();
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		// This allows us to NumberFormat our final values into the correct number of decimal places.
		lname = lname.substring(0,1).toUpperCase() + lname.substring(1, lname.length()).toLowerCase();
		/* In order to make the first letter upper-case the method
		   substring is called. When using the method substring we
		   have to indicate which index value we want to allocate
		   the command toUpperCase to. In this scenario the use of
		   a parameter is appropriate "(0,1)". The use of a char in
		   this scenario would not have worked as well as a string
		   because of the differing data types. 
		 */
		System.out.print("Entire airline fair:");
		double A_Fair = scan.nextDouble();
		System.out.print("Number of nights:");
		double N_Night = scan.nextDouble();
		System.out.print("Enter U.S dollars to Naira:");
		double US_Dollars = scan.nextDouble();
		// Asking the user to enter inputs.
		final double PENALTY_CHARGE = 5;
		// Assigning a constant value to the double PENALTY_CHARGE.
		final double PROCESSING_FEE = 3;
		// Assigning a constant value to the double PROCESSING_FEE.
		double HotelExpense = N_Night * 35;
		/* Reference for price 
		https://www.google.com/maps/place/Mayfair+Gardens+Surulere/@6.5054312,3.3272794,12z/data=!4m13!1m6!2m5!1slagos+nigeria+hotel!5m2!9i74!11e1!6e3!3m5!5m2!4m1!1i2!16s%2Fg%2F11ncbnbcx0!17BQ0FF*/
		double total = HotelExpense + A_Fair;
		double ConvertedAmount = US_Dollars * 418.06854;
		double P_Fee = PROCESSING_FEE * US_Dollars / 100 + US_Dollars;
		double P_Charge = PENALTY_CHARGE * US_Dollars / 100 + US_Dollars;
		double Fee_Total = P_Fee - US_Dollars + P_Charge;
		// Created the currency converter and all fees associated
		
		System.out.println("---------------------");
		System.out.println(lname + "'s Expense Report");
		System.out.println("---------------------");
		System.out.println("Airline Fare  = " + fmt1.format(A_Fair));
		System.out.println("Hotel Expense = " + fmt1.format(HotelExpense));
		System.out.println("Total         = " + fmt1.format(total));
		System.out.println("---------------------");
		System.out.println("Currency Converter");
		System.out.println("---------------------");
		System.out.println(fmt1.format(US_Dollars) + " U.S dollars = " + fmt1.format(ConvertedAmount) + " Naira");
		System.out.println("Processing Fee: 3%  = " + fmt1.format(P_Fee));
		System.out.println("Penalty Rate  = 5%  = " + fmt1.format(Fee_Total));
		// Printed out all of the data and converted as such.
		
		
		
		
		
		
		
	}

}




 /* 
`REFERENCE FOR CODE JAVA FILE`
import java.text.NumberFormat;
import java.util.Scanner;

public class Payroll
{
	public static void main(String[] args)
	{
		final double TAXRATE  = .20, MEDRATE = .02; 
		double hrs, rate, grossPay, netPay, tax, med;
		
		NumberFormat fmtCur = NumberFormat.getCurrencyInstance();
		NumberFormat fmtPct = NumberFormat.getPercentInstance();
							
		Scanner scan = new Scanner(System.in);
	
		System.out.print("   Enter hours  ");
		hrs = scan.nextDouble();
		System.out.print("   Enter rate  ");
		rate = scan.nextDouble();
		
		grossPay = rate * hrs;
		med = grossPay * MEDRATE;
		tax = grossPay * TAXRATE;
		netPay = grossPay - (med + tax);
		
		System.out.println("\n   Payroll Calculation");
		
		System.out.println("    Gross Pay = " + grossPay);
		System.out.println("    Net Pay   = " + netPay);
		System.out.println("------------");
		System.out.println("      Gross Pay = " + fmtCur.format(grossPay));
		System.out.println("      Net Pay   = " + fmtCur.format(netPay));
		System.out.println("------------");
		
	    System.out.printf("        Gross Pay = %8.2f\n", grossPay); 
	    System.out.printf("        Net Pay   = %8.2f\n", netPay);
	 
	    System.out.printf("        Tax = %3s  ", fmtPct.format(TAXRATE));  
		
	} 
	
}
*/