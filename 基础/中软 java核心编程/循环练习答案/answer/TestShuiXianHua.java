
public class TestShuiXianHua {

	public static void main(String[] args) {
		
		//ˮ�ɻ���
		
		for (int i = 100;i <= 999;i ++) {
			
			int a = i / 100;//��
			int b = i / 10 % 10;//ʮ
			int c = i % 10;//��
			
			if (a * a * a + b * b * b + c *c * c == i)
				System.out.println(i);
			
		}

	}

}