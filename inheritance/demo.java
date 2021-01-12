import scandata.scan;
import java.lang.*;
import java.util.*;

class Sorting extends scan
{
	public Sorting(int size)
	{
		super(size);
	}
	
	public void print()
	{
		System.out.println("\nIn sorting");
		
		for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+"\t");
			}
	}
}

class demo
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int iNo= sobj.nextInt();
		
		Sorting stobj=new Sorting(iNo);
		stobj.accept();
		stobj.display();
		stobj.print();
		
	}
}
