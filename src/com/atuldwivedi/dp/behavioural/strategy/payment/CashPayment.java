package com.atuldwivedi.dp.behavioural.strategy.payment;

public class CashPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying thru cash.");
	}
}
