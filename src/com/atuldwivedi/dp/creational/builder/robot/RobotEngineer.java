package com.atuldwivedi.dp.creational.builder.robot;

public class RobotEngineer {

	private RobotBuilder robotBuilder;

	public RobotEngineer(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}

	public Robot getRobot() {
		return robotBuilder.getRobot();
	}

	public void makeRobot() {
		this.robotBuilder.buildRootHead();
		this.robotBuilder.buildRootTorso();
		this.robotBuilder.buildRootArms();
		this.robotBuilder.buildRootLegs();
	}
}
