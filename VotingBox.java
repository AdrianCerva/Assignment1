/*
 * File: VotingBox.java
 * ----------------------------
 *this is the first porject for week1 at merit america, 
 *our assignment to to give command to karol robot to see 
 *that is there a Voting Box full or empty, karel will advance box by box 
 *if there is a ballot in the middle boxes it mean is full 
 *but if karol see no ballot in the middle boxes it will clean the bottom box 
 *and the upper box and will continue his way to check each ballot box
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
