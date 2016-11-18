package de.integrata.oop.sz.names;

import java.io.ObjectOutputStream;

public class Various {

	ObjectOutputStream objectOutputStream;
	
	public static void main(String[] args) {
		
		int managersAverageSalary = averageSalary(managers);
		int employeesAverageSalary = averageSalary(employees);
		
		
		
		
	}
	
	ObjectOutputStream getObjectOutputStream() {
		if (objectOutputStream != null) {
			return objectOutputStream;
		}
		objectOutputStream = new ObjectOutputStream(null);
		return objectOutputStream;
		
		
	}
	
	
	
}
