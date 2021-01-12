import java.lang.*;
import java.util.*;

class Reverse
{
	public void revString(String str)
	{	
		char arr[] = str.toCharArray();
		int iSize = arr.length,j=0;
		
		for(int i=0;i<iSize;i++)
		{
			if( (i != 0) && (((i+1 == iSize) && (arr[i] != ' ')) ||  ( (arr[i] == ' ') && (arr[i-1] != ' '))) )
			{
				if(i+1 == iSize)
					j=i;
				else
					j=i-1;
					
				while(j>=0 && arr[j]!=' ')
				{
					System.out.print(arr[j]);
					j--;
				}
			}
			
			if(arr[i]==' ' || iSize == 1)
				System.out.print(arr[i]);
		}
		 
	}
}

class demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter any string: ");
		String str = sobj.nextLine();
			
		Reverse robj = new Reverse();
		
		robj.revString(str);
	}
}
