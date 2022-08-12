// Critter class extension for a critter called a 'WhiteTiger'
// Represented by a 'tgr'
// Ahmad Shahizan Ibrahim

import java.awt.*;

public class WhiteTiger extends Critter {
	// constructor of the critter WhiteTiger
	public WhiteTiger() {
		
	}
	
	// returns the string value of the WhiteTiger
	public String toString() {
		return "tgr";
	}
	
	// returns the color of the WhiteTiger
	public Color getColor() {
		return Color.WHITE;
	}
	
	// returns the move to be made by the WhiteTiger
	public Action getMove(CritterInfo info) {
		System.out.println(info.getInfectCount() + "WhiteTiger");
		double number = Math.random();
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME) {
			return Action.LEFT;
		} else {
			return Action.HOP;
		}
	}
}