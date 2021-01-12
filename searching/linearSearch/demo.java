import scanfdata.scanf;
import java.lang.*;
import java.util.*;

class searching extends scanf
{
	public searching(int size)
	{
		super(size);
	}
	
	public boolean linearSearch(int num)
	{
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i] == num)
				break;
		}
		
		if(i== arr.length)
			return false;
		else
			return true;
	}
	
	public boolean twoLinearSearch(int num)
	{
		int start=0,end=arr.length-1;
		for(start=0,end=arr.length-1; start<=end; start++,end--)
		{
			if(arr[start]== num || arr[end]== num)
				break;
		}
		
		if(start>end)
			return false;
		else
			return true;
	}
}

class demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int iNo = sobj.nextInt();
		
		searching srobj = new searching(iNo);
		
		srobj.accept();
		srobj.display();
		
		System.out.print("\nEnter number you want to search in array: ");
		int num = sobj.nextInt();
		System.out.println("\nlinear Search 1 direction: "+srobj.linearSearch(num));
		System.out.println("\nLinear search 2 direction: "+srobj.twoLinearSearch(num));
		
	}
}
