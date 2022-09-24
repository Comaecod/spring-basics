package com.spring.basics.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentJDBCConnection {
	public ComponentJDBCConnection() {
		System.out.println("JDBC Connection");
	}
}
