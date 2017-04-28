package com.atuldwivedi.dp.behavioural.strategy.payment;

public class NetBankingPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying thru net banking.");
	}
}
