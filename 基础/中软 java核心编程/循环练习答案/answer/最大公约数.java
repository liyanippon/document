import java.util.Scanner;

public class 最大公约数 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		
		//使a是小值，b是大值
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
				
		for (int i = a;i >= 1;i --) {			
			if (a % i == 0 && b % i == 0) {
				System.out.println("最大公约数是：" + i);
				break;
			}			
		}
		
		for (int i = b;i <= a * b;i += b) {			
			if (i % a == 0 && i % b == 0) {
				System.out.println("最小公倍数：" + i);
				break;
			}			
		}
	}

}