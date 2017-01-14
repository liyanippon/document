package com.mao;

import java.util.ArrayList;
import java.util.List;

public class StringMao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list=new ArrayList<String>();
		
		list.add("80");
		list.add("60");
		list.add("100");
		//System.out.println(list.get(0));
		for(int i=0;i<list.size()-1;i++){
			for(int j=1;j<list.size()-i;j++){
				try{
				    Integer a=Integer.parseInt(list.get(j-1));
					Integer b=Integer.parseInt(list.get(j));
					//System.out.println(list.get(j-1));
				if(a.compareTo(b)>0){
					String temp=list.get(j-1);
					list.set(j-1, list.get(j));
					list.set(j, temp);
					}
				}catch(Exception e){}
			}
		}
		
		for(String s:list){
			System.out.println(s);
		}
	}

}
