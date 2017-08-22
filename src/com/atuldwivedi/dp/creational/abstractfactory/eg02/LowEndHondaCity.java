package com.atuldwivedi.dp.creational.abstractfactory.eg02;

public class LowEndHondaCity extends HondaCity  {

	public LowEndHondaCity() {
		System.out.println(this.getClass().getSimpleName()+" is being built.");
	}
}
