import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() { //�͸� Ŭ������ Action������ �ۼ�, �Ű� ������ ��ü ��� �ڸ� -> ����鼭 ���
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("�׼�");
				}else {
					b.setText("Action");
				}
				setTitle(b.getText()); //AnonymousClassListener�� ����� JFrame�� ����� ȣ���� �� ����
			}
		});
		setSize(350,150);
		setVisible(true);
	}
}
