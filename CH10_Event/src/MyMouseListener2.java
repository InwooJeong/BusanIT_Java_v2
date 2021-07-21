import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyMouseListener2 implements MouseListener, MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		MouseListenerAllEx.la.setText("mouseDragged ("+e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		MouseListenerAllEx.la.setText("mouseMoved ("+e.getX()+","+e.getY()+")");

	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		MouseListenerAllEx.la.setText("mousePressed ("+e.getX()+","+e.getY()+")");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		MouseListenerAllEx.la.setText("mouseReleased ("+e.getX()+","+e.getY()+")");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Component c = (Component)e.getSource();
		c.setBackground(Color.CYAN);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Component c = (Component)e.getSource();
		c.setBackground(Color.YELLOW);
	}

}
