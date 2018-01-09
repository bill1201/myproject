package name;

public class GoldenCustomer extends Customer {
	int returnmoney;
	public GoldenCustomer(int price){
		super(price);
		super.discount=0.1f;
	}
@Override
public void print(){
	int total =(int)(price*(1-discount));
	returnmoney=(int)(price*(discount));
	System.out.println(price+"\t"+total+"\t"+returnmoney);
}
}
