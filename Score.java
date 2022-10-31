
public class Score {
	private int home = 0; 
	private int away = 0;
	
	public Score (int h, int a){
		home = h; 
		away = a;
	}
	
	public int getH() {
		return home;
	}
	
	public int getA() {
		return away;
	}
	
	public String toString() {
		return home + " : "+ away;
	}
}
