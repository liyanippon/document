public class ПаіЛ2048 {

	public static void main(String[] args) {
		
		loop1:
		for (int a = 1;a <= 2048;a ++) {
			
			for (int b = 1;b <= 2048;b ++) {
				
				if (a * b == 2048 && a > b) {
					System.out.println("a=" + a + ",b=" + b);
					break loop1;
				}
				
			}
			
		}

	}

}