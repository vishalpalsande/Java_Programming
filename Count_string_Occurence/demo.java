import java.lang.*;
import java.util.*;

class occurence
{
	public void count(String str)
	{
		char arr[] = str.toCharArray();
		int n=0, count=0;
		
		for(char c : arr)
		{
			n++;
		}
		
		System.out.println(n);
		
		
		for(int i =0 ; i<n; i++)
		{
			if( (arr[i] >= 'a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z') && arr[i]!= 1)
			{
			count=1;
				for(int j=i+1 ;j<n; j++)
				{
					if(arr[i] == arr[j] && arr[j] != 1)
					{
						count++;
						arr[j] = 1;
					}
				}
				System.out.println(arr[i]+" : "+count);
			}
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
		
		occurence obj = new occurence();
		
		obj.count(str);
	
	}
}
