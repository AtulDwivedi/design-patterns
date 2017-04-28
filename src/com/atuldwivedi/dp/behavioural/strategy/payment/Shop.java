package com.atuldwivedi.dp.behavioural.strategy.payment;

public class Shop {
	
	Payment payment;
	
	public void viewItems(){
		System.out.println("Viewing the items.");
	}
	
	public void compareItems(String item1, String item2){
		System.out.println("Comparing "+item1+" and "+item2);
	}
	
	public void selectItem(String item){
		System.out.println("Selected the "+item+" to buy.");
	}
	
	public void purchaseItem(){
		System.out.println("Purchasing the item.");
		payment.pay();
	}
	public void setPayment(Payment payment){
		this.payment = payment;
	}
}
