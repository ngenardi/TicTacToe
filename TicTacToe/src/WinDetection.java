//test
public class WinDetection {
	
	public boolean DetectWin(int[] array) {
		
		boolean winStatus = false;
		boolean positionInScenario = false;
		int[][] winScenarios = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
		
		for (int[] scenerio: winScenarios) {
			for (int position:scenerio) {
				positionInScenario = false;
				for(int playerPosition:array) {
					if (position == playerPosition) {
						positionInScenario = true;
						break;
					}
				}
				if (positionInScenario == false) {
					break;
				}
			}
			if (positionInScenario == true) {
				winStatus = true;
				break;
			}
		}
		if (winStatus) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	public boolean DetectTie(int[] array) {
		if (array.length==0){
			return true;
		}
		else {
			return false;
		}
	}
}

	
