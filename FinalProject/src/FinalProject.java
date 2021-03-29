public class FinalProject
{
		int playero;
		int playerx;
		
		static int[] openPositions = {0,1,2,3,4,5,6,7,8};
	    static int[] xPositions = {9,9,9,9,9,9,9,9,9};
	    static int[] oPositions = {9,9,9,9,9,9,9,9,9};
	    
	    static boolean oMove(int position, int turn) {
	        int playerTurn = turn/2+1;
	        for(int i=0; i<9;i++) {
	            if (openPositions[i] == position) {
	                oPositions[playerTurn-1] = position;
	                openPositions[i] = 9;
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    static boolean xMove(int position, int turn) {
	        int playerTurn = turn/2;
	        for(int i=0; i<9;i++) {
	            if (openPositions[i] == position) {
	                xPositions[playerTurn-1] = position;
	                openPositions[i] = 9;
	                return true;
	            }
	        }
	        return false;
	    }
		
		
	}
		
	
