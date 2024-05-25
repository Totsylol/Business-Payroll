public class Staff
{
private StaffMember[] staffList;

//-----------------------------------------------------------------
// Constructor: Sets up the list of staff members.
//-----------------------------------------------------------------
public Staff ()
{
staffList = new StaffMember[10];

staffList[0] = new Executive ("Tony", "123 Main Line",
"555-0469", "123-45-6789", 2423.07);

staffList[1] = new Employee ("Paulie", "456 Off Line",
"555-0101", "987-65-4321", 1246.15);
staffList[2] = new Employee ("Vito", "789 Off Rocker",
"555-0000", "010-20-3040", 1169.23);

staffList[3] = new Hourly ("Michael", "678 Fifth Ave.",
"555-0690", "958-47-3625", 10.55);

staffList[4] = new Volunteer ("Adrianna", "987 Babe Blvd.",
"555-8374");
staffList[5] = new Volunteer ("Benny", "321 Dud Lane",
"555-7282");
// Two new unpaid interns
staffList[6] = new FreeIntern ("Sally", "092 Ballen St",
"839-9382");

staffList[7] = new FreeIntern ("Robert", "903 StopTheCap Rd",
"983-0398");
// Two new payed interns
staffList[8] = new CommissionIntern ("Casey", "123 Sesame St",
"840-2839",0.1);

staffList[9] = new CommissionIntern ("Natasha", "859 Menace Ln",
"489-9382",0.15);

((Executive)staffList[0]).awardBonus (500.00);

((Hourly)staffList[3]).addHours (40);
// Adding sales for paid staff
((CommissionIntern)staffList[8]).addSales(150);
((CommissionIntern)staffList[9]).addSales(95);
}

//-----------------------------------------------------------------
// Pays all staff members.
//-----------------------------------------------------------------
public void payday ()
{
double amount;

for (int count=0; count < staffList.length; count++)
{
System.out.println (staffList[count]);

amount = staffList[count].pay(); 

if (amount == 0.0)
System.out.println ("Thanks!");  // polymorphic
else
System.out.println ("Paid: " + amount);

System.out.println ("-----------------------------------");
}
}
}