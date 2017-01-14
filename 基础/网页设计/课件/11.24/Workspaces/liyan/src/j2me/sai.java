package j2me;

import javax.swing.*;
import java.awt.*;

public class sai extends JPanel implements Runnable {
	private static final long serialVersionUID = -1513295524585444422L;
	int step = 0, x = 0;
	static int i = 0, z;
	int y;
	//ImageIcon 获得图片相关信息的类
	Image h1 = (new ImageIcon("0055.gif")).getImage();//获得图片
	//属性
	Saima hrp;
	int NO;
//提供构造器
	sai(Saima hrp) {
		this.hrp = hrp;
	}

	sai() {
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.white);// 设置画笔的颜色为白色
		g.fillRect(0, 0, this.getWidth(), this.getHeight());// 填充一个矩形
		g.setColor(Color.red);// 设置画笔的颜色为红色
		g.drawImage(h1, x, 0, this);// 画移动后的马
		g.fillRect(this.getWidth() - 40, 0, 5, 200);// 画红线
	}

	public void repaint(Graphics g) // 重画方法
	{
		g.setColor(Color.white);// 设置画笔的颜色为白色
		g.fillRect(0, 0, this.getWidth(), this.getHeight());// 填充一个矩形
		step = (int) (Math.random() * 25);// 设置步长
		x = x + step;// 横坐标加步长
		if (x > this.getWidth() - 40)
			x = this.getWidth() - 40;
		g.drawImage(h1, x, 0, this);// 画移动后的马
		g.setColor(Color.red);// 设置画笔的颜色为红色
		g.fillRect(this.getWidth() - 40, 0, 5, 200);// 画红线
	}

	public void run() {

		while (x < this.getWidth() - 40 - h1.getWidth(null)) // 判断是否到终点(没到终点)
		{
			if (i != 0)// 判断是否有马完成比赛
				break;
			Graphics g;// 声明画者
			g = this.getGraphics();// 当前窗体的画者赋值给g
			repaint(g);// 调用repaint方法
			try {
				Thread.currentThread().sleep(50);// 将当前活动线程设置睡眠50微秒
			} catch (Exception e) {
				System.out.println(e.toString());// 打印异常信息
			}

		}
		if (x >= this.getWidth() - 40 - h1.getWidth(null)) // 判断是否到终点(已到终点)
		{
			i++;// 将比赛结束标记设为1，表示已到终点
			y = i;// 将骏马的标记设为1，表示是哪匹马先到达了终点
			if (y == 1)// 如果已有骏马结束了比赛，调用判定结果的方法
				hrp.wol();// 调用判定结果的方法
		}

	}

}
