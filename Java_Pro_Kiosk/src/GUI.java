import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GUI extends JFrame {

	private JPanel contentPane;
	private String [] rices = {"","��ġ��","��������","ġŲ����"};
	private int [] rPrices = {0,3500,4000,3000};
	private String [] nuddles = {"","���","�и�"};
	private int [] nPrices = {0,2000,3000};
	private String [] eas = {"","1","2","3","4","5"};
	private JPanel mBorder;
	private JPanel rBorder;
	private JRadioButton [] vat = new JRadioButton [2];
	private String [] vats = {"�ΰ��� ������", "�ΰ��� ����"};
	
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
		setTitle("���� �� ������?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		////////////////////////////////////////////////////////////////////////////////
		mBorder = new JPanel();
		mBorder.setBorder(new TitledBorder(new LineBorder(Color.WHITE,1),"�н��� �ְ�!"));
		mBorder.setLayout(null);
		
		JLabel bab = new JLabel("��",JLabel.CENTER);
		bab.setBounds(23, 27, 12, 15);
		JComboBox<String> rCombo = new JComboBox<String>();
		rCombo.setBounds(40, 23, 106, 23);
		for(int i=0;i<rices.length;i++) {
			rCombo.addItem(rices[i]);
		}
		mBorder.add(bab);
		mBorder.add(rCombo);
		
		JLabel men = new JLabel("��",JLabel.CENTER);
		men.setBounds(23, 58, 12, 15);
		JComboBox<String> mCombo = new JComboBox<String>();
		mCombo.setBounds(40, 54, 106, 23);
		for(int i=0;i<nuddles.length;i++) {
			mCombo.addItem(nuddles[i]);
		}
		mBorder.add(men);
		mBorder.add(mCombo);
		
		JLabel ea = new JLabel("����",JLabel.CENTER);
		ea.setBounds(150, 27, 38, 15);
		JComboBox<String> eCombo = new JComboBox<String>();
		eCombo.setBounds(195, 23, 58, 23);
		for(int i=0;i<eas.length;i++) {
			eCombo.addItem(eas[i]);
		}
		mBorder.add(ea);
		mBorder.add(eCombo);
		
		JCheckBox sy = new JCheckBox("������Ʈ");
		sy.setBounds(23, 84, 125, 23);
		mBorder.add(sy);
		
		mBorder.setSize(277,164);
		mBorder.setLocation(14, 29);
		mBorder.setVisible(true);
		contentPane.add(mBorder);
		
		////////////////////////////////////////////////////////////////////////////////
		rBorder = new JPanel();
		rBorder.setLayout(new FlowLayout());
		rBorder.setBorder(new TitledBorder(new LineBorder(Color.WHITE,1),"������ ����"));
		
		ButtonGroup v = new ButtonGroup();
		
		for(int i=0;i<vat.length;i++) {
			vat[i] = new JRadioButton(vats[i]);
			v.add(vat[i]);
			rBorder.add(vat[i]);
		}
		
		rBorder.setSize(277,74);
		rBorder.setLocation(14, 200);
		rBorder.setVisible(true);
		contentPane.add(rBorder);
		
		////////////////////////////////////////////////////////////////////////////////
		JLabel receipt = new JLabel("������");
		receipt.setBounds(305, 29, 57, 15);
		contentPane.add(receipt);
		
//		JLabel print = new JLabel();
//		print.setOpaque(true);
//		print.setBounds(303,47,182,164);
//		print.setBorder(new LineBorder(Color.BLACK,1));
//		print.setBackground(Color.WHITE);
//		contentPane.add(print);
		
		
		JTextArea ta = new JTextArea();
		JScrollPane print = new JScrollPane(ta,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		print.setBounds(325, 47, 146, 198);
		
		ta.setEditable(false);
		contentPane.add(print);
		
		////////////////////////////////////////////////////////////////////////////////
		JButton btn = new JButton("����ϱ�");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				////////////////////////////////////////////////////////////////////////////////
				if(rCombo.getSelectedItem().toString().equals("")&&
				   mCombo.getSelectedItem().toString().equals("")&&
				   !(sy.isSelected())) {
					JOptionPane.showMessageDialog(null, "�޴��� �����ϼ���!");
					return;
				}
				if(eCombo.getSelectedItem().toString().equals("")) {
					JOptionPane.showMessageDialog(null, "������ Ȯ���ϼ���!");
					return;
				}
				
				int price = 0;
				String menu = "";
				
				if(vat[0].isSelected()) { //no vat
					
					switch(rCombo.getSelectedIndex()) {
						case 0 :
							price += 0;
							break;
						case 1 :
							price += rPrices[1] * Integer.parseInt(eCombo.getSelectedItem().toString());
							menu = rCombo.getSelectedItem().toString() + " X " + eCombo.getSelectedItem().toString() + "\n";
							break;
						case 2 :
							price += rPrices[2] * Integer.parseInt(eCombo.getSelectedItem().toString());
							menu = rCombo.getSelectedItem().toString() + " X " + eCombo.getSelectedItem().toString() + "\n";
							break;
						case 3 :
							price += rPrices[3] * Integer.parseInt(eCombo.getSelectedItem().toString());
							menu = rCombo.getSelectedItem().toString() + " X " + eCombo.getSelectedItem().toString() + "\n";
							break;
						default:
							JOptionPane.showMessageDialog(null, "�� �� ���� ����! �����ڿ��� �����ϼ���~");
							break;
					}
					
					switch(mCombo.getSelectedIndex()) {
						case 0 :
							price += 0;
							break;
						case 1 :
							price += nPrices[1] * Integer.parseInt(eCombo.getSelectedItem().toString());	
							menu += mCombo.getSelectedItem().toString() + " X " + eCombo.getSelectedItem().toString() + "\n";
							break;
						case 2 :
							price += nPrices[2] * Integer.parseInt(eCombo.getSelectedItem().toString());
							menu += mCombo.getSelectedItem().toString() + " X " +eCombo.getSelectedItem().toString() + "\n";
							break;
						default:
							JOptionPane.showMessageDialog(null, "�� �� ���� ����! �����ڿ��� �����ϼ���~");
							break;
					}
					
					if(sy.isSelected()) {
						price += 1500;
						menu += "���� ���Ʈ �߰� \n";
					}
					
					ta.append("@VAT ������@\n");
					ta.append("���� �޴� : \n\n");
					ta.append(menu+"\n");
					ta.append("���� : \n\n");
					ta.append(Integer.toString(price/11*10)+"\n");
					ta.append("---------���뼱---------\n\n\n");
					
				}else if(vat[1].isSelected()) { //vat
					
					switch(rCombo.getSelectedIndex()) {
						case 0 :
							price += 0;
							break;
						case 1 :
							price += rPrices[1] * Integer.parseInt(eCombo.getSelectedItem().toString());
							menu = rCombo.getSelectedItem().toString() + " X " + eCombo.getSelectedItem().toString() + "\n";
							break;
						case 2 :
							price += rPrices[2] * Integer.parseInt(eCombo.getSelectedItem().toString());
							menu = rCombo.getSelectedItem().toString() + " X " + eCombo.getSelectedItem().toString() + "\n";
							break;
						case 3 :
							price += rPrices[3] * Integer.parseInt(eCombo.getSelectedItem().toString());
							menu = rCombo.getSelectedItem().toString() + " X " + eCombo.getSelectedItem().toString() + "\n";
							break;
						default:
							JOptionPane.showMessageDialog(null, "�� �� ���� ����! �����ڿ��� �����ϼ���~");
							break;	
					}
					
					switch(mCombo.getSelectedIndex()) {
						case 0 :
							price += 0;
							break;
						case 1 :
							price += nPrices[1] * Integer.parseInt(eCombo.getSelectedItem().toString());	
							menu += mCombo.getSelectedItem().toString() + " X " + eCombo.getSelectedItem().toString() + "\n";
							break;
						case 2 :
							price += nPrices[2] * Integer.parseInt(eCombo.getSelectedItem().toString());
							menu += mCombo.getSelectedItem().toString() + " X " +eCombo.getSelectedItem().toString() + "\n";
							break;
						default:
							JOptionPane.showMessageDialog(null, "�� �� ���� ����! �����ڿ��� �����ϼ���~");
							break;
					}
					
					if(sy.isSelected()) {
						price += 1500;
						menu += "���� ���Ʈ �߰� \n";
					}
					
					ta.append("@VAT ����@\n");
					ta.append("���� �޴� : \n\n");
					ta.append(menu+"\n");
					ta.append("���� : \n\n");
					ta.append(Integer.toString(price)+"\n");
					ta.append("---------���뼱---------\n\n\n");
					
				}else {
					JOptionPane.showMessageDialog(null, "������ Ÿ���� Ȯ���ϼ���!");
					return;
				}
				
			}
		});
		
		btn.setBounds(326,257,146,23);
		contentPane.add(btn);
		
		
	}
}
