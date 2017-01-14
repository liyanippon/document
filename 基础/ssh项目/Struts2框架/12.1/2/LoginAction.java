package action;

public class LoginAction {
	private String name;
	private String pw;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String execute(){
		
		System.out.println("execute");
		System.out.println(name+","+pw);
		
		
		
		return "ok";
	}

}
