package dao.inter;

import java.sql.SQLException;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import po.Person;
@Transactional
public interface PersonDAO {
	@Transactional(propagation=Propagation.REQUIRED)
	public void add(Person p);
	public Person check(String name,String password) throws SQLException;
	public void del(Integer pid) throws SQLException;
	//public void del(Person p);
	public List<Person> getAll();
}
