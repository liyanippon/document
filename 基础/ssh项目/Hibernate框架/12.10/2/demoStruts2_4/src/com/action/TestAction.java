package com.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class TestAction {
	public String execute(){
		ActionContext request = ActionContext.getContext();
		
		request.put("name","’≈»˝");
		
		Map<String,Object> session = request.getSession();
		
		session.put("ps","addmin");
		
		Map<String,Object> application = request.getApplication();
		
		application.put("address","…Ú—Ù");
		
		return "show";
	}

}
