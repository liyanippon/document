package vo;

public class Inaccount {
	private String accountid;//数据库没有主键
	private double inbalance;
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	public double getInbalance() {
		return inbalance;
	}
	public void setInbalance(double inbalance) {
		this.inbalance = inbalance;
	}
	
}
