package test;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//设置响应字符集
		resp.setCharacterEncoding("utf-8");
		//设置MIME类型
		resp.setContentType("text/html");
		//设置响应体内容
		Writer w=resp.getWriter();	//向响应体写入数据的字符流
		w.write("<html>");
		w.write("<body>");
		for(int i=1;i<=100;i++){
			w.write("<p>"+i+"</p>");
		}
		w.write("</body>");
		w.write("</html>");
		w.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
