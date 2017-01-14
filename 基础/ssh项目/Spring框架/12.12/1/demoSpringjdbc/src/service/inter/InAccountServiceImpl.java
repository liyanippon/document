package service.inter;

import vo.Account;
import vo.Inaccount;
import dao.inter.AccountDAO;
import dao.inter.InAccountDAO;

public class InAccountServiceImpl implements InAccountService{

	private AccountDAO accountDAO;
	private InAccountDAO inAccountDAO;
	
	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public InAccountDAO getInAccountDAO() {
		return inAccountDAO;
	}

	public void setInAccountDAO(InAccountDAO inAccountDAO) {
		this.inAccountDAO = inAccountDAO;
	}

	public void test(Inaccount inAccount) {
		inAccountDAO.add(inAccount);
		
		Account account = accountDAO.getById(inAccount.getAccountid());
		
		account.setBalace(account.getBalace()+inAccount.getInbalance());
		
		accountDAO.update(account);
	}

}
