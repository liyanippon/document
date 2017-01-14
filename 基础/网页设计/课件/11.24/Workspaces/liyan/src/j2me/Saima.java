package j2me;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Saima extends JFrame implements ActionListener {
	//设置中间布局的三个按钮一个文本域
	JButton start, replay, exit;
	JTextField gamble = new JTextField(); // 单行文本域
	//初始钱数
	int cash = 10000;
	int j, i = 0, p = 0;
	//四匹马四个对象
	sai race1, race2, race3, race4;
	List result = new List(); // 显示数据，不编辑
	
	//设置四个单选按钮
	JRadioButton num1, num2, num3, num4;// 单选按钮
	//设置一系列文字
	JLabel select = new JLabel("   请您选择所下注的宝马：");// 声明并实例化一个标签“select”,此为你下注的马
	JLabel xiazhu = new JLabel("   请您下注：");// 声明并实例化一个标签“xiazhu”
	JLabel remain = new JLabel("   您所拥有金额：$" + cash);
	JPanel race, option, option1, jp1, jp2, jp3, jp4;// 声明容器

	
	Saima() {
		this.setTitle("赛马游戏"); // 设置窗体标题为“赛马游戏”
		setSize(680, 480);// 设置窗体大小为640,480
		this.setLocation(200, 200);
		this.setResizable(false);
		this.getContentPane().setLayout(new GridLayout(2, 1));// 为当前窗体设置布局，布局为表格布局，2行1列

		num1 = new JRadioButton("1号白龙马");// 实例化单选按钮
		num2 = new JRadioButton("2号赤兔马");// 实例化单选按钮
		num3 = new JRadioButton("3号追风马");// 实例化单选按钮
		num4 = new JRadioButton("4号闪电马");// 实例化单选按钮
		ButtonGroup bg = new ButtonGroup();// 声明并实例化一个按钮组
		bg.add(num1);// 将单选按钮填加到按钮组中
		bg.add(num2);// 将单选按钮填加到按钮组中
		bg.add(num3);// 将单选按钮填加到按钮组中
		bg.add(num4);// 将单选按钮填加到按钮组中
		num1.setSelected(true);// 设置第一个单选按钮为被选择项
		race1 = new sai(this);// 实例化骏马1
		race2 = new sai(this);// 实例化骏马2
		race3 = new sai(this);// 实例化骏马3
		race4 = new sai(this);// 实例化骏马4
		race1.NO = 1;
		race2.NO = 2;
		race3.NO = 3;
		race4.NO = 4;
		jp1 = new JPanel();// 实例化一个容器
		jp2 = new JPanel();// 实例化一个容器
		jp3 = new JPanel();// 实例化一个容器
		jp4 = new JPanel();// 实例化一个容器
		//第二个面板又分成四个小的面板，设置成3*1只要是为了格式
		jp1.setLayout(new GridLayout(1, 1)); // 布局
		jp2.setLayout(new GridLayout(4, 1));
		jp3.setLayout(new GridLayout(3, 1));
		jp4.setLayout(new GridLayout(4, 1));

		race = new JPanel();// 实例化比赛时所用的容器
		race.setLayout(new GridLayout(4, 1));// 设置容器的布局为表格布局，4行1列
		race.add(race1);// 将1号马的跑道的容器填加到比赛所用的容器中
		race.add(race2);// 将2号马的跑道的容器填加到比赛所用的容器中
		race.add(race3);// 将3号马的跑道的容器填加到比赛所用的容器中
		race.add(race4);// 将4号马的跑道的容器填加到比赛所用的容器中
		option = new JPanel();
		option1 = new JPanel();
		option.setLayout(new GridLayout(2, 1));
		start = new JButton("开始比赛"); // 实例化按钮，文本为“开始比赛”
		replay = new JButton("再来一次");// 实例化按钮，文本为“再来一次”
		exit = new JButton("退         出");// 实例化按钮，文本为“退出”
		this.getContentPane().add(race);
		this.getContentPane().add(option);

		jp1.add(select);// 选择你的战友:标签添加到JP1中
		jp2.add(num1);// 将1号骏马的单选按钮添加到JP2中
		jp2.add(num2);// 将1号骏马的单选按钮添加到JP2中
		jp2.add(num3);// 将1号骏马的单选按钮添加到JP2中
		jp2.add(num4);// 将1号骏马的单选按钮添加到JP2中
		jp3.add(xiazhu);// 将下注标签添加到JP3中
		jp3.add(remain);// 将持有金额标签添加到JP3中
		jp4.add(gamble);// 将下注的文本框添加到JP4中
		jp4.add(start);// 将开始比赛按钮添加到JP4中
		jp4.add(replay);// 将再来一次标签添加到JP4中
		jp4.add(exit);// 将退出按钮添加到JP4中
		option1.setLayout(new GridLayout(1, 4));// 为OPTION1设置布局格式为表格布局，1行4列
		option.add(option1);// 将OPTION1添加到OPTION中
		option1.add(jp1);// 将JP0添加到option1中
		option1.add(jp2);// 将choice添加到option1中
		option1.add(jp3);// 将jp2添加到option1中
		option1.add(jp4);// 将jp3添加到option1中

		start.addActionListener(this);// 为开始按钮添加监听器
		replay.addActionListener(this);// 为再来一次按钮添加监听器
		exit.addActionListener(this);// 为退出按钮添加监听器
		num1.addActionListener(this);// 为骏马1单选按钮添加监听器
		num2.addActionListener(this);// 为骏马2单选按钮添加监听器
		num3.addActionListener(this);// 为骏马3单选按钮添加监听器
		num4.addActionListener(this);// 为骏马4单选按钮添加监听器
		JScrollPane jsp = new JScrollPane();// 声明并实例化滚动条
		jsp.getViewport().setView(result);// 将滚动条与显示结果的信息栏绑定
		option.add(jsp);// 将滚动条与显示结果的信息栏添加到option中

		this.setVisible(true);// 当前窗体设置为可显示的
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置当前窗体的默认关闭形式
	}

	public int check() {
		int chk = 0;
		if (!gamble.getText().equals("")) // 判断下注的文本中是否有内容
		{
			chk = Integer.parseInt(gamble.getText());// 将下注的文本转化数值型
		}
		if (chk > cash) // 如下注的金额大于本所持有的金额（即不足时）
		{
			JOptionPane.showMessageDialog(this, "想玩把钱带够啊！！！", "注意！！！",
					JOptionPane.ERROR_MESSAGE);
			return j = -1;// 返回-1表示不可以开始
		}
		if (chk == 0 || chk < 0 || gamble.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "你想白玩可不行！！！", "注意！！！",
					JOptionPane.ERROR_MESSAGE);
			return j = -1;// 返回-1表示不可以开始
		} else {
			return j = 1;// 返回1表示可以开始
		}
	}
	/*public void woll() {
		
	}*/
	public void wol() {
		if (race1.y == 1) {
			result.add("1号白龙马勝利");
			if (i == 1 || i == 0) {
				result.add("( ≧ ◇ ≦ )你获胜了");
				result.add("你获得：$" + p);
				cash = cash + p;
				result.add("你现有金额：$" + cash);
				remain.setText("   您所拥有金额：$" + cash);
			} else {
				result.add("╮(╯3╰)╭ 你输了");
				result.add("损失：$" + p);
				cash = cash - p;
				result.add("你现有金额：$" + cash);
				remain.setText("   您所拥有金额：$" + cash);
			}
		} else if (race2.y == 1) {
			result.add("2号赤兔马勝利");
			if (i == 2) {
				result.add("( ≧ ◇ ≦ )你获胜了");
				result.add("你获得：$" + p);
				cash = cash + p;
				result.add("你现有金额：$" + cash);
				remain.setText("   您所拥有金额：$" + cash);
			} else {
				result.add("╮(╯3╰)╭ 你输了");
				result.add("你损失：$" + p);
				cash = cash - p;
				result.add("你现有金额：$" + cash);
				remain.setText("   您所拥有金额：$" + cash);
			}
		}

		else if (race3.y == 1) {
			result.add("3号追风马勝利");
			if (i == 3) {
				result.add("( ≧ ◇ ≦ )你获胜了");
				result.add("你获得：$" + p);
				cash = cash + p;
				result.add("你现有金额：$" + cash);
				remain.setText("   您所拥有金额：$" + cash);
			} else {
				result.add("╮(╯3╰)╭ 你输了");
				result.add("你损失：$" + p);
				cash = cash - p;
				result.add("你现有金额：$" + cash);
				remain.setText("   您所拥有金额：$" + cash);
			}
		} else if (race4.y == 1) {
			result.add("4号闪电马勝利");
			if (i == 4) {
				result.add("( ≧ ◇ ≦ )你获胜了");
				result.add("你获得：$" + p);
				cash = cash + p;
				result.add("你现有金额：$" + cash);
				remain.setText("   您所拥有金额：$" + cash);
			} else {
				result.add("╮(╯3╰)╭ 你输了");
				result.add("你损失：$" + p);
				cash = cash - p;
				result.add("你现有金额：$" + cash);
				remain.setText("   您所拥有金额：$" + cash);
			}
		}
		if (cash == 0)// 当现金为0时弹出对话框
		{
			JOptionPane.showMessageDialog(this, "(﹁ ﹁)让你在玩都输光了吧！！！", "注意！！！",
					JOptionPane.WARNING_MESSAGE);
		}
		if (cash == 20000) {
			JOptionPane.showMessageDialog(this, "(^_^)恭喜您！", "注意！",
					JOptionPane.WARNING_MESSAGE);
		}
		if (cash == 30000) {
			JOptionPane.showMessageDialog(this, "(^_^)恭喜您！！", "注意！！",
					JOptionPane.WARNING_MESSAGE);
		}
		if (cash == 40000) {
			JOptionPane.showMessageDialog(this, "(^_^)恭喜您！！！", "注意！！！",
					JOptionPane.WARNING_MESSAGE);
		}
		if (cash == 50000) {
			JOptionPane.showMessageDialog(this, "(﹁ ﹁)你真厉害系统已经崩溃！！！", "注意！！！",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public static void main(String[] args) {
		Saima hrp = new Saima();
	}

	public void actionPerformed(ActionEvent cs) {
		if (cs.getSource() == num1) // 1号骏马
		{
			i = 1;
		} else if (cs.getSource() == num2) // 2号骏马
		{
			i = 2;
		} else if (cs.getSource() == num3) // 3号骏马
		{
			i = 3;
		} else if (cs.getSource() == num4) // 4号骏马
		{
			i = 4;
		}
		if (cs.getSource() == start)// 开始按钮
		{
			check();
			if (j == 1) {
				p = Integer.parseInt(gamble.getText());
				Thread t1, t2, t3, t4;// 声明4个线程
				t1 = new Thread(race1);// 实例化线程1
				t2 = new Thread(race2);// 实例化线程2
				t3 = new Thread(race3);// 实例化线程3
				t4 = new Thread(race4);// 实例化线程4
				t1.start();// 启动线程
				t2.start();// 启动线程
				t3.start();// 启动线程
				t4.start();// 启动线程
				gamble.setEnabled(false);// 设置下注文本框为不可编辑
				start.setEnabled(false);// 开始按钮设置不可操作
				num1.setEnabled(false);// 骏马1单选按钮设置为不可操作
				num2.setEnabled(false);// 骏马2单选按钮设置为不可操作
				num3.setEnabled(false);// 骏马3单选按钮设置为不可操作
				num4.setEnabled(false);// 骏马4单选按钮设置为不可操作
				result.add("Race Started!!!");// 显示比赛以开始
			}
		}
		if (cs.getSource() == replay) {
			gamble.setText(null);// 单行文本域清空
			start.setEnabled(true);// 开始按钮设置为可操作
			num1.setEnabled(true);// 骏马1单选按钮设置为可操作
			num2.setEnabled(true);// 骏马2单选按钮设置为可操作
			num3.setEnabled(true);// 骏马3单选按钮设置为可操作
			num4.setEnabled(true);// 骏马4单选按钮设置为可操作
			gamble.setEnabled(true);// 下注文本框设置为可操作
			sai.i = 0;// 当骏马的标记设为0
			race1.step = 0;// 将骏马的步长设为0
			race1.x = 0;// 将骏马1的x设为0
			race1.y = 0;// 将骏马1的y设为0
			race2.step = 0;// 将骏马的步长设为0
			race2.x = 0;// 将骏马2的x设为0
			race2.y = 0;// 将骏马2的y设为0
			race3.step = 0;// 将骏马的步长设为0
			race3.x = 0;// 将骏马3的x设为0
			race3.y = 0;// 将骏马3的y设为0
			race4.step = 0;// 将骏马的步长设为0
			race4.x = 0;// 将骏马4的x设为0
			race4.y = 0;// 将骏马4的y设为0
			race1.repaint();// 重画骏马1
			race2.repaint();// 重画骏马2
			race3.repaint();// 重画骏马3
			race4.repaint();// 重画骏马4
		}
		if (cs.getSource() == exit) {// 如是退出铵钮
			System.exit(1);// 退出系统
		}
	}
	
}
