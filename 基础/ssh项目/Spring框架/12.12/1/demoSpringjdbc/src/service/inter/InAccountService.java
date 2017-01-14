package service.inter;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import vo.Inaccount;

@Transactional
public interface InAccountService {
	@Transactional(propagation=Propagation.REQUIRED)
	public void test(Inaccount inAccount);
}
