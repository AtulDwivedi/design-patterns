package com.atuldwivedi.dp.creational.factory.eg02;

public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String newShiptype) {
		EnemyShip newShip = null;

		if (newShiptype.equals("U")) {
			newShip = new UFOEnemyShip();
		} else if (newShiptype.equals("R")) {
			newShip = new RocketEnemyShip();
		} else if (newShiptype.equals("B")) {
			newShip = new BigUFOEnemyShip();
		}
		return newShip;
	}
}
