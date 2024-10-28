/**
*    Author:  MAIY07!!
*    Created: Oct 28, 2024 10:12:24 PM
**/
package Bai8;

public class DiscountProduct extends Product {
	public DiscountProduct () {}
	
	public DiscountProduct(String name, int price, int quantity) {
		super(name, price, quantity);
	}
	
	@Override
	public long calcTotalPrice() {
		long totalPrice = 1L * this.price * this.quantity;
		long discount = (long) (totalPrice * 0.1);
		return totalPrice - discount; 
	}
}
