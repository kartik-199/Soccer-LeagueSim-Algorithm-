import java.util.ArrayList;

public class EPLSim {
	public static LeagueSim simEPL() {
		Team Leeds = new Team(1,"Leeds",76,75,74);
		Team ManCity = new Team(2, "Man City",85, 95, 95);
		Team Arsenal = new Team(3, "Arsenal",80,92,92);
		Team Chelsea = new Team(4, "Chelsea", 84, 86, 92);
		Team Tottenham = new Team(5, "Tottenham", 82, 88, 87);
		Team ManUtd = new Team(6, "Man Utd", 81, 87, 78);
		Team Newcastle = new Team(7, "Newcastle",78,80,83);
		Team Bournemouth = new Team(8, "Bournemouth",74, 77,79);
		Team WestHam = new Team (9, "West Ham", 79, 80, 77);
		Team Everton = new Team(10, "Everton", 78, 77, 71);
		Team CrystalPalace = new Team(11, "Crystal Palace", 76, 75, 64);
		Team AstonVilla = new Team(12, "Aston Villa", 79, 75, 64);
		Team Brighton = new Team(13, "Brighton", 76, 75, 60);
		Team Liverpool = new Team(14, "Liverpool", 85, 91, 70);
		Team Fulham = new Team(15, "Fulham", 76, 75, 50);
		Team LeicesterCity = new Team(16, "Lecister", 79, 75, 47);
		Team Brentford = new Team(17, "Brentford", 75, 75, 44);
		Team Wolves = new Team(18, "Wolves", 79, 80, 41);
		Team NottmForest = new Team(19, "Nottm Forest", 76, 75, 50);
		Team Southampton = new Team(20, "Southampton", 75, 75, 50);
		
		Team[] league = new Team[20];
		league[0] = Leeds;
		league[1] = ManCity;
		league[2] = Arsenal;
		league[3] = Chelsea;
		league[4] = Tottenham;
		league[5] = ManUtd;
		league[6] = Newcastle;
		league[7] = Bournemouth;
		league[8] = WestHam;
		league[9] = Everton;
		league[10] = CrystalPalace;
		league[11] = AstonVilla;
		league[12] = Brighton;
		league[13] = Liverpool;
		league[14] = Fulham;
		league[15] = LeicesterCity;
		league[16] = Brentford;
		league[17] = Wolves;
		league[18] = NottmForest;
		league[19] = Southampton;
		
		
		LeagueSim prem = new LeagueSim(league,"Prem");
		prem.simLeague();
		
		int len = prem.league.length;
		for(int i = 1; i<len; i++) {
			Team max = prem.league[i];
			int j = i-1;
			while((j>-1) && (prem.league[j].getPts()<max.getPts())) {
				prem.league[j+1]=prem.league[j];
				j--;
			}
			prem.league[j+1] = max;
		}
		
		return prem;
	}
}
