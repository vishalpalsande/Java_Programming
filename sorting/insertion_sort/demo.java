import scanfdata.scanf;

import java.lang.*;
import java.util.*;

class sorting extends scanf
{
	public sorting(int size)
	{
		super(size);
	}
	
	void insertionSort()
	{
		int key=0,j=0;
		
		for(int i=1;i<arr.length;i++)
		{
			key = arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			if(arr[j+1] != key)
				arr[j+1] = key;
		}
	}
	
}

class demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int iNo = sobj.nextInt();
		
		sorting srobj = new sorting(iNo);
		
		srobj.accept();
		srobj.display();
		
		System.out.print("\nAfter Sorting ");
		srobj.insertionSort();
		srobj.display();

	}
}
