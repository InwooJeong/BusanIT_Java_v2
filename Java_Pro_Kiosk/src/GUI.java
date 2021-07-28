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
	private String [] rices = {"","고치돈","제육볶음","치킨마요"};
	private int [] rPrices = {0,3500,4000,3000};
	private String [] nuddles = {"","라면","밀면"};
	private int [] nPrices = {0,2000,3000};
	private String [] eas = {"","1","2","3","4","5"};
	private JPanel mBorder;
	private JPanel rBorder;
	private JRadioButton [] vat = new JRadioButton [2];
	private String [] vats = {"부가세 미포함", "부가세 포함"};
	
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
		setTitle("저녁 뭐 먹을래?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		////////////////////////////////////////////////////////////////////////////////
		mBorder = new JPanel();
		mBorder.setBorder(new TitledBorder(new LineBorder(Color.WHITE,1),"학식이 최고!"));
		mBorder.setLayout(null);
		
		JLabel bab = new JLabel("밥",JLabel.CENTER);
		bab.setBounds(23, 27, 12, 15);
		JComboBox<String> rCombo = new JComboBox<String>();
		rCombo.setBounds(40, 23, 106, 23);
		for(int i=0;i<rices.length;i++) {
			rCombo.addItem(rices[i]);
		}
		mBorder.add(bab);
		mBorder.add(rCombo);
		
		JLabel men = new JLabel("면",JLabel.CENTER);
		men.setBounds(23, 58, 12, 15);
		JComboBox<String> mCombo = new JComboBox<String>();
		mCombo.setBounds(40, 54, 106, 23);
		for(int i=0;i<nuddles.length;i++) {
			mCombo.addItem(nuddles[i]);
		}
		mBorder.add(men);
		mBorder.add(mCombo);
		
		JLabel ea = new JLabel("수랑",JLabel.CENTER);
		ea.setBounds(150, 27, 38, 15);
		JComboBox<String> eCombo = new JComboBox<String>();
		eCombo.setBounds(195, 23, 58, 23);
		for(int i=0;i<eas.length;i++) {
			eCombo.addItem(eas[i]);
		}
		mBorder.add(ea);
		mBorder.add(eCombo);
		
		JCheckBox sy = new JCheckBox("딸기요거트");
		sy.setBounds(23, 84, 125, 23);
		mBorder.add(sy);
		
		mBorder.setSize(277,164);
		mBorder.setLocation(14, 29);
		mBorder.setVisible(true);
		contentPane.add(mBorder);
		
		////////////////////////////////////////////////////////////////////////////////
		rBorder = new JPanel();
		rBorder.setLayout(new FlowLayout());
		rBorder.setBorder(new TitledBorder(new LineBorder(Color.WHITE,1),"영수증 종류"));
		
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
		JLabel receipt = new JLabel("영수증");
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
		JButton btn = new JButton("계산하기");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				////////////////////////////////////////////////////////////////////////////////
				if(rCombo.getSelectedItem().toString().equals("")&&
				   mCombo.getSelectedItem().toString().equals("")&&
				   !(sy.isSelected())) {
					JOptionPane.showMessageDialog(null, "메뉴를 선택하세요!");
					return;
				}
				if(eCombo.getSelectedItem().toString().equals("")) {
					JOptionPane.showMessageDialog(null, "수량을 확인하세요!");
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
							JOptionPane.showMessageDialog(null, "알 수 없는 오류! 개발자에게 문의하세요~");
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
							JOptionPane.showMessageDialog(null, "알 수 없는 오류! 개발자에게 문의하세요~");
							break;
					}
					
					if(sy.isSelected()) {
						price += 1500;
						menu += "딸기 요거트 추가 \n";
					}
					
					ta.append("@VAT 미포함@\n");
					ta.append("선택 메뉴 : \n\n");
					ta.append(menu+"\n");
					ta.append("가격 : \n\n");
					ta.append(Integer.toString(price/11*10)+"\n");
					ta.append("---------절취선---------\n\n\n");
					
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
							JOptionPane.showMessageDialog(null, "알 수 없는 오류! 개발자에게 문의하세요~");
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
							JOptionPane.showMessageDialog(null, "알 수 없는 오류! 개발자에게 문의하세요~");
							break;
					}
					
					if(sy.isSelected()) {
						price += 1500;
						menu += "딸기 요거트 추가 \n";
					}
					
					ta.append("@VAT 포함@\n");
					ta.append("선택 메뉴 : \n\n");
					ta.append(menu+"\n");
					ta.append("가격 : \n\n");
					ta.append(Integer.toString(price)+"\n");
					ta.append("---------절취선---------\n\n\n");
					
				}else {
					JOptionPane.showMessageDialog(null, "영수증 타입을 확인하세요!");
					return;
				}
				
			}
		});
		
		btn.setBounds(326,257,146,23);
		contentPane.add(btn);
		
		
	}
}
