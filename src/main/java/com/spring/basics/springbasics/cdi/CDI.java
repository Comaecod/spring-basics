package com.spring.basics.springbasics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//@Component
@Named
public class CDI {
	
//	@Autowired
	@Inject
	CDIDao cDIDao;

	public CDIDao getcDIDao() {
		return cDIDao;
	}

	public void setcDIDao(CDIDao cDIDao) {
		this.cDIDao = cDIDao;
	}
	
	
	
}
