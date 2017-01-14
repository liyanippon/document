package pro_0829;

public class TestFeiBo {

	
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.print(a+ " " + b +" ");
		for (int i = 2; i < 10 ;i ++) {
			int num = a + b;
			a = b;
			b = num;
			System.out.print(num+ " ");
		}

	}

}
int i=1,j=1;
		for(int n=1;n<=5;n++){
			System.out.print(i+"\t"+j+"\t");
			i=i+j;
			j=i+j;
