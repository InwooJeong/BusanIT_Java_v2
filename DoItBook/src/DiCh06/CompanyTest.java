package DiCh06;

public class CompanyTest { //4. ������ ����ϴ� �ڵ� �����

	public static void main(String[] args) { //�ܺ� Ŭ���������� company ���� �Ұ� -> static���� �����Ǵ� getInstance
		Company myCompany1 = Company.getInstance(); //Ŭ���� �̸����� getInstance() ȣ�� -> ���� ������ ����
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2); //���� ���� ���� ������ ������ �ν��Ͻ�
		//company Ŭ������ ���ο� ������ ������ �ν��Ͻ� �ܿ��� �� �̻� �ν��Ͻ��� ���� �� �� ����.
		//->Static�� ����Ͽ� ������ ��ü�� �����ϴ� �̱��� ����
	}

}
