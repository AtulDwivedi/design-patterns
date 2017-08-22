package com.atuldwivedi.dp.creational.singleton;

public class Client {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();

		System.out.println(instance.hashCode());

		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance2.hashCode());

		// instance.get
		instance.doSomething();
	}

}
