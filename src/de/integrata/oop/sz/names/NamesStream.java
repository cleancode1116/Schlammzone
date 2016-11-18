package de.integrata.oop.sz.names;

public class NamesStream {
	
	public void forAllPrimesUpTo(int maximumNumber, PrimeCallback callback) {
		for (int potentialPrime = 1; potentialPrime < maximumNumber; potentialPrime++)  
		    callbackIfPrime(potentialPrime, callback); 
	}

	private void callbackIfPrime(int potentialPrime, PrimeCallback callback) {
		if (isPrime(potentialPrime)) 
		    callback.foundPrime(potentialPrime); 
	}

	private boolean isPrime(int potentialPrime) {
		for (int divisor = 2; divisor < potentialPrime; divisor++) 
		    if (istTeilbar(potentialPrime, divisor)) return false; 
		return true;
	}

	private boolean istTeilbar(int potentialPrime, int divisor) {
		return potentialPrime % divisor == 0;
	}

	
	
	
	
	
	
	interface PrimeCallback {
		void foundPrime(int prime);
	}
	
	static class ConsolePrint implements PrimeCallback {

		@Override
		public void foundPrime(int prime) {
			System.out.println(prime);
		}
		
	}

	
}
