package com.atuldwivedi.dp.creational.prototype.eg01;

public class Dog implements Animal {

	public Dog() {
		System.out.println("Dog is created.");
	}

	@Override
	public Animal makeCopy() {
		
		System.out.println("Dog is being copied.");

		Dog copiedDog = null;

		try {
			copiedDog = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return copiedDog;
	}

	@Override
	public String toString() {
		return "This is dog.";
	}
}
