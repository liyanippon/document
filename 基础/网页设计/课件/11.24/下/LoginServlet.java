package org.stuenroll.user;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.stuenroll.dao.EnrollDAO;
import org.stuenroll.dao.SchoolDAO;
import org.stuenroll.dao.SpecialtyDAO;
import org.stuenroll.dao.UserDAO;
import org.stuenroll.util.AES;

import sun.awt.RepaintArea;

public class LoginServlet extends HttpServlet {
	UserDAO userDAO=new UserDAO();
	SpecialtyDAO specialtyDAO=new SpecialtyDAO();
	SchoolDAO schoolDAO=new SchoolDAO();
	EnrollDAO enrollDAO=new EnrollDAO();

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.请求数据转码
		request.setCharacterEncoding("utf-8");
		//2.获取表单数据
		//  String 变量 = request.getParameter("控件的名字");
		//  String[] 变量 = request.getParameterValues("控件名字");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		password=AES.encrypt(password, AES.key);	//把表单上传的密码加密
		try {
			boolean bool=userDAO.login(username, password);
			//网页重定向技术（网页跳转技术）
			//response.sendRedirect("跳转地址");
			//注意事项：
			//1.重定向技术可以跳转到任何网站的网页，不仅仅只能跳转本网站的网页，故此URL地址要写/项目名
			//2.重定向技术会重新让浏览器创建新的连接，然后跳转到新的网页
			//3.重定向技术无法在网页之间传递数据
			//4.重定向执行的时候浏览器的地址会发生变化
			if(bool==true){
				//response.sendRedirect("/stuenroll/jsp/backyard/index.jsp");
				/*
				 * 请求转发（网页跳转技术）
				 * request.getRequestDispatcher("跳转地址").forward(request, response);
				 * 注意事项：
				 * 1.请求转发只能跳转到当前项目内的任何网页，不能跳转到项目之外的网页，故此URL不用写项目名，但是需要以/开头
				 * 2.请求转发不会创建新的HTTP连接，所以浏览器的地址不会发生变化
				 * 3.请求转发可以在网页之间传递数据
				 * 请求转发保存数据
				 * request.setAttribute(String,Object);
				 * Object request.getAttribute(String);
				 * request.removeAttribute(String);
				 */
				ArrayList spList=specialtyDAO.getAll();	//取出申报专业表的所有数据
				request.setAttribute("spList", spList);
				
				ArrayList scList=schoolDAO.getAll();
				request.setAttribute("scList", scList);
				
				//无条件查询25条数据
				ArrayList enList=enrollDAO.search(null, null, null, null, null, null, new Integer(0), new Integer(17));
				request.setAttribute("enList", enList);
				
				/**************************************************/
				//查询总记录数
				long ct=enrollDAO.count(null, null, null, null, null, null);
				//查询总页数
				long page=(ct%17==0)?ct/17:ct/17+1;
				request.setAttribute("page", Long.valueOf(page));
				request.setAttribute("now", Long.valueOf(1));
				/***************************************************/
				
				request.getRequestDispatcher("/jsp/backyard/index.jsp").forward(request,response);
				
			}
			else{
				response.sendRedirect("/stuenroll/jsp/backyard/login.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
