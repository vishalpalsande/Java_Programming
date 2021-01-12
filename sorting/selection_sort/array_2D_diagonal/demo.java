import scanfdata.scanf;
import java.lang.*;
import java.util.*;

class sorting extends scanf
{
	public sorting(int row,int col)
	{
		super(row,col);
	}
	
	public boolean check()
	{
		if(arr.length != arr[0].length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void selectionDiagonal()
	{
		int min=0,temp=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			min = i;
			for(int j=i+1;j<arr[i].length;j++)
			{
				if(arr[min][min] > arr[j][j])
				{
					min=j;	
				}
			}
			if(min != i)
			{
				temp=arr[min][min];
				arr[min][min]=arr[i][i];
				arr[i][i]=temp;
			}
		}
	}
}//class	


class demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter numbe of rows: ");
		int iRow = sobj.nextInt();
		
		System.out.print("Enter number of columns: ");
		int iCol = sobj.nextInt();
		
		sorting srobj = new sorting(iRow,iCol);
		
		srobj.accept();
		srobj.display();
		
		if( (srobj.check())== false )
		{
			System.out.println("\nRows and Columns are not same");
		}
		else
		{
			System.out.print("\n\nAfter Diagonal sorting ");
			srobj.selectionDiagonal();
			srobj.display();
		}
	
	}	
}
