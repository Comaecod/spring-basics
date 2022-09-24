package com.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Repository
public class ComponentDAO {

	@Autowired
	ComponentJDBCConnection componentJDBCConnection;

	public ComponentJDBCConnection getComponentJDBCConnection() {
		return componentJDBCConnection;
	}

	public void setComponentJDBCConnection(ComponentJDBCConnection componentJDBCConnection) {
		this.componentJDBCConnection = componentJDBCConnection;
	}
}

