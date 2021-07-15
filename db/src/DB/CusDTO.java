package DB;

public class CusDTO {
	private int custid;
	private String name, address, phone;
	
	public CusDTO() {
		
	}
	
	public CusDTO(int custid, String name, String address, String phone) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public void printCust1() {
		System.out.println(custid+ " ");
		System.out.println(name+ " ");
		System.out.println(address+ " ");
		System.out.println(phone+ " ");
	}
	
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return custid +"\t\t"+ name +"\t\t"+ address +"\t\t"+ phone;
	}
//	@Override
//	public String toString() {
//		return "CusDTO [custid=" + custid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
//	}

}
