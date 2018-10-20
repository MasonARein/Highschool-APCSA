package apcs.gridWorld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZigZagBug extends Bug {
	private int sideLength;
	private int step;
	private int direct;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length the side length
	 * 
	 */

	public ZigZagBug(int length) {
		step = 0;
		direct = 0;
		sideLength = length;
		setDirection(Location.NORTHEAST);
		setColor(Color.GREEN);
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		direct = (int) ((Math.random() * 2));
		if (canMove()) {
			if (step < sideLength) {
				move();
				step++;
			} else if (direct == 0) {
				setDirection(getDirection() + 90);
				step = 0;

			} else if (direct == 1) {
				setDirection(getDirection() - 90);
				step = 0;

			}

		} else {
			setDirection(getDirection() + 90);
		}

	}
}
