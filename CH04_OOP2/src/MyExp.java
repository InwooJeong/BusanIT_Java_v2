
public class MyExp {
	private int base, exp;
	
	public void setBase(int base) {
		this.base = base;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public int getValue() {
		int res=1;
		for(int i=0;i<exp;i++) {
			res = res*base;
		}
		return res;
	}
}
