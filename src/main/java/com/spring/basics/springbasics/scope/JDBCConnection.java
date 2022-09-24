package com.spring.basics.springbasics.scope;

//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JDBCConnection {
	public JDBCConnection() {
//		System.out.println("JDBC COnnection");
	}
}
