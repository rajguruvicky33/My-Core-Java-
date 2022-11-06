package com.exponent.interfacetheory;

public class MySQLDatabase implements MyConnection {

	@Override
	public void commit() {
		System.out.println("This is MYSQL commit method");
	}

	@Override
	public void rollback() {
		System.out.println("This is MYSQL rollback method");
	}
	public static void main(String[] args) {
		MyConnection connection = new MySQLDatabase();
		System.out.println(i);
		System.out.println(j);
		connection.commit();
		connection.rollback();
	}
}
