package com.atuldwivedi.dp.creational.prototype.eg01;

public class PrototypeFactory {

	public Animal getClone(Animal animal) {

		return animal.makeCopy();
	}
}
