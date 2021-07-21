import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("@@");
		int x = e.getX();
		int y = e.getY();
		MouseAdapterEx.la.setLocation(x, y);
	}
}
