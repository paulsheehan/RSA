package rsa;

import java.util.Random;
import java.math.BigInteger;

public class RSAoperations {

	int p, q;
	int n;
	int totient;
	int e;
	int m;
	int c;
	
	EuclideanOperations euchOps; 	//Instantiates Euclidean class to perform euclidean functions
	
	RSAoperations(int p, int q, int m) {
		
		euchOps = new EuclideanOperations();	//instantiate Euclidean class for gcd functions
		
		this.p = p;
		this.q = q;
		this.m = m;
		
		relativePrimeCheck(p, q);	//check GCD(p, q) = 1
		
		n = p*q;	//calculate n
		
		totient = (p-1)*(q-1);	//calculate totient
		
		e = chooseE();	//choose e for public key encrypt
		encryptMessage();
	}
	
	public int generateRelativePrime(int n) {
		//max int is 2147483647
		return n;
	}
	
	public int relativePrimeCheck(int x, int y) {	//uses Euclideans Algorithm to check if GCD(x, y) = 1
		
		return euchOps.calculateGCD(x, y, 0);
	}
	
	public int chooseE() {
		Random rand = new Random();
		
		while(true)
		{
			e = rand.nextInt(totient);
			//e = 3;
			if(euchOps.calculateGCD(e, totient, 0) == 1)
			{
				return e;
			}
		}
	}
	
	public void encryptMessage() {	//c = m^e % n
		
		c = m^e % n;
	}
}
