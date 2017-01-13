package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TUserDAO;
import com.model.TUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.util.Cart;

public class UserAction extends ActionSupport
{
    	
	private Integer userId;
	private String userName;
	private String userPw;
	private String userRealname;

	private String userSex;
	private String userAge;
	private String userAddress;
	private String userTel;

	private String userEmail;
	
	private String message;
	private String path;
	
	private TUserDAO userDAO;
	
	
	//会员注册
	public String userReg()
	{
		TUser user=new TUser();
		
		user.setUserName(userName);
		user.setUserPw(userPw);
		user.setUserRealname(userRealname);
		user.setUserSex(userSex);
		
		user.setUserAge(userAge);
		user.setUserAddress(userAddress);
		user.setUserTel(userTel);
		user.setUserEmail(userEmail);
		
		user.setUserDel("no");
		
		userDAO.save(user);

		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "注册成功，请登录");
		return "msg";
	}
	
	
	
	//会员修改个人资料
	public String userEdit()
	{
		TUser user=userDAO.findById(userId);
		
		user.setUserName(userName);
		user.setUserPw(userPw);
		user.setUserRealname(userRealname);
		user.setUserSex(userSex);
		
		user.setUserAge(userAge);
		user.setUserAddress(userAddress);
		user.setUserTel(userTel);
		user.setUserEmail(userEmail);
		
		userDAO.attachDirty(user);

		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "修改成功。重新登录后生效");
		return "msg";
	}
	
	
	
	
	//会员登录
	public String userLogin()
	{
		String sql="from TUser where userName=? and userPw=?";
		Object[] con={userName,userPw};
		List userList=userDAO.getHibernateTemplate().find(sql,con);
		if(userList.size()==0)
		{
			this.setMessage("用户名或密码错误");
			this.setPath("qiantai/default.jsp");
		}
		else
		{
			 Map session= ServletActionContext.getContext().getSession();
			 TUser user=(TUser)userList.get(0);
			 session.put("user", user);
			 
			 Cart cart=new Cart();
			 session.put("cart", cart);
			 
			 this.setMessage("成功登录");
			 this.setPath("qiantai/default.jsp");
		}
		return "succeed";
	}
	
	
	
	//会员退出系统
	public String userLogout()
	{
		Map session= ServletActionContext.getContext().getSession();
		session.remove("user");
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	//管理员删除会员
	public String userDel()
	{
		TUser user=userDAO.findById(userId);
		userDAO.delete(user);
		user.setUserDel("yes");		
		this.setMessage("删除成功");
		this.setPath("userMana.action");
		return "succeed";
	}
	
	
	
	//管理员查看会员信息
	public String userXinxi()
	{
        String sql="from TUser where userId="+userId;
		
		List userList=userDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("userList", userList);
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	//会员管理
	public String userMana()
	{
		String sql="from TUser where userId!='null'";
		
		List userList=userDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("userList", userList);
		return ActionSupport.SUCCESS;
	}
	
	
	
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public String getPath()
	{
		return path;
	}
	public void setPath(String path)
	{
		this.path = path;
	}
	public String getUserAddress()
	{
		return userAddress;
	}
	public void setUserAddress(String userAddress)
	{
		this.userAddress = userAddress;
	}
	public String getUserAge()
	{
		return userAge;
	}
	public void setUserAge(String userAge)
	{
		this.userAge = userAge;
	}
	public TUserDAO getUserDAO()
	{
		return userDAO;
	}
	public void setUserDAO(TUserDAO userDAO)
	{
		this.userDAO = userDAO;
	}
	public String getUserEmail()
	{
		return userEmail;
	}
	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}
	public Integer getUserId()
	{
		return userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserPw()
	{
		return userPw;
	}
	public void setUserPw(String userPw)
	{
		this.userPw = userPw;
	}
	public String getUserRealname()
	{
		return userRealname;
	}
	public void setUserRealname(String userRealname)
	{
		this.userRealname = userRealname;
	}
	public String getUserSex()
	{
		return userSex;
	}
	public void setUserSex(String userSex)
	{
		this.userSex = userSex;
	}
	public String getUserTel()
	{
		return userTel;
	}
	public void setUserTel(String userTel)
	{
		this.userTel = userTel;
	}
	
}
