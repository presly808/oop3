package week8.day2.decor;

public abstract class Ingredient {
	
	private double price;
	private int count;
	private Ingredient next;
	
	public Ingredient(double price, int count, Ingredient next) {
		super();
		this.price = price;
		this.count = count;
		this.next = next;
	}
	
	public double getPrice(){
		double nextPrice = next != null ? next.getPrice() : 0;
		return price * count + nextPrice;
	}
	
}
