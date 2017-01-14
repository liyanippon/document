package test;

import java.util.ArrayList;
import java.util.HashSet;


public class JavaTest{
	
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String s:list) {
			System.out.println(s);
		}
		
		
		
		HashSet<String> s = new HashSet<String>();
		s.add("1");
		s.add("2");
		s.add("3");
		for (int i = 0; i < s.size(); i++) {
			
		}
		for (String aa: s) {
			System.out.println(aa);
			
		}
	}
}
