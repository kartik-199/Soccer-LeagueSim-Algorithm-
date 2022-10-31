import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EntryForm extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntryForm frame = new EntryForm();
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
	public EntryForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField[] name = new JTextField[20];
		JTextField[] ovr = new JTextField[20];
		JTextField[] mgmt = new JTextField[20];
		JTextField[] mor = new JTextField[20];
		
		for(int i = 0; i<20; i++) {
			name[i] = new JTextField();
			name[i].setBounds(20,60+i*20,120,20);
			contentPane.add(name[i]);
			name[i].setColumns(10);
			name[i].setText("Team Name "+(i+1));
			
			ovr[i] = new JTextField();
			ovr[i].setBounds(160,60+i*20,40, 20);
			contentPane.add(ovr[i]);
			ovr[i].setColumns(2);
			ovr[i].setText("99");
			ovr[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			mgmt[i] = new JTextField();
			mgmt[i].setBounds(220,60+i*20,40, 20);
			contentPane.add(mgmt[i]);
			mgmt[i].setColumns(2);
			mgmt[i].setText("99");
			mgmt[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			mor[i] = new JTextField();
			mor[i].setBounds(280,60+i*20,40, 20);
			contentPane.add(mor[i]);
			mor[i].setColumns(2);
			mor[i].setText("99");
			mor[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		JLabel nameTitle = new JLabel();
		nameTitle.setBounds(20, 30, 120,20);
		nameTitle.setText("Team Name");
		nameTitle.setHorizontalAlignment(SwingConstants.CENTER);
		nameTitle.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(nameTitle);
		
		JLabel ovrT = new JLabel();
		ovrT.setBounds(120, 30, 120,20);
		ovrT.setText("OVR");
		ovrT.setHorizontalAlignment(SwingConstants.CENTER);
		ovrT.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(ovrT);
		
		JLabel MorT = new JLabel();
		MorT.setBounds(180, 30, 120,20);
		MorT.setText("MRL");
		MorT.setHorizontalAlignment(SwingConstants.CENTER);
		MorT.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(MorT);
		
		
		JLabel mgmtT = new JLabel();
		mgmtT.setBounds(240, 30, 120,20);
		mgmtT.setText("MGMT");
		mgmtT.setHorizontalAlignment(SwingConstants.CENTER);
		mgmtT.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(mgmtT);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 278, 10);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(SystemColor.activeCaption);
		panel_1_1.setBounds(206, 0, 278, 10);
		contentPane.add(panel_1_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(0, 482, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Team[] custom = new Team[20];
				for(int i = 0; i<20; i++) {
					custom[i] = new Team(i,name[i].getText(),
					Integer.parseInt(ovr[i].getText()), Integer.parseInt(mgmt[i].getText()),
					Integer.parseInt(mor[i].getText()));
				}
				LeagueSim customSim = new LeagueSim(custom, "Custom");
				customSim.simLeague();
				int len = customSim.league.length;
				for(int i = 1; i<len; i++) {
					Team max = customSim.league[i];
					int j = i-1;
					while((j>-1) && (customSim.league[j].getPts()<max.getPts())) {
						customSim.league[j+1]=customSim.league[j];
						j--;
					}
					customSim.league[j+1] = max;
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Table t = new Table(customSim);
				
				
			}
		});
		btnContinue.setBounds(271, 482, 89, 23);
		contentPane.add(btnContinue);
		
		setVisible(true);
		
		
		
	}
}
