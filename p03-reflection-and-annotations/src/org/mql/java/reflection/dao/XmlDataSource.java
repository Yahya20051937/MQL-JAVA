package org.mql.java.reflection.dao;

public class XmlDataSource implements DataSource {

	@Override
	public void getConnection() {
		System.out.println("xml DataSource getConnection()");
		
	}

}
