package Ass8;

public class CustomerOrder {
	//declare variables and arrays
	public final int MAX_CAPACITY = 20;
	private long orderId;
	private String customerName;
	private long customerId;
	private long[] productId = new long[MAX_CAPACITY];
	private double[] productCost = new double[MAX_CAPACITY];
	int size = 0;
	
	//constructor
	public CustomerOrder(long orderId, String customerName, long customerId) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.customerId = customerId;
	}
	
	public boolean addItem(long productid, double productcost) {
		//declare an boolean variable
		boolean validOrder;
		if(size < MAX_CAPACITY) { //if the size is below the max capacity
			validOrder = true; //set to true
			//populate the array elements
			productId[size] = productid;
			productCost[size] = productcost;
			//increase size by 1
			size++;
		}
		else {
			validOrder = false; //set to false
		}
		return validOrder;
	}
	
	public double getOrderCost() {
		//declare an accumulator
		double sum = 0;
		for(int i = 0; i < getNumberOfItems(); i++) { //loop
			//add cost to accumulator
			sum += productCost[i];
		}
		return sum;
	}
	
	public int getNumberOfItems() {
		return size + 1; //return a value
	}
	
	public void printOrderInfo() {
		//print the info
		System.out.println("Order ID: " + orderId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer ID: " + customerId);
		System.out.println("Order Cost: $" + getOrderCost());
		System.out.println("Item\tCost");
		for(int i = 0; i < getNumberOfItems() - 1; i++) {
			System.out.println(productId[i] + "\t$" + productCost[i]);
		}
	}
	
	public static void main(String[] args) {
		//declare an object
		CustomerOrder order1 = new CustomerOrder(1, "Billy Bob", 1);
		
		//add 2 items
		order1.addItem(23, 3.45);
		order1.addItem(36, 4.47);
		
		//print info
		order1.printOrderInfo();
	}
}