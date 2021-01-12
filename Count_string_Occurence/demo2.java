import java.lang.*;
import java.util.*;

class occurence
{
	public void count(String str)
	{
		char arr[] = str.toCharArray();
		int count = 0,len = 0;
		
		for(char c: arr)
		{
			len++;
		}
		
		for(int i = 0 ;i<len;i++)
		{
			count=0;
			for(int j = 0;j<=i;j++)
			{
				if(arr[i] == arr[j])
					count++;
			}
			
			if(count!=0)
			{
				System.out.println(arr[i]+" : "+count);
			}
		}	
	}
}

class demo2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter any string: ");
		
		String str = sobj.nextLine();
		
		occurence obj = new occurence();
		
		obj.count(str);
	
	}
}
