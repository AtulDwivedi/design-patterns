package com.atuldwivedi.dp.creational.abstractfactory.eg02;

public class LowEndHondaFactory extends HondaFactory {

	@Override
	public HondaCity getHondaCity() {
		return new LowEndHondaCity();
	}

	@Override
	public HondaAmaze getHondaAmaze() {
		return new LowEndHondaAmaze();
	}

}
