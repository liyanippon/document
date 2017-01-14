public class 闰年 {

	public static void main(String[] args) {
		
		int k = 0;//统计每行多少个
		
		for (int i = 1900;i <= 2100;i += 4) {
			
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.print(i + "\t");
				
				k ++;//每输出一个闰年，计数加1
				
				//够4个就输出一个换行，然后计数归零
				if (k >= 4) {
					System.out.println();
					k = 0;
				}
			}
			
		}

	}

}