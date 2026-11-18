package org.mql.java.reflection.dao;

public class MySqlDataSource implements DataSource{

	@Override
	public void getConnection() {
		System.out.println("MySqlDataSource getConnection()");
		
	}

}
