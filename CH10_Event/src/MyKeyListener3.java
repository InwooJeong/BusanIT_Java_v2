import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener3 extends KeyAdapter{

	@Override
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
		
		int keyCode = e.getKeyCode();
		
		switch(keyCode) {
			case KeyEvent.VK_UP:
				FlyingTextEx.la.setLocation(FlyingTextEx.la.getX(), FlyingTextEx.la.getY()-FlyingTextEx.FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				FlyingTextEx.la.setLocation(FlyingTextEx.la.getX(), FlyingTextEx.la.getY()+FlyingTextEx.FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				FlyingTextEx.la.setLocation(FlyingTextEx.la.getX()-FlyingTextEx.FLYING_UNIT, FlyingTextEx.la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				FlyingTextEx.la.setLocation(FlyingTextEx.la.getX()+FlyingTextEx.FLYING_UNIT, FlyingTextEx.la.getY());
				break;
		}
	}
	

}
