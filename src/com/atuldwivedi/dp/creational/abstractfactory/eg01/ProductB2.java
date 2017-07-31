package com.atuldwivedi.dp.creational.abstractfactory.eg01;

public class ProductB2 extends AbstractProductB {

	public ProductB2() {
		System.out.println("Product B2");
	}
	
	@Override
	public void operationB1() {
		System.out.println(">> Operation B1");			
	}

	@Override
	public void operationB2() {
		System.out.println(">> Operation B2");			
	}

}
