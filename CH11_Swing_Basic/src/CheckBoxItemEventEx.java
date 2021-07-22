import javax.swing.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	static JCheckBox [] fruits = new JCheckBox [3];
	static String [] names = {"사과","배","체리"};
	static JLabel sumLabel;
	
	public CheckBoxItemEventEx(){
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
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
		
		sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	}

}
