package rsa;
import java.lang.Math;

public class Main {

	public static void main(String[] argv) {
		
		//generate p and q
		//generate until GCD(p, q) = 1
		
		//n=p*q
		
		//totient = (p-1)*(q-1)
		
		//user inputs e
		//user inputs until e < totient
		//user inputs until GCD(e, n) = 1
		
		int m = 7;

		RSAoperations rsaOps = new RSAoperations(877, 277, m);
		
		System.out.println(rsaOps.c);
		//Cryptography crypt = new Cryptography();
		//System.out.println(crypt.numToMsg(3456));
	}
}
