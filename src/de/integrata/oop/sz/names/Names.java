package de.integrata.oop.sz.names;

public class Names {

	public void printPrimesUpTo(int maximumNumber) {
		for (int potentialPrime = 1; potentialPrime < maximumNumber; potentialPrime++) { 
		    boolean isPrime = true; 
		    for (int divisor = 2; divisor < potentialPrime; divisor++) { 
		        if (potentialPrime % divisor == 0) { 
		            isPrime = false; 
		            break; 
		        } 
		    } 
		    if (isPrime) { 
		        System.out.println(potentialPrime); 
		    } 
		} 
	}
	
}
