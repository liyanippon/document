package com.bmw.sale.filter;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CarInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation ai) throws Exception {
		Map<String, Object> session=ai.getInvocationContext().getSession();
		String depatment=(String)session.get("depatment");
		if(depatment.equals("缁忕悊")||depatment.equals("閿�敭")){
			return ai.invoke();
		}else{
			System.out.println("杞﹀瀷鎷︽埅鍣ㄥ惎鍔�");
			return "noPower";	
		}		
	}

}
