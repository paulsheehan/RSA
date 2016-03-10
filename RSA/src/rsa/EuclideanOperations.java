package rsa;

public class EuclideanOperations {
	
	public int calculateGCD(int x1, int y1,int r)
	{	
		int quotient = calculateQuotient(x1, y1);
		
		r = x1-(y1*quotient);
		
		if(r < 1)	//r is the remainder which is the base case
		{
			int GCD = y1;	//gcd is the last y in our alg because variables have not been shifted yet
			return GCD;	//return answer
		}
		else
		{
			x1 = y1;	//shifting of variables
			y1 = r;	//moving onto next step in the alg
			System.out.println("x:" + x1 + "y:" + y1 + "q:" + quotient);
			return calculateGCD(x1, y1, r);	//function calls itself
		}
	}
	
	public int calculateQuotient(int x1, int y1)
	{
		double quotient = Math.floor(x1/y1); //round down number
		return (int)quotient;	//cast as an integer
	}
	
	public void calulateExtendedEuch()
	{
		
	}
}
