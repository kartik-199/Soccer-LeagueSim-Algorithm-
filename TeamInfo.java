import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class TeamInfo extends JFrame {

	private JPanel ResultTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamInfo frame = new TeamInfo(EPLSim.simEPL().league[0],1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TeamInfo(Team t, int pos) {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ResultTitle = new JPanel();
		ResultTitle.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ResultTitle);
		ResultTitle.setLayout(null);
		
		JLabel RatioTitle = new JLabel("W/L Ratio");
		RatioTitle.setHorizontalAlignment(SwingConstants.LEFT);
		RatioTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		RatioTitle.setBounds(10, 75, 122, 21);
		ResultTitle.add(RatioTitle);
		
		JLabel lblPerformanceIndex = new JLabel("Result Efficiency Index");
		lblPerformanceIndex.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerformanceIndex.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPerformanceIndex.setBounds(10, 100, 244, 21);
		ResultTitle.add(lblPerformanceIndex);
		
		JLabel EuropeanTitle = new JLabel("European Qualification");
		EuropeanTitle.setHorizontalAlignment(SwingConstants.LEFT);
		EuropeanTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		EuropeanTitle.setBounds(10, 125, 207, 21);
		ResultTitle.add(EuropeanTitle);
		
		JLabel GCTitle = new JLabel("GD, GF, GA");
		GCTitle.setHorizontalAlignment(SwingConstants.LEFT);
		GCTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		GCTitle.setBounds(10, 150, 207, 21);
		ResultTitle.add(GCTitle);
		
		JLabel RelegationTitle = new JLabel("Relegation");
		RelegationTitle.setHorizontalAlignment(SwingConstants.LEFT);
		RelegationTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		RelegationTitle.setBounds(10, 175, 207, 21);
		ResultTitle.add(RelegationTitle);
		
		JLabel lblTeamAnalytics = new JLabel("TEAM ANALYTICS");
		lblTeamAnalytics.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamAnalytics.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTeamAnalytics.setBounds(78, 11, 278, 28);
		ResultTitle.add(lblTeamAnalytics);
		
		double r = t.wLRatio();
	
		String range;
		if(r>3) 
			range = "Good";
		else if(r>1)
			range = "Average";
		else
			range = "Low";
		
		JLabel ratio = new JLabel();
		ratio.setText(range+", "+r);
		ratio.setHorizontalAlignment(SwingConstants.RIGHT);
		ratio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ratio.setBounds(302, 75, 122, 21);
		ResultTitle.add(ratio);
		
		JLabel efficiency = new JLabel((double)(Math.round(t.getPerformanceIndex()*100))/100+"");
		efficiency.setHorizontalAlignment(SwingConstants.RIGHT);
		efficiency.setFont(new Font("Tahoma", Font.PLAIN, 18));
		efficiency.setBounds(302, 100, 122, 21);
		ResultTitle.add(efficiency);
		
		if(pos<5)
			range = "UCL";
		else if(pos==5)
			range = "UEL";
		else
			range = "None";
		JLabel qualification = new JLabel(range);
		qualification.setHorizontalAlignment(SwingConstants.RIGHT);
		qualification.setFont(new Font("Tahoma", Font.PLAIN, 18));
		qualification.setBounds(302, 125, 122, 21);
		ResultTitle.add(qualification);
		
		JLabel gstats = new JLabel(t.getGF()-t.getGA()+", "+t.getGF()+", "+t.getGA());
		gstats.setHorizontalAlignment(SwingConstants.RIGHT);
		gstats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gstats.setBounds(302, 150, 122, 21);
		ResultTitle.add(gstats);
		
		
		if(pos>17)
			range = "YES";
		else
			range = "NO";
		JLabel relegation = new JLabel(range);
		relegation.setHorizontalAlignment(SwingConstants.RIGHT);
		relegation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		relegation.setBounds(302, 175, 122, 21);
		ResultTitle.add(relegation);
		
		JButton back = new JButton("BACK");
		back.setBounds(178, 227, 89, 23);
		ResultTitle.add(back);
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			
		});
		
	}

}
