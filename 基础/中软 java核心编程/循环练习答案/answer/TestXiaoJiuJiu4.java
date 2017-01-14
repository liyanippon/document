public class TestXiaoJiuJiu4 {

	public static void main(String[] args) {
		
		for (int i = 9; i >= 1; i--) {
			
			for (int k = 1;k <= 9 - i;k ++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}

			System.out.println();

		}

	}

}