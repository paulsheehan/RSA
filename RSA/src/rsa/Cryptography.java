package rsa;

import java.util.ArrayList;

public class Cryptography {

	public char[] alpha;
	
	Cryptography()
	{
		alpha = new char[26];
		for(char c = 65; c < (65+26); c++)
		{
			alpha[c-65] = c;
		}
	}
	
	public void encryptMessage()
	{
	}
	
	public void decryptMessage(int m)
	{
	}
	
	public int msgToNum(String msg)
	{
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		
		for (int i = 0; i < msg.length(); i++)	//finds the numerical value for each letter in msg
		{
			for (int j = 0; j < alpha.length; j++)
			{
				if(msg.charAt(i) == alpha[j])
				{
					numArray.add(j);
				}
			}
		}
		
		//convert int[] to int
		int intMsg = 0;
		return intMsg;
	}
	
	public String numToMsg(int m)
	{
		String msg = new String();
		
		String stringM = String.valueOf(m);
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		
		for(int i =0; i <stringM.length();i++)
		{
			numArray.add((int)stringM.charAt(i));
			
			System.out.println(numArray);
			for(int j = 0; j < alpha.length; j++)
			{
				if(numArray.indexOf(i) == j)
				{
					System.out.println("hittin it");
					msg=msg+alpha[j];
				}
			}
		}
		return msg;
	}
	
}
