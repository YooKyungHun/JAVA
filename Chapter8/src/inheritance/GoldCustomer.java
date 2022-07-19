package inheritance;

public class GoldCustomer extends Customer{


	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}

	public static void main(String[] args) {

		GoldCustomer customerLee = new GoldCustomer();
		System.out.println(customerLee.calcPrice(10000));
	}
}

