package com.xinxi_Action.struts.session;

import java.util.*;

public class DoubleBall {
	//从23个红球中随机产生6个红球
	public int[] dbRed() {
		Random r = new Random();
		int[] a = new int[6];
		for (int i = 0; i <= 5; i++) {
			int d = r.nextInt(33) + 1;
			//System.out.println(d);
			int j = 0;
			for (; j < i; j++) {
				if (a[j] == d) {
					i--;
					break;
				}
			}
			if (i == j) {
				a[i] = d;
			}

		}
		return a;
		/*//输出产生的红球
		 System.out.print("红球：");
		 for(int j=0;j<=5;j++)
		 {
		 System.out.print(a[j]+" ");
		 }*/
	}

	//从16个蓝球中随机产生1个蓝球
	public int dbBlue() {
		Random r = new Random();
		int d = r.nextInt(16) + 1;
		return d;
		//System.out.println("蓝球："+d);
	}

	public static void main(String[] args) {
		DoubleBall d = new DoubleBall();
		String[] s = { "老师", "巫殷祥", "李成斌", "苏宇", "湛善佳", "老陈", "阿敏", "小杜", "小罗" };
		for (int i = 0; i < s.length; i++) {
			if (i == d.dbBlue()) {
				System.out.println("特等奖：" + s[i]);
			}

		}

		int a[] = d.dbRed();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (a[i] == j) {
					System.out.print(a[i] + " ");
					System.out.print(s[j] + " ");
				}

			}

		}

	}
}
