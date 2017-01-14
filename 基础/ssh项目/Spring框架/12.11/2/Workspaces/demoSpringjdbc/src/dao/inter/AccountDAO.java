package dao.inter;

import java.util.List;

import vo.Account;

public interface AccountDAO {
public void add(Account account);
public void update(Account account);
public void delete(String account);
public Account getById(String accountid);
public List<Account> getAll();
}
