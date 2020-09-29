/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run () {
		movingBackward();
	}
	
	

	private void pickPaper(){
			while(noBeepersPresent()) {
				putBeeper();
			}
		
	}
	
	
	private void movingBackward() {
		while (facingEast()) {
			move();
			pickPaper();
			
			if(frontIsBlocked()) {
				turnLeft();
				move();
				turnLeft();
			}
			
			while(facingWest()) {
				move();
				pickPaper();
			 if (frontIsBlocked()) {
				 turnRight();
				 move();
				 turnRight();
			    }
			 move();
			}
			move();
		}
	}
	
	
}

