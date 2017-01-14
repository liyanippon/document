
public class TestWanShu {
	
	public static void main(String[] args) {
		
		//输出1~1000之间的完数(所有因子的和等于本身)，例如6=1+2+3
			
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
