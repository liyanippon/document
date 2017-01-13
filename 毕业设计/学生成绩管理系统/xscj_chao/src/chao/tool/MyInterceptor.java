package chao.tool;

import java.util.Map;

import chao.model.Dlb;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		Map session=arg0.getInvocationContext().getSession();
		Dlb user=(Dlb)session.get("user");
		if(user==null)
		{
			return Action.LOGIN;
		}
		return arg0.invoke();
	}

}
