package com.xinxi_Action.struts.session;

import java.util.*;

public class DoubleBall {
	//��23���������������6������
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
		/*//��������ĺ���
		 System.out.print("����");
		 for(int j=0;j<=5;j++)
		 {
		 System.out.print(a[j]+" ");
		 }*/
	}

	//��16���������������1������
	public int dbBlue() {
		Random r = new Random();
		int d = r.nextInt(16) + 1;
		return d;
		//System.out.println("����"+d);
	}

	public static void main(String[] args) {
		DoubleBall d = new DoubleBall();
		String[] s = { "��ʦ", "������", "��ɱ�", "����", "տ�Ƽ�", "�ϳ�", "����", "С��", "С��" };
		for (int i = 0; i < s.length; i++) {
			if (i == d.dbBlue()) {
				System.out.println("�صȽ���" + s[i]);
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
