package DiCh06;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000); //�л� 2�� ����
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100); //�뼱 ��ȣ 100�� ���� ����
		studentJames.takeBus(bus100); //james�� 100�� ������ Ž
		studentJames.showInfo(); //james ���� ���
		bus100.showInfo(); //���� ���� ���
		
		Subway subwayGreen = new Subway("2ȣ��"); //�뼱 ��ȣ�� 2ȣ���� ����ö ����
		studentTomas.takeSubway(subwayGreen); //tomas�� 2ȣ���� Ž
		studentTomas.showInfo(); //tomas ���� ���
		subwayGreen.showInfo(); //����ö ���� ���
	}
}
