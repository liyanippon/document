public class ���������� {

	public static void main(String[] args) {
		
		for (int i = 1;i <= 100;i ++) {
			
			for (int j = 1;j <= 100;j ++) {
				
				if (i*i + j == 1053 && j*j+i == 873) {
					System.out.println("�����������䣺" + i + ",��̫̫������:" + j);
					break;
				}
				
			}
			
		}

	}
}