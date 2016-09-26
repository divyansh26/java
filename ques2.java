package MINOR_1_QUES_2;

abstract class ques2 
{
int CustomerId;
String CustomerName;
long PhoneNumber;
double billamount;
public ques2(int customerId, String customerName, long phoneNumber,
		double billamount) 
{
	super();
	CustomerId = customerId;
	CustomerName = customerName;
	PhoneNumber = phoneNumber;
	this.billamount = billamount;
}
abstract double ComputBillamount();
}
class RegularCustomer extends ques2
{
	double Discount;

	public RegularCustomer(int customerId, String customerName,
			long phoneNumber, double billamount) {
		super(customerId, customerName, phoneNumber, billamount);
		
	}
	
	@Override
	double ComputBillamount() {
		Discount=billamount*0.05d;
		billamount=billamount-Discount;
		return billamount;
		
	}
}

class Privilegedcustomer extends ques2
{
		String membercardType;
	public Privilegedcustomer(int customerId, String customerName,
			long phoneNumber, double billamount ,String membercardType) {
		super(customerId, customerName, phoneNumber, billamount);
		this.membercardType=membercardType;
	}

	@Override
	double ComputBillamount() {
		billamount=billamount-0.1d*billamount;
		return billamount;
		
	}
}





