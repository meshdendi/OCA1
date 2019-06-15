package ch01;
public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	static double taxRate;
	
	static {
		taxRate = 0.05;
	}
	
	public Order() {
		this.product = "Anvil";
		this.quantity = 1;
	}
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}
	
	public Order(MyDate d,double amnt, String c) {
		this();
		this.orderDate = d;
		this.orderAmount = amnt;
		this.customer = c;
	}

	
	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}
	
	public static void computeTaxOn(double amount) {
		System.out.println("The tax for " + amount + " is: " + amount * taxRate);
	}
	
	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * taxRate);
		return orderAmount * taxRate;
	}
		
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
