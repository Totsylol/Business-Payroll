public class CommissionIntern extends Volunteer{
// Inheriting Volunteer class
double commission_Rate;	
double total_Sales;
// Creating doubles as listed in PDF

public CommissionIntern(String eName, String eAddress, String ePhone,double commissionRate) {
super(eName, eAddress, ePhone);
commission_Rate = commissionRate;
total_Sales = 0;
// Tweaking our constructor as in PDF
}

public void addSales (double totalSales) {
total_Sales = totalSales;

}

public double pay(){
double payment = super.pay() + (commission_Rate * total_Sales);
total_Sales = 0;
return payment;
// Setting up pay and reseting total sales
}


public String toString() {
return super.toString() + "\nSales: " + total_Sales;
// Displaying our sales

}

}