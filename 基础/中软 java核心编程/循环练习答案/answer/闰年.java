public class ���� {

	public static void main(String[] args) {
		
		int k = 0;//ͳ��ÿ�ж��ٸ�
		
		for (int i = 1900;i <= 2100;i += 4) {
			
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.print(i + "\t");
				
				k ++;//ÿ���һ�����꣬������1
				
				//��4�������һ�����У�Ȼ���������
				if (k >= 4) {
					System.out.println();
					k = 0;
				}
			}
			
		}

	}

}