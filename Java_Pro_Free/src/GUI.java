import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JLabel imageLabel;
	private String [] stas = {"OPEN","CLOSE"};
	private JPanel sBorder;
	private JRadioButton [] sta = new JRadioButton [2];
	private ImageIcon [] image = {
						new ImageIcon("images/open.jpg"),
						new ImageIcon("images/close.gif")
				};

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Welcome to Our Restaurant!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel imageLabel = new JLabel();
		imageLabel.setBounds(23,23,621,324);
		imageLabel.setBorder(new LineBorder(Color.BLACK));
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(imageLabel);
		
		sBorder = new JPanel();
		sBorder.setLayout(new FlowLayout());
		sBorder.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"매장 상태",TitledBorder.CENTER,TitledBorder.TOP));
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0;i<sta.length;i++) {
			sta[i] = new JRadioButton(stas[i]);
			g.add(sta[i]);
			sBorder.add(sta[i]);
			sta[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(sta[0].isSelected()) {
						imageLabel.setIcon(image[0]);
					}else {
						imageLabel.setIcon(image[1]);
					}
				}
			});
		}
		
		sBorder.setBounds(239,357,204,66);
		sBorder.setVisible(true);
		contentPane.add(sBorder);
	}

}
