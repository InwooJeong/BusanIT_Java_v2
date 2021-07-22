import javax.swing.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	static JCheckBox [] fruits = new JCheckBox [3];
	static String [] names = {"���","��","ü��"};
	static JLabel sumLabel;
	
	public CheckBoxItemEventEx(){
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		
		MyItemListener listener = new MyItemListener();
		
		for(int i=0;i<fruits.length;i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		
//		for(JCheckBox i : fruits) {
//			
//			i.setBorderPainted(true);
//			c.add(i);
//			i.addItemListener(listener);
//		}
		
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		c.add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	}

}
