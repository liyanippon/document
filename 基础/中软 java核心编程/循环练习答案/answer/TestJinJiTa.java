public class TestJinJiTa {

	public static void main(String[] args) {
		
		for (int i = 1;i <= 4;i ++) {
			
			//输出对应的空格
			for (int k = 1;k <= 4 - i;k ++) {
				System.out.print(" ");
			}
			
			for (int j = 1;j <= i * 2 - 1;j ++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}