package dao.inter;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.po.Person;

@Transactional
public interface PersonDAO {
	@Transactional(propagation=Propagation.REQUIRED)
	public void add(Person p);
	
}
