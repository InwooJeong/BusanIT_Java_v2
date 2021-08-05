package com.pro3.b3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JPanel oBorder;
	private JRadioButton[] level = new JRadioButton[2];
	private String[] levels = { "easy", "hard" };
	private JPanel nBorder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		//////////////////////////////////////////////////////////////////////////////////////
		oBorder = new JPanel();
		oBorder.setLocation(83, 10);
		oBorder.setLayout(new FlowLayout());
		oBorder.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 1), "Select a difficulty level",
				TitledBorder.CENTER, TitledBorder.TOP));

		ButtonGroup g = new ButtonGroup();

		for (int i = 0; i < level.length; i++) {
			level[i] = new JRadioButton(levels[i]);
			g.add(level[i]);
			oBorder.add(level[i]);
		}

		oBorder.setSize(207, 58);
		oBorder.setVisible(true);
		contentPane.add(oBorder);

		//////////////////////////////////////////////////////////////////////////////////////
		JLabel ResultL = new JLabel();
		ResultL.setVerticalAlignment(SwingConstants.BOTTOM);
		ResultL.setBounds(83, 78, 207, 206);
		ResultL.setBorder(
				new TitledBorder(new LineBorder(Color.DARK_GRAY, 1), "Relay", TitledBorder.CENTER, TitledBorder.TOP));
		contentPane.add(ResultL);

		JTextArea ta = new JTextArea();
		JScrollPane print = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		print.setBounds(109, 102, 162, 167);
		print.setBorder(new LineBorder(Color.DARK_GRAY, 1));
		contentPane.add(print);

		//////////////////////////////////////////////////////////////////////////////////////
		nBorder = new JPanel();
		nBorder.setLocation(98, 339);
		nBorder.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 1), "Insert Number", TitledBorder.CENTER,
				TitledBorder.TOP));
		nBorder.setLayout(new FlowLayout());
		nBorder.setSize(178, 52);
		nBorder.setVisible(true);
		contentPane.add(nBorder);

		JTextField getNum = new JTextField(10);
		getNum.setBorder(new LineBorder(Color.DARK_GRAY, 1));
		nBorder.add(getNum);

		//////////////////////////////////////////////////////////////////////////////////////
		JButton btn = new JButton("START!");

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//////////////////////////////////////////////////////////////////////////////////////
				if (level[0].isSelected()) {
					btn.setEnabled(false);
					ta.append("---EASY MODE START!---\n");

					getNum.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// JTextField t = (JTextField)e.getSource();
//							ta.append(getNum.getText()+"\n");
							// getNum.setText(null);
							
								ta.append("!");
								
								int end = 0;
								
								while(true) {
								
									//ta.append("2");		
									
									int user = 1;
									/////////////////////// human////////////////////////
									while (true) {
										ta.append("Human turn(insert 1~3)! \n");

//									if(getNum.getText().equals("")) {
//										
//										getNum.addActionListener(new ActionListener() {
//											@Override
//											public void actionPerformed(ActionEvent e) {
//												JTextField getNum = (JTextField)e.getSource();
//												getNum.setText(getNum.getText().toString());
//											}
//										});
//										
//										return;
//									}else {
//										getNum.addActionListener(new ActionListener() {
//											@Override
//											public void actionPerformed(ActionEvent e) {
//												JTextField getNum = (JTextField)e.getSource();
//												getNum.setText(getNum.getText().toString());
//											}
//										});
//										ta.append("DD");
//									}

										user = Integer.parseInt(getNum.getText());

										if (1 <= user && user <= 3) {
											getNum.setText(null);
											break;
										} else {
											ta.append("Check Number!(ONYL 1~3!) \n");
											getNum.setText(null);
											return;
										}
									}

									for (int i = end + 1; i <= end + user; i++) {
										if (i > 31) {
											break;
										}
										ta.append("YOU : " + i + "~ \n");
									}

									end += user;

									if (end >= 31) {
										// ta.append(end+":end check \n");
										JOptionPane.showMessageDialog(null, "Loser!");
										 break;
										//return;
									}

									//////////////////// Com//////////////////
									int com = (int) (Math.random() * 3) + 1;

									for (int i = end + 1; i <= end + com; i++) {
										if (i > 31) {
											break;
										}
										ta.append("COM : " + i + "~ \n");
									}

									end += com;

									if (end >= 31) {
										JOptionPane.showMessageDialog(null, "Winner!");
										 break;
										//return;
									}
									
									//getNum.setText(null);
//									getNum.addActionListener(new ActionListener() {
//										@Override
//										public void actionPerformed(ActionEvent e) {
//											JTextField getNum = (JTextField)e.getSource();
//											getNum.setText(getNum.getText().toString());
//										}
//									});

								}//

						}
					});//

					//////////////////////////////////////////////////////////////////////////////////////
				} else if (level[1].isSelected()) {
					btn.setEnabled(false);
					ta.append("---HARD MODE START!---");

				} else {
					JOptionPane.showMessageDialog(null, "Select a difficulty level!");
					return;
				}

			}
		});

		btn.setBounds(135, 294, 97, 23);
		contentPane.add(btn);
	}
}
