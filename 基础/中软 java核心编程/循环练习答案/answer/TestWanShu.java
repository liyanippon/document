
public class TestWanShu {
	
	public static void main(String[] args) {
		
		//���1~1000֮�������(�������ӵĺ͵��ڱ���)������6=1+2+3
			
		for (int i = 1;i <= 1000;i ++) {
			
			int sum = 0;
			
			for (int j = 1;j <= i / 2;j ++) {
				if (i % j == 0)
					sum = sum + j;
			}
			
			if (sum == i)
				System.out.println(i);
			
		}
				
	}

}
