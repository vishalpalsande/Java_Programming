/* Problem Statement:- Write a program count the number of words in string */

import java.lang.*;
import java.util.*;

class reverse
{
	public int revString(String str)
	{
		char arr[]=str.toCharArray();
		int iCnt=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if( (i+1 == arr.length && arr[i] != ' ') || (arr[i] != ' ' && arr[i+1] == ' ')  )
						iCnt++;
		}
		
		return iCnt;
	}
}

class demo
{
	public static void main(String arg[])
	{
	
		Scanner sobj= new Scanner(System.in);
		
		System.out.println("Enter any string: ");
		String arr=sobj.nextLine();
		
		reverse robj= new reverse();
		
		System.out.println("Number of words are: "+robj.revString(arr));
	}
}
