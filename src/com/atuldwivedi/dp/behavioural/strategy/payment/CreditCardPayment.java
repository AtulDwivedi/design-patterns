package com.atuldwivedi.dp.behavioural.strategy.payment;

public class CreditCardPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying thru credit card.");
	}
}
