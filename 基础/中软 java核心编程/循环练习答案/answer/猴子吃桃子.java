public class ���ӳ����� {

	public static void main(String[] args) {
				
		int x1 = 1;//�������������
		int x2;//��һ�����������
		
		for (int i = 9;i >= 1;i --) {
			x2 = (x1 + 1) * 2;
			System.out.println("���ǵ�" + i + "�������������" + x2);
			x1 = x2;
		}
		
	}

}