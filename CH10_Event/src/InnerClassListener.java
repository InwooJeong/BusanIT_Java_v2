import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame{
	InnerClassListener(){
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) {
				b.setText("�׼�");
			}else {
				b.setText("Action");
			}
			//InnerClassListener�� ����� JFrame�� ����� ȣ�� �� �� ����
			InnerClassListener.this.setTitle(b.getText()); //������ Ÿ��Ʋ�� ��ư ���ڿ��� ���
		}
		
	}
}
