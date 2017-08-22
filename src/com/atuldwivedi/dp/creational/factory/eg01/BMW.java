package com.atuldwivedi.dp.creational.factory.eg01;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("BMW car is started.");
	}

	@Override
	public void move() {
		System.out.println("BMW car is moving.");
	}

	@Override
	public void stop() {
		System.out.println("BMW car is stoped.");
	}

}
