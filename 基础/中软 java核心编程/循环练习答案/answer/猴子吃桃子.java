public class 猴子吃桃子 {

	public static void main(String[] args) {
				
		int x1 = 1;//当天的桃子数量
		int x2;//上一天的桃子数量
		
		for (int i = 9;i >= 1;i --) {
			x2 = (x1 + 1) * 2;
			System.out.println("这是第" + i + "天的桃子数量是" + x2);
			x1 = x2;
		}
		
	}

}