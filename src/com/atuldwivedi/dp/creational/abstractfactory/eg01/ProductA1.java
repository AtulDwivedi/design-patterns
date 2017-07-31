package com.atuldwivedi.dp.creational.abstractfactory.eg01;

public class ProductA1 extends AbstractProductA {
	
	public ProductA1() {
		System.out.println("Product A1");
	}

	@Override
	public void operationA1() {
		System.out.println(">> Operation A1");
	}

	@Override
	public void operationA2() {
		System.out.println(">> Operation A2");
	}

}
