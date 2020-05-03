package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		
	
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
		Robot a = new Robot(200,600);
		Robot b = new Robot(400,600);
		Robot c = new Robot(600,600);
		Robot d = new Robot(300,400);
		Robot e = new Robot(500,400);
	
		Thread r1 = new Thread(()->drawCircle(a));
		Thread r2 = new Thread(()->drawCircle(b));
		Thread r3 = new Thread(()->drawCircle(c));
		Thread r4 = new Thread(()->drawCircle(d));
		Thread r5 = new Thread(()->drawCircle(e));
		r1.start(); r2.start(); r3.start(); r4.start(); r5.start();
	
	
	
	}
	public static void drawCircle(Robot r) {
		int x =360;
		while (x>0) {
			r.penDown();r.setSpeed(50);r.move(3); r.turn(1);
			x--;
		}
	}
}

