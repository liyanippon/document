package com.mao;
import java.util.ArrayList;
import java.util.List;


public class MaoPaoList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Double> list =new ArrayList<Double>();
		Double a;
		list.add(300.15);
		list.add(100.0);
		list.add(30.75);
		list.add(750.63);
		for(int i=0;i<list.size()-1;i++){
			for(int j=1;j<list.size()-i;j++){
				if(list.get(j-1).compareTo(list.get(j))>0){
					a=list.get(j-1);
					list.set((j-1), list.get(j));
					list.set(j, a);
				}
			}	
		}
		for(Double s:list){
			System.out.println(s.doubleValue());
		}
	}
}

	