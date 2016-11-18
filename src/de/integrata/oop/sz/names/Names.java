package de.integrata.oop.sz.names;

public class Names {

	public void printPrimesUpTo(int maximumNumber) {
		for (int potentialPrime = 1; potentialPrime < maximumNumber; potentialPrime++)  
		    printIfPrime(potentialPrime); 
	}

	private void printIfPrime(int potentialPrime) {
		if (isPrime(potentialPrime)) 
		    System.out.println(potentialPrime); 
	}

	private boolean isPrime(int potentialPrime) {
		for (int divisor = 2; divisor < potentialPrime; divisor++) 
		    if (istTeilbar(potentialPrime, divisor)) return false; 
		return true;
	}

	private boolean istTeilbar(int potentialPrime, int divisor) {
		return potentialPrime % divisor == 0;
	}
	
}
