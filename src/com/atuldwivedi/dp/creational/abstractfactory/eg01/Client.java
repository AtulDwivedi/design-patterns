package com.atuldwivedi.dp.creational.abstractfactory.eg01;

public class Client {
	public static void main(String args[]){
		AbstractFactory pf=FactoryMaker.getFactory("b");
		AbstractProductB product=pf.createProductB();
		product.operationB1();
		product.operationB2();
	}
}
