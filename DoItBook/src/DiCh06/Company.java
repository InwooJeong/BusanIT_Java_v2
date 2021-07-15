package DiCh06;

public class Company {
	
	private static Company instance = new Company(); //2. Ŭ���� ���ο� static���� �����ϰ� ������ �ν��Ͻ�(���α׷� ��ü���� ����� ������ �ν��Ͻ�, �ܺο��� ������ �Ұ�)

	private Company() { //1. ������ private���� ����� - �����Ϸ��� �����ϴ� ����Ʈ �����ڴ� public - �ܺο��� ������� compnay �ν��Ͻ� ���� �Ұ�!
		//���� compnay Ŭ���� ���ο����� �� Ŭ������ ���� ����
	} 
	
	public static Company getInstance() { //3. �ܺο��� ������ �� �ִ� public �޼��� ���� : �ݵ�� static (�ν��Ͻ� ������ ������� ȣ�� �� �� �־��)
		if(instance == null) {
			instance = new Company();
		}
		return instance; //�����ϰ� ������ �ν��Ͻ��� ��ȯ
	}
	
}
