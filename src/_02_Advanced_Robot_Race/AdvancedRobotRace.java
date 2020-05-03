package _02_Advanced_Robot_Race;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static void main(String[] args) {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
		Robot a = new Robot(300,600);
		a.setSpeed(50);
		Robot b = new Robot(500,600);
		b.setSpeed(45);
		Robot c = new Robot(700,600);
		c.setSpeed(55);
	
		Thread t1 = new Thread(()->a.move(400));
		Thread t2 = new Thread(()->b.move(400));
		Thread t3 = new Thread(()->c.move(400));
		t1.start(); t2.start(); t3.start();
	}
}
