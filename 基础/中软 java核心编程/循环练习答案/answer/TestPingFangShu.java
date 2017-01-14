public class TestPingFangShu {

	public static void main(String[] args) {

		for (int i = 1; i <= 200; i++) {
			
			if (i * i > 200)
				break;

			if (i * i >= 10 && i * i <= 200) {
				System.out.println(i * i);
			}

		}

	}

}