package com.atuldwivedi.dp.behavioural.strategy.payment;

public class OnlineClient {
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.viewItems();
		shop.compareItems("Apple 7", "Apple 7S");
		shop.selectItem("Apple 7S");
		shop.setPayment(new CreditCardPayment());
		shop.purchaseItem();
	}
}
