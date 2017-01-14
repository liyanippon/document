package test;


public class JavaTest2{
	public static void main(String[] args) {
		int[] my = new int[3];
		try {
			for (int i = 0; i <= my.length; i++) {
				my[i] = i*3;
				System.out.println(i + " " + my[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界");
		}
		
	}
}
