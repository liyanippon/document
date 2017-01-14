
package com.dao.dao.inter;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dlsm.struts.register.model.PersonBean.PersonBean;

@Transactional
public interface PersonDAO {

	@Transactional(propagation=Propagation.REQUIRED)
	public void add(PersonBean person);
		
}
