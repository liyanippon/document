
public class ��ɲ��ظ���λ�� {
	
	public static void main(String[] args) {
		
		for (int i = 1;i <= 4;i ++) {
			
			for (int j = 1;j <= 4;j ++) {
				
				if (i != j) {
					
					for (int k = 1;k <= 4;k ++) {
						
						if (j != k && i != k)
							System.out.println("" + i + j + k);
						
					}
					
				}
					
			}
			
		}

	}

}