package name;

public class SilverCustomer extends Customer {
	public SilverCustomer(int price){
		super(price);
		super.discount=0.1f;
	}
	
}
