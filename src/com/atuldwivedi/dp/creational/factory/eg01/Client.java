package com.atuldwivedi.dp.creational.factory.eg01;

public class Client {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car car = carFactory.createCar();

		car.start();
		car.move();
		car.stop();
	}
}
