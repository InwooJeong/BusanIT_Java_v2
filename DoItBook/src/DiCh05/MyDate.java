package DiCh05;
import java.util.*;

public class MyDate {
	private int day,month,year;
	private boolean isValid = true;
	
	MyDate(int day,int month,int year){
//		this.day = day;
//		this.month = month;
//		this.year = year;
		setYear(year);
		setMonth(month);
		setDay(day);
		
//		System.out.println(day);
//		System.out.println(month);
//		System.out.println(year);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		System.out.println(day);
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day<1 || day>31) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		case 4: case 6: case 9: case 11:
			if(day<1 || day>30) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		case 2:	
			if(((year%4==0 && year%100!=0)||year%400==0)) {
				if(day<1||day>29) {
					isValid = false;
				}else {
					this.day = day;
				}
			}
			else {
				if(day<1||day>28) {
					isValid = false;
				}else {
					this.day = day;
				}
			}
			break;
		default:
		this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
		}else {
		this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}else {
			this.year = year;
		}
	}
	
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
		}else {
			return "유효하지 않은 날짜입니다.";
		}
	}
	
}
