package scanfdata;

import java.lang.*;
import java.util.*;

public class scanf
{
	public int arr[];
	
	public scanf(int size)
	{
		arr = new int[size];
	}
	
	public void accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" element: ");
			arr[i] = sobj.nextInt();
		}
	}
	
	public void display()
	{
		System.out.println("Data is:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
	
}
