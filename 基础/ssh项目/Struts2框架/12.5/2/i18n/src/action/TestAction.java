package action;

public class TestAction {
	private String request_locale;

	public String getRequest_locale() {
		return request_locale;
	}

	public void setRequest_locale(String request_locale) {
		this.request_locale = request_locale;
	}
	public String execute(){
		return "success";
	}
}
