import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyItemListener2 implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.DESELECTED) {
			return;
		}
		if(RadiosButtonItemEventEx.radio[0].isSelected()) {
			RadiosButtonItemEventEx.imageLabel.setIcon(RadiosButtonItemEventEx.image[0]);
		}else if(RadiosButtonItemEventEx.radio[1].isSelected()) {
			RadiosButtonItemEventEx.imageLabel.setIcon(RadiosButtonItemEventEx.image[1]);
		}else {
			RadiosButtonItemEventEx.imageLabel.setIcon(RadiosButtonItemEventEx.image[2]);
		}
	}

}
