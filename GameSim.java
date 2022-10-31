
public class GameSim {
	public static Score simGame(Team Home, Team Away) {
		Score mgmtScore = sfbScore(Home, Away, 0);
		Score playerCap = sfbScore(Home, Away, 1);
		Score morale = sfbScore(Home, Away, 2);
		
		int hAvg = (int) ((mgmtScore.getH()*3 + playerCap.getH()*5.5 + morale.getH()*1.5)/10);
		int aAvg = (int) ((mgmtScore.getA()*3 + playerCap.getA()*5.5 + morale.getA()*1.5)/10);
		hAvg ++;
		
		return new Score(hAvg, aAvg);
	}
	
	
	//This function below (stands for "single factor based score") calculates a score for a team based only on one of the three factors
	private static Score sfbScore(Team Home, Team Away, int type) {
		int diff=0;
		if(type == 0)
			diff = Home.getMgmt() - Away.getMgmt();
		else if(type == 1)
			diff = Home.getPlayerCap()-Away.getPlayerCap();
		else
			diff = Home.getMorale()-Away.getMorale();
		int scoreDiff = diff/5;
		if(scoreDiff<0) 
			return new Score (0, Math.abs(scoreDiff));
		return new Score (scoreDiff, 0);
	}
}

