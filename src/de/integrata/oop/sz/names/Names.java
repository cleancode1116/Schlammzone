package de.integrata.oop.sz.names;

public class Names {

	public void doIt(int m) {
		for (int i = 1; i < m; i++) { 
		    boolean b = true; 
		    for (int j = 2; j < i; j++) { 
		        if (i % j == 0) { 
		            b = false; 
		            break; 
		        } 
		    } 
		    if (b) { 
		        System.out.println(i); 
		    } 
		} 
	}
	
}
