package j2me;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Saima extends JFrame implements ActionListener {
	//�����м䲼�ֵ�������ťһ���ı���
	JButton start, replay, exit;
	JTextField gamble = new JTextField(); // �����ı���
	//��ʼǮ��
	int cash = 10000;
	int j, i = 0, p = 0;
	//��ƥ���ĸ�����
	sai race1, race2, race3, race4;
	List result = new List(); // ��ʾ���ݣ����༭
	
	//�����ĸ���ѡ��ť
	JRadioButton num1, num2, num3, num4;// ��ѡ��ť
	//����һϵ������
	JLabel select = new JLabel("   ����ѡ������ע�ı���");// ������ʵ����һ����ǩ��select��,��Ϊ����ע����
	JLabel xiazhu = new JLabel("   ������ע��");// ������ʵ����һ����ǩ��xiazhu��
	JLabel remain = new JLabel("   ����ӵ�н�$" + cash);
	JPanel race, option, option1, jp1, jp2, jp3, jp4;// ��������

	
	Saima() {
		this.setTitle("������Ϸ"); // ���ô������Ϊ��������Ϸ��
		setSize(680, 480);// ���ô����СΪ640,480
		this.setLocation(200, 200);
		this.setResizable(false);
		this.getContentPane().setLayout(new GridLayout(2, 1));// Ϊ��ǰ�������ò��֣�����Ϊ��񲼾֣�2��1��

		num1 = new JRadioButton("1�Ű�����");// ʵ������ѡ��ť
		num2 = new JRadioButton("2�ų�����");// ʵ������ѡ��ť
		num3 = new JRadioButton("3��׷����");// ʵ������ѡ��ť
		num4 = new JRadioButton("4��������");// ʵ������ѡ��ť
		ButtonGroup bg = new ButtonGroup();// ������ʵ����һ����ť��
		bg.add(num1);// ����ѡ��ť��ӵ���ť����
		bg.add(num2);// ����ѡ��ť��ӵ���ť����
		bg.add(num3);// ����ѡ��ť��ӵ���ť����
		bg.add(num4);// ����ѡ��ť��ӵ���ť����
		num1.setSelected(true);// ���õ�һ����ѡ��ťΪ��ѡ����
		race1 = new sai(this);// ʵ��������1
		race2 = new sai(this);// ʵ��������2
		race3 = new sai(this);// ʵ��������3
		race4 = new sai(this);// ʵ��������4
		race1.NO = 1;
		race2.NO = 2;
		race3.NO = 3;
		race4.NO = 4;
		jp1 = new JPanel();// ʵ����һ������
		jp2 = new JPanel();// ʵ����һ������
		jp3 = new JPanel();// ʵ����һ������
		jp4 = new JPanel();// ʵ����һ������
		//�ڶ�������ֳַ��ĸ�С����壬���ó�3*1ֻҪ��Ϊ�˸�ʽ
		jp1.setLayout(new GridLayout(1, 1)); // ����
		jp2.setLayout(new GridLayout(4, 1));
		jp3.setLayout(new GridLayout(3, 1));
		jp4.setLayout(new GridLayout(4, 1));

		race = new JPanel();// ʵ��������ʱ���õ�����
		race.setLayout(new GridLayout(4, 1));// ���������Ĳ���Ϊ��񲼾֣�4��1��
		race.add(race1);// ��1������ܵ���������ӵ��������õ�������
		race.add(race2);// ��2������ܵ���������ӵ��������õ�������
		race.add(race3);// ��3������ܵ���������ӵ��������õ�������
		race.add(race4);// ��4������ܵ���������ӵ��������õ�������
		option = new JPanel();
		option1 = new JPanel();
		option.setLayout(new GridLayout(2, 1));
		start = new JButton("��ʼ����"); // ʵ������ť���ı�Ϊ����ʼ������
		replay = new JButton("����һ��");// ʵ������ť���ı�Ϊ������һ�Ρ�
		exit = new JButton("��         ��");// ʵ������ť���ı�Ϊ���˳���
		this.getContentPane().add(race);
		this.getContentPane().add(option);

		jp1.add(select);// ѡ�����ս��:��ǩ��ӵ�JP1��
		jp2.add(num1);// ��1�ſ���ĵ�ѡ��ť��ӵ�JP2��
		jp2.add(num2);// ��1�ſ���ĵ�ѡ��ť��ӵ�JP2��
		jp2.add(num3);// ��1�ſ���ĵ�ѡ��ť��ӵ�JP2��
		jp2.add(num4);// ��1�ſ���ĵ�ѡ��ť��ӵ�JP2��
		jp3.add(xiazhu);// ����ע��ǩ��ӵ�JP3��
		jp3.add(remain);// �����н���ǩ��ӵ�JP3��
		jp4.add(gamble);// ����ע���ı�����ӵ�JP4��
		jp4.add(start);// ����ʼ������ť��ӵ�JP4��
		jp4.add(replay);// ������һ�α�ǩ��ӵ�JP4��
		jp4.add(exit);// ���˳���ť��ӵ�JP4��
		option1.setLayout(new GridLayout(1, 4));// ΪOPTION1���ò��ָ�ʽΪ��񲼾֣�1��4��
		option.add(option1);// ��OPTION1��ӵ�OPTION��
		option1.add(jp1);// ��JP0��ӵ�option1��
		option1.add(jp2);// ��choice��ӵ�option1��
		option1.add(jp3);// ��jp2��ӵ�option1��
		option1.add(jp4);// ��jp3��ӵ�option1��

		start.addActionListener(this);// Ϊ��ʼ��ť��Ӽ�����
		replay.addActionListener(this);// Ϊ����һ�ΰ�ť��Ӽ�����
		exit.addActionListener(this);// Ϊ�˳���ť��Ӽ�����
		num1.addActionListener(this);// Ϊ����1��ѡ��ť��Ӽ�����
		num2.addActionListener(this);// Ϊ����2��ѡ��ť��Ӽ�����
		num3.addActionListener(this);// Ϊ����3��ѡ��ť��Ӽ�����
		num4.addActionListener(this);// Ϊ����4��ѡ��ť��Ӽ�����
		JScrollPane jsp = new JScrollPane();// ������ʵ����������
		jsp.getViewport().setView(result);// ������������ʾ�������Ϣ����
		option.add(jsp);// ������������ʾ�������Ϣ����ӵ�option��

		this.setVisible(true);// ��ǰ��������Ϊ����ʾ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���õ�ǰ�����Ĭ�Ϲر���ʽ
	}

	public int check() {
		int chk = 0;
		if (!gamble.getText().equals("")) // �ж���ע���ı����Ƿ�������
		{
			chk = Integer.parseInt(gamble.getText());// ����ע���ı�ת����ֵ��
		}
		if (chk > cash) // ����ע�Ľ����ڱ������еĽ�������ʱ��
		{
			JOptionPane.showMessageDialog(this, "�����Ǯ������������", "ע�⣡����",
					JOptionPane.ERROR_MESSAGE);
			return j = -1;// ����-1��ʾ�����Կ�ʼ
		}
		if (chk == 0 || chk < 0 || gamble.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "�������ɲ��У�����", "ע�⣡����",
					JOptionPane.ERROR_MESSAGE);
			return j = -1;// ����-1��ʾ�����Կ�ʼ
		} else {
			return j = 1;// ����1��ʾ���Կ�ʼ
		}
	}
	/*public void woll() {
		
	}*/
	public void wol() {
		if (race1.y == 1) {
			result.add("1�Ű��������");
			if (i == 1 || i == 0) {
				result.add("( �R �� �Q )���ʤ��");
				result.add("���ã�$" + p);
				cash = cash + p;
				result.add("�����н�$" + cash);
				remain.setText("   ����ӵ�н�$" + cash);
			} else {
				result.add("�r(�s3�t)�q ������");
				result.add("��ʧ��$" + p);
				cash = cash - p;
				result.add("�����н�$" + cash);
				remain.setText("   ����ӵ�н�$" + cash);
			}
		} else if (race2.y == 1) {
			result.add("2�ų��������");
			if (i == 2) {
				result.add("( �R �� �Q )���ʤ��");
				result.add("���ã�$" + p);
				cash = cash + p;
				result.add("�����н�$" + cash);
				remain.setText("   ����ӵ�н�$" + cash);
			} else {
				result.add("�r(�s3�t)�q ������");
				result.add("����ʧ��$" + p);
				cash = cash - p;
				result.add("�����н�$" + cash);
				remain.setText("   ����ӵ�н�$" + cash);
			}
		}

		else if (race3.y == 1) {
			result.add("3��׷�������");
			if (i == 3) {
				result.add("( �R �� �Q )���ʤ��");
				result.add("���ã�$" + p);
				cash = cash + p;
				result.add("�����н�$" + cash);
				remain.setText("   ����ӵ�н�$" + cash);
			} else {
				result.add("�r(�s3�t)�q ������");
				result.add("����ʧ��$" + p);
				cash = cash - p;
				result.add("�����н�$" + cash);
				remain.setText("   ����ӵ�н�$" + cash);
			}
		} else if (race4.y == 1) {
			result.add("4�����������");
			if (i == 4) {
				result.add("( �R �� �Q )���ʤ��");
				result.add("���ã�$" + p);
				cash = cash + p;
				result.add("�����н�$" + cash);
				remain.setText("   ����ӵ�н�$" + cash);
			} else {
				result.add("�r(�s3�t)�q ������");
				result.add("����ʧ��$" + p);
				cash = cash - p;
				result.add("�����н�$" + cash);
				remain.setText("   ����ӵ�н�$" + cash);
			}
		}
		if (cash == 0)// ���ֽ�Ϊ0ʱ�����Ի���
		{
			JOptionPane.showMessageDialog(this, "(�� ��)�������涼����˰ɣ�����", "ע�⣡����",
					JOptionPane.WARNING_MESSAGE);
		}
		if (cash == 20000) {
			JOptionPane.showMessageDialog(this, "(^_^)��ϲ����", "ע�⣡",
					JOptionPane.WARNING_MESSAGE);
		}
		if (cash == 30000) {
			JOptionPane.showMessageDialog(this, "(^_^)��ϲ������", "ע�⣡��",
					JOptionPane.WARNING_MESSAGE);
		}
		if (cash == 40000) {
			JOptionPane.showMessageDialog(this, "(^_^)��ϲ��������", "ע�⣡����",
					JOptionPane.WARNING_MESSAGE);
		}
		if (cash == 50000) {
			JOptionPane.showMessageDialog(this, "(�� ��)��������ϵͳ�Ѿ�����������", "ע�⣡����",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public static void main(String[] args) {
		Saima hrp = new Saima();
	}

	public void actionPerformed(ActionEvent cs) {
		if (cs.getSource() == num1) // 1�ſ���
		{
			i = 1;
		} else if (cs.getSource() == num2) // 2�ſ���
		{
			i = 2;
		} else if (cs.getSource() == num3) // 3�ſ���
		{
			i = 3;
		} else if (cs.getSource() == num4) // 4�ſ���
		{
			i = 4;
		}
		if (cs.getSource() == start)// ��ʼ��ť
		{
			check();
			if (j == 1) {
				p = Integer.parseInt(gamble.getText());
				Thread t1, t2, t3, t4;// ����4���߳�
				t1 = new Thread(race1);// ʵ�����߳�1
				t2 = new Thread(race2);// ʵ�����߳�2
				t3 = new Thread(race3);// ʵ�����߳�3
				t4 = new Thread(race4);// ʵ�����߳�4
				t1.start();// �����߳�
				t2.start();// �����߳�
				t3.start();// �����߳�
				t4.start();// �����߳�
				gamble.setEnabled(false);// ������ע�ı���Ϊ���ɱ༭
				start.setEnabled(false);// ��ʼ��ť���ò��ɲ���
				num1.setEnabled(false);// ����1��ѡ��ť����Ϊ���ɲ���
				num2.setEnabled(false);// ����2��ѡ��ť����Ϊ���ɲ���
				num3.setEnabled(false);// ����3��ѡ��ť����Ϊ���ɲ���
				num4.setEnabled(false);// ����4��ѡ��ť����Ϊ���ɲ���
				result.add("Race Started!!!");// ��ʾ�����Կ�ʼ
			}
		}
		if (cs.getSource() == replay) {
			gamble.setText(null);// �����ı������
			start.setEnabled(true);// ��ʼ��ť����Ϊ�ɲ���
			num1.setEnabled(true);// ����1��ѡ��ť����Ϊ�ɲ���
			num2.setEnabled(true);// ����2��ѡ��ť����Ϊ�ɲ���
			num3.setEnabled(true);// ����3��ѡ��ť����Ϊ�ɲ���
			num4.setEnabled(true);// ����4��ѡ��ť����Ϊ�ɲ���
			gamble.setEnabled(true);// ��ע�ı�������Ϊ�ɲ���
			sai.i = 0;// ������ı����Ϊ0
			race1.step = 0;// ������Ĳ�����Ϊ0
			race1.x = 0;// ������1��x��Ϊ0
			race1.y = 0;// ������1��y��Ϊ0
			race2.step = 0;// ������Ĳ�����Ϊ0
			race2.x = 0;// ������2��x��Ϊ0
			race2.y = 0;// ������2��y��Ϊ0
			race3.step = 0;// ������Ĳ�����Ϊ0
			race3.x = 0;// ������3��x��Ϊ0
			race3.y = 0;// ������3��y��Ϊ0
			race4.step = 0;// ������Ĳ�����Ϊ0
			race4.x = 0;// ������4��x��Ϊ0
			race4.y = 0;// ������4��y��Ϊ0
			race1.repaint();// �ػ�����1
			race2.repaint();// �ػ�����2
			race3.repaint();// �ػ�����3
			race4.repaint();// �ػ�����4
		}
		if (cs.getSource() == exit) {// �����˳��ť
			System.exit(1);// �˳�ϵͳ
		}
	}
	
}
