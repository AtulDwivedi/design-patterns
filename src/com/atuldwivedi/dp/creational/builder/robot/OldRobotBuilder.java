package com.atuldwivedi.dp.creational.builder.robot;

public class OldRobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRootHead() {
		robot.setRobotHead("Tin Head");
		
	}

	@Override
	public void buildRootTorso() {
		 robot.setRobotTorso("Tin Torso");
		
	}

	@Override
	public void buildRootArms() {
		robot.setRobotArms("Tin Arms");
		
	}

	@Override
	public void buildRootLegs() {
		robot.setRobotLegs("Tin Legs");
		
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
