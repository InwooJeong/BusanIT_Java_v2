import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JCheckBox [] habit = new JCheckBox [3];
	private JRadioButton [] gender = new JRadioButton [2];
	private String [] habits = {"����","��","�"};
	private String [] genders = {"����","����"};
	private JPanel hBorder;
	private JPanel gBorder;
	private JPanel mBorder;
	private boolean isNum(String str) {
		return str.matches("^[0-9]*$");
	}

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI frame = new GUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("��ü ���� ���� ����(BMI)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		///////////////////////////////////////////////////////////////////////////////////
		gBorder = new JPanel();
		gBorder.setLayout(new FlowLayout());
		gBorder.setBorder(new TitledBorder(new LineBorder(Color.white,1),"�� ��"));
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0;i<gender.length;i++) {
			gender[i] = new JRadioButton(genders[i]);
			g.add(gender[i]);
			gBorder.add(gender[i]);
		}
		
		gBorder.setSize(178,64);
		gBorder.setLocation(46,184);
		gBorder.setVisible(true);
		contentPane.add(gBorder);
		
		///////////////////////////////////////////////////////////////////////////////////
		hBorder = new JPanel();
		hBorder.setLayout(new FlowLayout());
		hBorder.setBorder(new TitledBorder(new LineBorder(Color.white,1),"�� ��"));
		
		for(int i=0; i<habit.length;i++) {
			habit[i] = new JCheckBox(habits[i]);
			hBorder.add(habit[i]);
		}
		
		hBorder.setSize(178,64);
		hBorder.setLocation(46, 269);
		hBorder.setVisible(true);
		contentPane.add(hBorder);
		
		///////////////////////////////////////////////////////////////////////////////////
		mBorder = new JPanel();
		mBorder.setBorder(new TitledBorder(new LineBorder(Color.white,1),"Body Max Index"));
		mBorder.setLayout(null);
		
		JLabel name = new JLabel("�� �� : ",JLabel.CENTER);
		name.setBounds(12, 40, 40, 15);
		mBorder.add(name);
		JTextField getName = new JTextField(10);
		getName.setBounds(57, 37, 116, 21);
		mBorder.add(getName);
		
		JLabel height = new JLabel("Ű : ",JLabel.CENTER);
		height.setBounds(22, 65, 24, 15);
		mBorder.add(height);
		JTextField getHeight = new JTextField(10);
		getHeight.setText("--");
		getHeight.setBounds(57, 62, 116, 21);
		mBorder.add(getHeight);
		JLabel cm = new JLabel("(cm)", SwingConstants.CENTER);
		cm.setBounds(177, 65, 36, 15);
		mBorder.add(cm);
		
		JLabel weight = new JLabel("ü �� : ",JLabel.CENTER);
		weight.setBounds(12, 90, 40, 15);
		mBorder.add(weight);
		JTextField getWeight = new JTextField(10);
		getWeight.setText("--");
		getWeight.setBounds(57, 87, 116, 21);
		mBorder.add(getWeight);
		JLabel kg = new JLabel("(kg)", SwingConstants.CENTER);
		kg.setBounds(177, 90, 36, 15);
		mBorder.add(kg);
		
		mBorder.setSize(221,283);
		mBorder.setLocation(22, 56);
		mBorder.setVisible(true);
		contentPane.add(mBorder);
		
		///////////////////////////////////////////////////////////////////////////////////
		JLabel BMIr = new JLabel("BMI ���");
		BMIr.setBounds(282, 63, 57, 15);
		contentPane.add(BMIr);
		
		JLabel BMIresult = new JLabel();
		BMIresult.setVerticalAlignment(SwingConstants.TOP);
		BMIresult.setBounds(282,81,183,151);
		BMIresult.setBorder(new LineBorder(Color.GRAY,1));
		contentPane.add(BMIresult);
		
		JLabel colour = new JLabel();
		colour.setBounds(315,144,119,79);
		colour.setBorder(new LineBorder(Color.GRAY,1));
		colour.setOpaque(true);
		contentPane.add(colour);
		
		///////////////////////////////////////////////////////////////////////////////////
		JLabel opinion = new JLabel("�� ��");
		opinion.setBounds(282, 242, 57, 15);
		contentPane.add(opinion);
		
		JLabel opinionSet = new JLabel();
		opinionSet.setBounds(282,258,186,79);
		opinionSet.setBorder(new LineBorder(Color.GRAY,1));
		contentPane.add(opinionSet);
		
		///////////////////////////////////////////////////////////////////////////////////
		JButton btn = new JButton("��ü ���� ����");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton b = (JButton)e.getSource();
				GUI ct = (GUI)b.getTopLevelAncestor();
				
				//////////////////////////////////////////////////////////////////////////////////
				if(getName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� Ȯ���ϼ���!");
					return;
				}
				if(getHeight.getText().equals("")||!isNum(getHeight.getText())) {
					JOptionPane.showMessageDialog(null, "������ Ȯ���ϼ���!");
					return;
				}
				if(getWeight.getText().equals("")||!isNum(getWeight.getText())) {
					JOptionPane.showMessageDialog(null, "ü���� Ȯ���ϼ���!");
					return;
				}
				
				String adj = "";
				
				if(gender[0].isSelected()) {
					adj = "�Ƹ��ٿ�";
				}else if(gender[1].isSelected()){
					adj = "����";
				}else {
					JOptionPane.showMessageDialog(null, "����!");
					return;
				}
				
				//////////////////////////////////////////////////////////////////////////////////
				ct.setTitle("��ü ���� ���� ����(BMI)_"+getName.getText());
				
				double height = Double.parseDouble(getHeight.getText());
				double weight = Double.parseDouble(getWeight.getText());
				double bmi = weight/((height/100)*(height/100));
				int chk = 0;
				
				if(bmi<18.5) {
					chk = 1;
				}else if(bmi>=18.5 && bmi<23.0) {
					chk = 2;
				}else if(bmi>=23.0 && bmi<25.0) {
					chk = 3;
				}else if(bmi>=25.0 && bmi<30.0) {
					chk = 4;
				}else {
					chk = 5;
				}

				String sts = null;
				
				switch(chk) {
					case 1:
						sts = "��ü��";
						colour.setBackground(Color.BLUE);
						break;
					case 2:	
						sts = "����";
						colour.setBackground(Color.GREEN);
						break;
					case 3:
						sts = "��ü��";
						colour.setBackground(Color.RED);
						break;
					case 4:
						sts = "�ߵ���";
						colour.setBackground(Color.RED);
						break;
					case 5:
						sts = "����";
						colour.setBackground(Color.RED);
						break;
					default:
						JOptionPane.showMessageDialog(null, "�� �� ���� ����! �����ڿ��� �����ϼ���~");
						break;
				}
				
				//////////////////////////////////////////////////////////////////////////////////
				BMIresult.setText("<html><body style='vertical-align:top;'>"+adj+"&nbsp;"+getName.getText()+"���� <br> ��ü ���� ������ :<br>"
						+bmi+"("+sts+")�Դϴ�.");
				
				//////////////////////////////////////////////////////////////////////////////////
				String dr = "";
				String sk = "";
				String ex = "";
				
				if(habit[0].isSelected()) {
					dr = "�� �׸� ���ſ�!";
				}else {
					dr = "";
				}
				if(habit[1].isSelected()) {
					sk = "��� ��������!";
				}else {
					sk = "";
				}
				if(habit[2].isSelected()) {
					ex = "";
				}else {
					ex = "� �� �ϼ���!";
				}
				
				opinionSet.setText("<html><body>"+dr+"<br>"+sk+"<br>"+ex+"</body></html>");
			}
		});
		
		btn.setBounds(327, 27, 146, 23);
		contentPane.add(btn);
		
	}
}
