package scanfdata;

import java.lang.*;
import java.util.*;

public class scanf
{
	public int arr[][];
	
	public scanf(int row,int col)
	{
		arr = new int[row][col];
	}
	
	public void accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Enter ["+(i+1)+","+(j+1)+"] element: ");
				arr[i][j] = sobj.nextInt();
			}
			System.out.println();
		}
	}
	
	public void display()
	{
		System.out.println("Data is:");
		System.out.println("============================================");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("============================================");
	}
	
}
