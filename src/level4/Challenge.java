package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * complete the MAZE Hint: use bump sensors
	 */

	public void initialize() {
		goStraight(2000);
	}

	public void loop() {
		if (leftBump) {
			goBackwards(1000);
			turnRight(2250);
			leftBump = false;
			rightBump = false;
			goStraight(10000);
		}
		if (rightBump) {
			goBackwards(1000);
			turnLeft(2250);
			leftBump = false;
			rightBump = false;
			goStraight(10000);
		}
	}

	void goStraight(int duration) {
		driveDirect(500, 500);
		sleep(duration);
	}

	void goBackwards(int duration) {
		driveDirect(-500, -500);
		sleep(duration);
	}

	void turnLeft(int duration) {
		driveDirect(100, 0);
		sleep(duration);
	}

	void turnRight(int duration) {
		driveDirect(0, 100);
		sleep(duration);
	}
}
