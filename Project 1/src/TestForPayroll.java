import java.text.NumberFormat;
import java.util.Scanner;

public class TestForPayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
