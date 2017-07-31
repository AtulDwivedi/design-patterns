package com.atuldwivedi.dp.creational.builder.robot;

public class TestRobotBuilder {

	public static void main(String[] args) {
		RobotBuilder robotBuilder = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);

		robotEngineer.makeRobot();

		Robot robot = robotEngineer.getRobot();

		System.out.println("Robot built.");
		System.out.println("Robot Head: "+robot.getHead());
		System.out.println("Robot Torso: "+robot.getTorso());
		System.out.println("Robot Arms: "+robot.getArms());
		System.out.println("Robot Legs: "+robot.getLegs());
	}

}
