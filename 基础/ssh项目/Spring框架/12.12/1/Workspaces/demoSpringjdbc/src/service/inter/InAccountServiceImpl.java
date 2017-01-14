package service.inter;

import dao.inter.AccountDAO;
import dao.inter.InAccountDAO;
import vo.Account;
import vo.Inaccount;

public class InAccountServiceImpl implements InAccountService{
private AccountDAO accountDAO;
private InAccountDAO inAccountDAO;

	public AccountDAO getAccountDAO() {
	return accountDAO;
}

public void setAccountDAO(AccountDAO accountDAO) {
	this.accountDAO = accountDAO;
}

public InAccountDAO getInaccountDAO() {
	return inAccountDAO;
}

public void setInaccountDAO(InAccountDAO inaccountDAO) {
	this.inAccountDAO = inaccountDAO;
}

	@Override
	public void test(Inaccount inAccount) {
		inAccountDAO.add(inAccount);
		Account account=accountDAO.getById(inAccount.getAccountid());
		account.setBalace(account.getBalace()+inAccount.getInbalance());
		accountDAO.update(account);
		
		
		// TODO Auto-generated method stub
		
	}

}
