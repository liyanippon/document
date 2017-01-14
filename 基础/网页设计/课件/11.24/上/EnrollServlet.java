package org.stuenroll.enroll;

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

public class EnrollServlet extends HttpServlet {

	EnrollDAO enrollDAO = new EnrollDAO();
	SpecialtyDAO specialtyDAO=new SpecialtyDAO();
	SchoolDAO schoolDAO=new SchoolDAO();

	/**
	 * Constructor of the object.
	 */
	public EnrollServlet() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
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
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");// 表单转码

		String ftype = request.getParameter("ftype"); // 表单上传的隐藏字段

		String name = request.getParameter("name");
		String pid = request.getParameter("pid");
		String specialtySubmit = request.getParameter("specialtySubmit");
		String eduSchool = request.getParameter("eduSchool");
		String classNo = request.getParameter("classNo");
		String joinState = request.getParameter("joinState");
		
		try {
			ArrayList spList=specialtyDAO.getAll();	//取出申报专业表的所有数据
			request.setAttribute("spList", spList);
			
			ArrayList scList=schoolDAO.getAll();
			request.setAttribute("scList", scList);
			if ("search".equals(ftype)) {
				// 1.依据查询条件确定记录的总数
				long ct = enrollDAO.count(name, pid, specialtySubmit,
						eduSchool, classNo, joinState);
				// 2.计算总页数
				long page = (ct % 17 == 0) ? ct / 17 : ct / 17 + 1;
				request.setAttribute("page", Long.valueOf(page));
				request.setAttribute("now", Long.valueOf(1));

				// 3.查询第一页的数据
				ArrayList list = enrollDAO.search(name, pid, specialtySubmit,
						eduSchool, classNo, joinState, Integer.valueOf(0),
						Integer.valueOf(17));
				request.setAttribute("enList", list);
				request.getRequestDispatcher("/jsp/backyard/index.jsp")
						.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
