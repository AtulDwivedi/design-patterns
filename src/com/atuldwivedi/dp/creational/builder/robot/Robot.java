package com.atuldwivedi.dp.creational.builder.robot;

public class Robot implements RobotPlan {

	private String head;
	private String torso;
	private String arms;
	private String legs;

	@Override
	public void setRobotHead(String head) {

		this.head = head;

	}

	public String getHead() {
		return head;
	}

	@Override
	public void setRobotTorso(String torso) {
		this.torso = torso;

	}

	public String getTorso() {
		return torso;
	}

	@Override
	public void setRobotArms(String arms) {
		this.arms = arms;

	}

	public String getArms() {
		return arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		this.legs = legs;

	}

	public String getLegs() {
		return legs;
	}

}
