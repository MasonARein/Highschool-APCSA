package apcs.gridWorld;


import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug
{
    private int sideLength;
    private int seg1;
    private int step;
    
    


    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     * 
     */

    public ZBug(int length)
    {
        seg1 = 0;
        step = 0;
        sideLength = length;
        setDirection(Location.EAST);
    }
    
    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
    	
    	if (canMove())
        {
    		if(step < sideLength && seg1 <= 7 ) {
    			move();
    			step++;
    		}
    		else if(seg1 ==0) {
   			 	setDirection(Location.SOUTHWEST);
    			step = 0;
    			seg1++;
    			
    		}
    		else if(seg1 ==1) {
   			 	setDirection(Location.EAST);
    			step = 0;
    			seg1++;

    		}
    		else if(seg1 == 2) {
   			 	setDirection(Location.WEST);
    			step = 0;
    			seg1++;
    		}
    		else if(seg1 == 3) {
   			 	setDirection(Location.NORTHEAST);
    			step = 0;
    			seg1++;
    		}
    		else if(seg1 == 4) {
   			 	setDirection(Location.WEST);
    			step = 0;
    			seg1++;
    		}
    		else if(seg1 == 5) {
   			 	setDirection(Location.EAST);
    			step = 0;
    			seg1++;
    		}
    		else if(seg1 == 6) {
    			seg1 = 0;
    		}
            
        }


    }
}
