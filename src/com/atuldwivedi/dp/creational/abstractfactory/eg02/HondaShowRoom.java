package com.atuldwivedi.dp.creational.abstractfactory.eg02;

public class HondaShowRoom {
	
	public static HondaFactory getCar(String carModel){
		if(carModel.equals("h")){
			return new HighEndHondaFactory();
		}else if (carModel.equals("l")) {
			return new LowEndHondaFactory();
		}
		return null;
	}

}
