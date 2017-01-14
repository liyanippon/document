package dao.inter;

import org.springframework.jdbc.core.JdbcTemplate;

import vo.Inaccount;

public class InAccountDAOImpl implements InAccountDAO{
		private JdbcTemplate jt;
			
			public JdbcTemplate getJt() {
				return jt;
			}

			public void setJt(JdbcTemplate jt) {
				this.jt = jt;
			}
	@Override
	public void add(Inaccount inaccount) {
		jt.update("insert into inaccount values(?,?)",new Object[]{inaccount.getAccountid(),inaccount.getInbalance()});
			
		}// TODO Auto-generated method stub
		
	}


