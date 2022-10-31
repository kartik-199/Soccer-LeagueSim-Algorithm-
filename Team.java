
public class Team {
	private int ID;
	private String Name;

	private int PlayerCap;
	private int Mgmt;
	private int Morale; 
	private int pts;
	private int W,L,D;
	private int ga, gf;
	
	
	public Team(int id, String name, int playerCap, int mgmt, int morale) {
		ID = id;
		Name = name;
		PlayerCap = playerCap;
		Mgmt = mgmt;
		Morale = morale;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getPlayerCap() {
		return PlayerCap;
	}
	public int getMgmt() {
		return Mgmt;
	}
	public int getMorale() {
		return Morale;
	}
	public int getPts() {
		return pts;
	}
	public void addPts(int amt) {
		pts+=amt;
	}
	public void addW() {
		W++;
	}
	public void addL() {
		L++;
	}
	public void addD() {
		D++;
	}
	public int getW() {
		return W;
	}
	public int getL() {
		return L;
	}
	public int getD() {
		return D;
	}
	public double getPerformanceIndex() {
		return (((double)getW())/38)/(getPlayerCap()/100.0);
	}
	public double wLRatio() {
		return ((double)(W))/L;
	}
	public void addGF(int i) {
		gf+=i;
	}
	public void addGA(int i) {
		ga+=i;
	}
	public int getGF() {
		return gf;
	}
	public int getGA() {
		return ga;
	}


}
