import scanfdata.scanf;
import java.lang.*;
import java.util.*;

class sorting extends scanf
{
	public sorting(int row,int col)
	{
		super(row,col);
	}
	
	public void selectionRows()
	{
		int min=0,temp=0;
		
		for(int k=0;k<arr.length;k++)
		{
			for(int i=0;i<arr[k].length-1;i++)
			{
				min = i;
				for(int j=i+1;j<arr[k].length;j++)
				{
					if(arr[k][min] > arr[k][j])
					{
						min=j;	
					}
				}
				if(min!=i)
				{
					temp=arr[k][i];
					arr[k][i]=arr[k][min];
					arr[k][min]=temp;
				}
			}//inner for loop
		}//outer for loop
	}//function
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
		
		System.out.print("\n\nAfter sorting:");
		srobj.selectionRows();
		srobj.display();
	}
}
