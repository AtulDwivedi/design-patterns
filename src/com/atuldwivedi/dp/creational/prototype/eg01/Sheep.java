package com.atuldwivedi.dp.creational.prototype.eg01;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep is made.");
	}

	@Override
	public Animal makeCopy() {

		System.out.println("Sheep is being made.");

		Sheep copiedSheep = null;

		try {
			copiedSheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return copiedSheep;
	}

	public String toString() {
		return "This is sheep.";
	}

}
