package com.atuldwivedi.dp.creational.builder.robot;

public interface RobotBuilder {

	public void buildRootHead();

	public void buildRootTorso();

	public void buildRootArms();

	public void buildRootLegs();

	public Robot getRobot();
}
