package apcs.gridWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZigZagBug extends Bug{
	private int sideLength;
    private int seg1;
    private int step;
    
    


    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     * 
     */

    public ZigZagBug(int length)
    {
        seg1 = 0;
        step = 0;
        sideLength = length;
        setDirection(Location.NORTHEAST);
    }
    
    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
    	
    	if (canMove())
        {
    		if(step < sideLength && seg1 <= 4 ) {
    			move();
    			step++;
    		}
    		else if(seg1 ==0) {
   			 	setDirection(Location.SOUTHEAST);
    			step = 0;
    			seg1++;
    			
    		}
    		else if(seg1 ==1) {
   			 	setDirection(Location.NORTHEAST);
    			step = 0;
    			seg1++;

    		}
    		else if(seg1 == 3) {
    			seg1 = 0;
    		}
            
        }


    }
}
