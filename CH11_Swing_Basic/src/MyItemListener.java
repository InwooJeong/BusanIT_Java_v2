import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyItemListener implements ItemListener {
	private int sum = 0; //가격의 합

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			
			if(e.getItem() == CheckBoxItemEventEx.fruits[0]) {
				sum += 100;
			}else if(e.getItem() == CheckBoxItemEventEx.fruits[1]) {
				sum += 500;
			}else{
				sum += 20000;
			}
			
		}else {
			
			if(e.getItem() == CheckBoxItemEventEx.fruits[0]) {
				sum -= 100;
			}else if(e.getItem() == CheckBoxItemEventEx.fruits[1]) {
				sum -= 500;
			}else {
				sum -= 20000;
			}
			
		}
			CheckBoxItemEventEx.sumLabel.setText("현재 " + sum + "원 입니다.");
	}

}
