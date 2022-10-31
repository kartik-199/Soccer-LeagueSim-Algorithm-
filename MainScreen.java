import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.management.timer.Timer;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.ScrollPane;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500	, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JLabel title = new JLabel("Soccer LeagueSim Algorithm");
		title.setBounds(0, 151, 484, 61);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Calibri", Font.PLAIN, 40));
		contentPane.add(title);
		
		JButton preset = new JButton("Begin With Preset EPL ");
		preset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				preset.setFont(new Font("Arial", Font.BOLD, 15));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				preset.setFont(new Font("Arial", Font.PLAIN, 15));
			}
			
			public void mouseClicked(MouseEvent e) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				Table t = new Table(EPLSim.simEPL());
				
				
			}
		});
		preset.setFont(new Font("Arial", Font.PLAIN, 15));
		preset.setBounds(135, 228, 213, 30);
		contentPane.add(preset);
		
		
		JButton newLeague = new JButton("Create Custom Simulation");
		newLeague.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				newLeague.setFont(new Font("Arial", Font.BOLD, 15));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				newLeague.setFont(new Font("Arial", Font.PLAIN, 15));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				EntryForm form = new EntryForm();
				
			}
		});
		newLeague.setFont(new Font("Tahoma", Font.PLAIN, 15));
		newLeague.setBounds(135, 254, 213, 25);
		contentPane.add(newLeague);
		
		JButton Help = new JButton("Help");
		Help.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Help.setFont(new Font("Arial", Font.BOLD, 15));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Help.setFont(new Font("Arial", Font.PLAIN, 15));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "This algorithm is intended to simulate a professional soccer league based off a variety of factors\nand provide final results and team analytics. Start off by using the preset "
						+ "22/23 English Premier\nLeague or create your own league with customized team data.");
				
			}
		});
		Help.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Help.setBounds(135, 276, 213, 25);
		contentPane.add(Help);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 468, 484, 43);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 278, 100);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(SystemColor.activeCaption);
		panel_1_1.setBounds(206, 0, 278, 68);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(SystemColor.inactiveCaption);
		panel_1_2.setBounds(206, 411, 278, 100);
		contentPane.add(panel_1_2);
	}
}
