
public class TestSuShu {

	public static void main(String[] args) {
		
		//��10~100֮�������
		for (int i = 10;i <= 100;i ++) {
			
			boolean flag = true;
			
			
			for (int j = 2;j < i;j ++) {
				if (i % j == 0) {
					flag = false;
					
					break;
				}
			}
			
			if (flag)	
				System.out.println(i);
			
		}

	}

}