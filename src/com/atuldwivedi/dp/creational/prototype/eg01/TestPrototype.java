package com.atuldwivedi.dp.creational.prototype.eg01;

public class TestPrototype {

	public static void main(String[] args) {
		
		PrototypeFactory animalMaker = new PrototypeFactory();

		Sheep s1 = new Sheep();

		Sheep s2 = (Sheep) animalMaker.getClone(s1);

		System.out.println(s1);
		System.out.println(s2);

		System.out.println("S1 hashCode: " + System.identityHashCode(s1));
		System.out.println("S2 hashCode: " + System.identityHashCode(s2));
		
		Dog d1 = new Dog();
		
		Dog d2 = (Dog)animalMaker.getClone(d1);
		
		System.out.println(d1);
		System.out.println(d2);

		System.out.println("D1 hashCode: " + System.identityHashCode(d1));
		System.out.println("D2 hashCode: " + System.identityHashCode(d2));
		
		
	}
}
