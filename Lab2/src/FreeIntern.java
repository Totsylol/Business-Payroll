public class FreeIntern extends Volunteer {


public FreeIntern(String eName, String eAddress, String ePhone) {
super(ePhone, eName, eAddress);
// Tweaking constructor as in PDF
}

public double pay()
// Making sure our volunteer has no pay
{
	
return 0.0;

}
}

