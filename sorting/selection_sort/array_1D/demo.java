import scanfdata.scanf;
import java.lang.*;
import java.util.*;

class sorting extends scanf
{
	public sorting(int size)
	{
		super(size);
	}
	
	public void selection()
	{
		int min=0,temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min] > arr[j])
				{
					min = j;
				}
			}
			
			if(i != min)
			{
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
	}
	

}

class demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter numbe of elements: ");
		int iNo = sobj.nextInt();
		
		sorting srobj = new sorting(iNo);
		
		srobj.accept();
		srobj.display();
		
		System.out.print("\n\nAfter sorting:");
		srobj.selection();
		srobj.display();
	}
}
