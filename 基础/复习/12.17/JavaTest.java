package test;


public class JavaTest {
	String str = new String("good");
	char[] ch = {'a','b','c'};
	
	public static void main(String[] args) {
		JavaTest t = new JavaTest();
		t.change(t.str, t.ch);
		System.out.print(t.str + " and ");
		System.out.print(t.ch);
		
	}
	public void change(String str, char[] ch){
		str = "test ok";
		ch[0] = 'g';
	}
}
