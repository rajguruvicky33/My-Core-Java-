package com.equalsandhashcode;

import java.util.Objects;

public class Employee {
	private int eId;
	private String eName;
	
	public Employee(int eId,String eName) {
		this.eId=eId;
		this.eName=eName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(eId, eName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eId == other.eId && Objects.equals(eName, other.eName);
	}
	

}
