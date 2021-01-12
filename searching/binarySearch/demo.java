import scanfdata.scanf;
import java.lang.*;
import java.util.*;

class searching extends scanf
{
	public searching(int size)
	{
		super(size);
	}
	
	public boolean sorted(int num)
	{
		int i=0;
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
				break;
		}
		
		if(i==arr.length-1)
			return true;
		else
			return false;
	}
	
	public boolean binarySearch(int num)
	{
		int start=0,end=arr.length-1;
		int middle=0;
		while(start<=end)
		{
			middle = (start+end)/2;
			if(arr[start] == num || arr[end] ==  num || arr[middle] == num)
				break;
				
			if(num>arr[middle])
				start=middle+1;
			if(num<arr[middle])
				end=middle-1;
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
		
		if((srobj.sorted(num)) == false)
		{
				System.out.println("\nArray is not sorted");
		}
		else
		{
			if((srobj.binarySearch(num)) == false)
			{
					System.out.println("\nElement is NOT present is array");
			}	
			else
			{
					System.out.println("\nElement is PRESENT in array");
			}
		}
	}
}
