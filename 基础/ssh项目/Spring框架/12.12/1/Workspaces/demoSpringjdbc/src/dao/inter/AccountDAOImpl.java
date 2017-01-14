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

	@Override
	public void add(Account account) {
		jt.update("insert into account values(?,?)" ,new Object[]{account.getAccountid(),account.getBalace()});// TODO Auto-generated method stub
		
	}
	public void delete(String accountid) {
		jt.update("delete from account where accountid=? " ,new Object[]{accountid});// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return jt.query("select * from account", new MyAccountMapper());
	}

	@Override
	public Account getById(String accountid) {
		// TODO Auto-generated method stub
		return (Account)jt.queryForObject("select * from account where accountid=?",new Object[]{accountid},new MyAccountMapper());
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		jt.update("insert into account values(?,?)" ,new Object[]{account.getAccountid(),account.getBalace()});
	}
	
	public class MyAccountMapper implements RowMapper{
		
		public Object mapRow(ResultSet rs,int arg1){
			Account account=new Account();
			try {
				account.setAccountid(rs.getString(1));
				account.setBalace(rs.getDouble(2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return account;
		}
	}

}
