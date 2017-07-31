package com.atuldwivedi.dp.creational.abstractfactory.eg01;

public class ProductA2 extends AbstractProductA {

	public ProductA2() {
		System.out.println("Product A2");
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
