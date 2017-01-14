package dao.inter;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import vo.Account;

public class AccountDAOImpl implements AccountDAO{

	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void add(Account account) {
		
		jt.update("insert into account values(?,?)",new Object[]{account.getAccountid(),account.getBalace()});
	}

	public void delete(String accountid) {
		jt.update("delete from account where accountid=?",new Object[]{accountid});
		
	}

	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Account getById(String accountid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Account account) {
		jt.update("update account set balance =? where accountid=?",new Object[]{account.getBalace(),account.getAccountid()});
		
	}

}
