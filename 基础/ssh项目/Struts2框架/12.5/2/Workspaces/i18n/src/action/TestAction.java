package action;

public class TestAction {
private String request_locale;


public String getRequest_locale() {
	return request_locale;
}


public void setRequest_locale(String requestLocale) {
	request_locale = requestLocale;
}


public String execute(){
	return "success";
}
}
