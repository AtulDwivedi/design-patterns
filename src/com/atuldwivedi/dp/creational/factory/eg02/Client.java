package com.atuldwivedi.dp.creational.factory.eg02;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		EnemyShip enemyShip = null;

		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

		System.out.println("what type of shipt?(U/R/B): ");

		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextLine()) {
			String typeOfShip = scanner.nextLine();
			enemyShip = enemyShipFactory.makeEnemyShip(typeOfShip);
		}

		if (enemyShip != null)
			duStuffEnemy(enemyShip);
	}

	private static void duStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followEnemyShip();
		enemyShip.enemyShipShoots();

	}

}
