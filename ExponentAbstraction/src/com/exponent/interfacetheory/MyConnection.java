package com.exponent.interfacetheory;
//int interface variable are bydefault public,static,final

public interface MyConnection {
	int i=45;
	String j="Hello";
	
	public void commit();
	
	public void rollback();
}
