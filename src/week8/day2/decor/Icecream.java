package week8.day2.decor;

public class Icecream {
	
	private double price;
	private Ingredient ingredient;
	
	public Icecream(double price, Ingredient ingredient) {
		super();
		this.price = price;
		this.ingredient = ingredient;
	}
	
	public double getTotalPrice(){
		double ingredientPrice = ingredient != null ? ingredient.getPrice() : 0;
		return price + ingredientPrice;
		
	}
	
}
