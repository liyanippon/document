import java.util.Scanner;

public class ���Լ�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		
		//ʹa��Сֵ��b�Ǵ�ֵ
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
				
		for (int i = a;i >= 1;i --) {			
			if (a % i == 0 && b % i == 0) {
				System.out.println("���Լ���ǣ�" + i);
				break;
			}			
		}
		
		for (int i = b;i <= a * b;i += b) {			
			if (i % a == 0 && i % b == 0) {
				System.out.println("��С��������" + i);
				break;
			}			
		}
	}

}