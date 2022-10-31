import java.util.ArrayList;

public class LeagueSim {
	public Team[] league;
	private String leagueName;
	
	public LeagueSim(Team[] l, String ln) {
		league = new Team[20];
		
		for(int i = 0; i<20; i++) 
			league[i] = l[i];
		
		leagueName = ln;
		
	}
	
	public void simLeague() {
		Score s;
		Team Home, Away;
		for(int i = 0; i<20; i++) {
			for(int j=0; j<i; j++) {
				
				s = GameSim.simGame(league[i], league[j]);
				if(s.getH()>s.getA()) {
					league[i].addPts(3);
					league[i].addW();
					league[j].addL();
				}
				else if(s.getA()>s.getH()) {
					league[j].addPts(3);
					league[i].addL();
					league[j].addW();
				}
				else {
					league[j].addPts(1);
					league[i].addPts(1);
					league[i].addD();
					league[j].addD();
				}
				league[i].addGF(s.getH());
				league[j].addGA(s.getA());
			}	
			for(int j=i+1; j<20; j++) {
				
				s = GameSim.simGame(league[i], league[j]);
				if(s.getH()>s.getA()) {
					league[i].addPts(3);
					league[i].addW();
					league[j].addL();
				}
				else if(s.getA()>s.getH()) {
					league[j].addPts(3);
					league[i].addL();
					league[j].addW();
				}
				else {
					league[j].addPts(1);
					league[i].addPts(1);
					league[i].addD();
					league[j].addD();
				}
				
				league[i].addGF(s.getH());
				league[j].addGA(s.getA());
			}	
		}
	}
			
		
	
}
