
public class TestShuiXianHua {

	public static void main(String[] args) {
		
		//水仙花数
		
		for (int i = 100;i <= 999;i ++) {
			
			int a = i / 100;//百
			int b = i / 10 % 10;//十
			int c = i % 10;//个
			
			if (a * a * a + b * b * b + c *c * c == i)
				System.out.println(i);
			
		}

	}

}