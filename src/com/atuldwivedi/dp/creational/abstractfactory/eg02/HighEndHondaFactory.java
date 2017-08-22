package com.atuldwivedi.dp.creational.abstractfactory.eg02;

public class HighEndHondaFactory extends HondaFactory {

	@Override
	public HondaCity getHondaCity() {
		return new HighEndHondaCity();
	}

	@Override
	public HondaAmaze getHondaAmaze() {
		return new HighEndHondaAmaze();
	}

}
