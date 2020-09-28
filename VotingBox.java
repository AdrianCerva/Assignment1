/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class VotingBox extends SuperKarel {
	
	
//	This is were call the main methods in this class
        public void run() {
		firstStep();
		boxWithNoBeepers();
		
	}
	
//     Method that set on position Karel to start to collect the unused box
	private void firstStep() {
		turnLeft();
		move();
		move();
		turnRight();
	}
	
//	Main Method on this class were the condition to move from box to see that
//	it totally full or totally empty
	
	
	  private void boxWithNoBeepers() {
		while(frontIsClear()) {
	       move();
		if(noBeepersPresent()) {
			turnRight();
			move();
			moveCleanBox();
			beeperClearUp();
			}
		move();
	  }
	 
	}
	
	
// pick up anything is at the box
	private void moveCleanBox(){
		while(beepersPresent()) {
			pickBeeper();
		}
	 }
	
// move up and clean the upper box
	private void beeperClearUp() {
		turnLeft();
		  turnLeft();
		  move();
		  move();
		  moveCleanBox();
		  turnRight();
		  backToTrack();
	}
	
// put roobot back on the track wait for the command	
	private void backToTrack() {
		turnRight();
		move();
		turnLeft();
	}
	

}
