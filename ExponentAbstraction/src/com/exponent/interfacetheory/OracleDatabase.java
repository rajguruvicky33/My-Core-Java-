package com.exponent.interfacetheory;

public class OracleDatabase implements MyConnection{

	@Override
	public void commit() {
		System.out.println("-----commit method in oracle------");
	}

	@Override
	public void rollback() {
	System.out.println("------rollback method in oracle");
	}
	public static void main(String[] args) {
	
	MyConnection connection = new OracleDatabase();
	System.out.println(MyConnection.i);
	System.out.println(connection.j);
	connection.commit();
	connection.rollback();
	
	}
}
