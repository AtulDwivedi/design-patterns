package com.atuldwivedi.dp.creational.abstractfactory.eg02;

public class CarClient {
	
	public static void main(String[] args) {
		HondaFactory hf = HondaShowRoom.getCar("h");
		hf.getHondaCity();
	}

}
