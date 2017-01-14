package dao.inter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
		return jt.query("select * from account",new MyAccountMapper());
		
	}

	public Account getById(String accountid) {
		return (Account)jt.queryForObject("select * from account where accountid=?",new Object[]{accountid}, new MyAccountMapper());
		
	}

	public void update(Account account) {
		jt.update("update account set balance =? where accountid=?",new Object[]{account.getBalace(),account.getAccountid()});
		
	}

	public class MyAccountMapper implements RowMapper{

		public Object mapRow(ResultSet rs, int arg1) throws SQLException {
			Account account  = new Account();
			account.setAccountid(rs.getString(1));
			account.setBalace(rs.getDouble(2));
			return account;
		}
		
	}
}
