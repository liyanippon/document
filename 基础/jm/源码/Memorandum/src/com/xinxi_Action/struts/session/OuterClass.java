package com.xinxi_Action.struts.session;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.IOException;

public class OuterClass {
	private FileWriter file_write = null;

	private BufferedWriter out = null;

//	public void Out() {
//		try {
//			File file_writes = new File("D:\\", "22.txt");
//			if (file_writes.exists() == true) {
//				file_write = new FileWriter(file_writes);
//				out = new BufferedWriter(file_write);
//			} else {
//				System.exit(0);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		String point;
//		try {
//			for (int i = 4500001; i <= 5000000; i++) {
//				point = "insert into wenzhang values("
//						+ i
//						+ ",'{��ǧ�������ݷ�ҳ����,Ŀǰ�ǵ�:"
//						+ i
//						+ "������}','whp');";
//				System.out.println(point);
//				out.write(point, 0, point.length());
//				out.flush();
//				out.newLine();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
//		OuterClass o = new OuterClass();
//		o.Out();
		Date date = new Date();
		String date_1 = date.toString();
		date_1 = date_1.substring(0, date_1.indexOf("C"));
		System.out.println("date:" + date_1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance(); // ��õ�ǰ��ʱ��
		System.out.println("�����ǣ�" + sdf.format(cal.getTime()));
		cal.add(Calendar.DATE, 1); // �ѵ�ǰ�������� 1 �죬����Ϊ����
		System.out.println("�����ǣ�" + sdf.format(cal.getTime()));
		cal.add(Calendar.DATE, -1); // �ٻص����������
		cal.add(Calendar.DATE, 2);
		System.out.println("�����ǣ�" + sdf.format(cal.getTime()));
		
		String bbs_time = sdf.format(cal.getTime());
		System.out.println("������111111��" + bbs_time);
//		son s;
//		s = new son();
//		String aa = "123";
//		s.speak(aa);
//		System.out.println(s.speak(aa));
//		s.aa = 1;

	}
}
// class aa{
// static int aa;
// float weight;
// String head;
// final String speak(String s){
// return s;
// }
// }
// class son extends aa{
//	String hand,foot;
//}
