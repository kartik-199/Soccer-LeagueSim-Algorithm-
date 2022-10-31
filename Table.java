import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Table extends JFrame {
	
	public static void main(String[] args) {
		Table t = new Table(EPLSim.simEPL());
		t.setVisible(true);
	}

	private JPanel contentPane;
	public Table(LeagueSim league) {


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500	, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 501, 484, 10);
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(206, 490, 278, 21);
		panel_1_2.setBackground(SystemColor.inactiveCaption);
		contentPane.add(panel_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 278, 26);
		panel_1.setBackground(SystemColor.inactiveCaption);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(206, 0, 278, 21);
		panel_1_1.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_1_1);
		
		JLabel[] pos = new JLabel[20];
		JLabel[] name = new JLabel[20];
		JLabel[] pts = new JLabel[20];
		JLabel[] w = new JLabel[20];
		JLabel[] d = new JLabel[20];
		JLabel[] l = new JLabel[20];
		
		
		
		
		final int k = 20;
		String place, zero;
		for(int i = 0; i<20; i++) {
			place = i+1+"";
			
			
			pos[i] = new JLabel(place);
			name[i] = new JLabel(league.league[i].getName());
			pts[i] = new JLabel(league.league[i].getPts()+"");
			w[i] = new JLabel(league.league[i].getW()+"");
			d[i] = new JLabel(league.league[i].getD()+"");
			l[i] = new JLabel(league.league[i].getL()+"");
			
			
			pos[i].setBounds(0,82+k*i,73,21);
			name[i].setBounds(83, 82+k*i, 106, 19);
			pts[i].setBounds(206, 82+k*i, 73, 21);
			w[i].setBounds(278, 82+k*i, 73, 21);
			d[i].setBounds(308, 82+k*i, 73, 21);
			l[i].setBounds(338, 82+k*i, 73, 21);
			
			
			pos[i].setHorizontalAlignment(SwingConstants.CENTER);
			name[i].setHorizontalAlignment(SwingConstants.CENTER);
			pts[i].setHorizontalAlignment(SwingConstants.CENTER);
			w[i].setHorizontalAlignment(SwingConstants.CENTER);
			d[i].setHorizontalAlignment(SwingConstants.CENTER);
			l[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			
			pos[i].setFont(new Font("Tahoma", Font.BOLD, 16));
			name[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
			pts[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
			w[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
			d[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
			l[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
			
			contentPane.add(pos[i]);
			contentPane.add(name[i]);
			contentPane.add(pts[i]);
			contentPane.add(w[i]);
			contentPane.add(d[i]);
			contentPane.add(l[i]);
			
		}
		
		JButton t1 = new JButton();
		t1.setVisible(true);
		t1.setText("ANALYTICS");
		t1.setBounds(400,82,40,21);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t1);
		t1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[0],1);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t2 = new JButton();
		t2.setVisible(true);
		t2.setText("ANALYTICS");
		t2.setBounds(400,102,40,21);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t2);
		t2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[1],2);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t3 = new JButton();
		t3.setVisible(true);
		t3.setText("ANALYTICS");
		t3.setBounds(400,122,40,21);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t3);
		t3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[2],3);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t4 = new JButton();
		t4.setVisible(true);
		t4.setText("ANALYTICS");
		t4.setBounds(400,142,40,21);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t4);
		t4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[3],4);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t5 = new JButton();
		t5.setVisible(true);
		t5.setText("ANALYTICS");
		t5.setBounds(400,162,40,21);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t5);
		t5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[4],5);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t6 = new JButton();
		t6.setVisible(true);
		t6.setText("ANALYTICS");
		t6.setBounds(400,182,40,21);
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t6);
		t6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[5],6);
				t.setVisible(true);
			}
		}	
		);
		
		
		JButton t7 = new JButton();
		t7.setVisible(true);
		t7.setText("ANALYTICS");
		t7.setBounds(400,202,40,21);
		t7.setHorizontalAlignment(SwingConstants.CENTER);
		t7.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t7);
		t7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[6],7);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t8 = new JButton();
		t8.setVisible(true);
		t8.setText("ANALYTICS");
		t8.setBounds(400,222,40,21);
		t8.setHorizontalAlignment(SwingConstants.CENTER);
		t8.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t8);
		t8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[7],8);
				t.setVisible(true);
			}
		}	
		);
		
		
		JButton t9 = new JButton();
		t9.setVisible(true);
		t9.setText("ANALYTICS");
		t9.setBounds(400,242,40,21);
		t9.setHorizontalAlignment(SwingConstants.CENTER);
		t9.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t9);
		t9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[8],9);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t10 = new JButton();
		t10.setVisible(true);
		t10.setText("ANALYTICS");
		t10.setBounds(400,262,40,21);
		t10.setHorizontalAlignment(SwingConstants.CENTER);
		t10.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t10);
		t10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[9],10);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t11 = new JButton();
		t11.setVisible(true);
		t11.setText("ANALYTICS");
		t11.setBounds(400,282,40,21);
		t11.setHorizontalAlignment(SwingConstants.CENTER);
		t11.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t11);
		t11.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[10],11);
				t.setVisible(true);
			}
		}	
		);
		
		
		JButton t12 = new JButton();
		t12.setVisible(true);
		t12.setText("ANALYTICS");
		t12.setBounds(400,302,40,21);
		t12.setHorizontalAlignment(SwingConstants.CENTER);
		t12.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t12);
		t12.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[11],12);
				t.setVisible(true);
			}
		}	
		);
		
		
		JButton t13 = new JButton();
		t13.setVisible(true);
		t13.setText("ANALYTICS");
		t13.setBounds(400,322,40,21);
		t13.setHorizontalAlignment(SwingConstants.CENTER);
		t13.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t13);
		t13.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[12],13);
				t.setVisible(true);
			}
		}	
		);
		
		
		JButton t14 = new JButton();
		t14.setVisible(true);
		t14.setText("ANALYTICS");
		t14.setBounds(400,342,40,21);
		t14.setHorizontalAlignment(SwingConstants.CENTER);
		t14.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t14);
		t14.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[13],14);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t15 = new JButton();
		t15.setVisible(true);
		t15.setText("ANALYTICS");
		t15.setBounds(400,362,40,21);
		t15.setHorizontalAlignment(SwingConstants.CENTER);
		t15.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t15);
		t15.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[14],15);
				t.setVisible(true);
			}
		}	
		);
		
		
		JButton t16 = new JButton();
		t16.setVisible(true);
		t16.setText("ANALYTICS");
		t16.setBounds(400,382,40,21);
		t16.setHorizontalAlignment(SwingConstants.CENTER);
		t16.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t16);
		t16.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[15],16);
				t.setVisible(true);
			}
		}	
		);
		
		
		JButton t17 = new JButton();
		t17.setVisible(true);
		t17.setText("ANALYTICS");
		t17.setBounds(400,402,40,21);
		t17.setHorizontalAlignment(SwingConstants.CENTER);
		t17.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t17);
		t17.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[16],17);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t18 = new JButton();
		t18.setVisible(true);
		t18.setText("ANALYTICS");
		t18.setBounds(400,422,40,21);
		t18.setHorizontalAlignment(SwingConstants.CENTER);
		t18.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t18);
		t18.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[17],18);
				t.setVisible(true);
			}
		}	
		);
		
		JButton t19 = new JButton();
		t19.setVisible(true);
		t19.setText("ANALYTICS");
		t19.setBounds(400,442,40,21);
		t19.setHorizontalAlignment(SwingConstants.CENTER);
		t19.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t19);
		t19.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[18],19);
				t.setVisible(true);
			}
		}	
		);
		
		
		JButton t20 = new JButton();
		t20.setVisible(true);
		t20.setText("ANALYTICS");
		t20.setBounds(400,462,40,21);
		t20.setHorizontalAlignment(SwingConstants.CENTER);
		t20.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(t20);
		t20.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				TeamInfo t = new TeamInfo(league.league[19],20);
				t.setVisible(true);
			}
		}	
		);
		
		
		
		
		JLabel wins = new JLabel("W");
		wins.setHorizontalAlignment(SwingConstants.CENTER);
		wins.setFont(new Font("Tahoma", Font.BOLD, 18));
		wins.setBounds(278, 59, 73, 21);
		contentPane.add(wins);
		
		
		
		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblD.setBounds(308, 59, 73, 21);
		contentPane.add(lblD);
		
		
		
		JLabel lblL = new JLabel("L");
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblL.setBounds(338, 59, 73, 21);
		contentPane.add(lblL);
		
		JLabel ptsTitle = new JLabel("Points");
		ptsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		ptsTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		ptsTitle.setBounds(205, 59, 73, 21);
		contentPane.add(ptsTitle);
		
		
		
		JLabel teamTitle = new JLabel("Team");
		
		teamTitle.setHorizontalAlignment(SwingConstants.CENTER);
		teamTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		teamTitle.setBounds(100, 59, 73, 21);
		contentPane.add(teamTitle);
		
		JLabel placeTitle = new JLabel("Place");
		placeTitle.setHorizontalAlignment(SwingConstants.CENTER);
		placeTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		placeTitle.setBounds(0, 59, 73, 21);
		contentPane.add(placeTitle);
		
		JLabel lblLeagueTable = new JLabel("LEAGUE TABLE");
		lblLeagueTable.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeagueTable.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLeagueTable.setBounds(178, 32, 143, 21);
		contentPane.add(lblLeagueTable);
		
		JButton back = new JButton("Back");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		back.setBounds(10, 34, 89, 23);
		contentPane.add(back);
		
		setVisible(true);
		
	}
}
