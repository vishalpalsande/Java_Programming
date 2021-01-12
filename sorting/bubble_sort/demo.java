import scanfdata.scanf;
import java.lang.*;
import java.util.*;

class sorting extends scanf
{
	public sorting(int size)
	{
		super(size);
	}
	
	void bubble()
	{
		boolean bRet = true;
		int temp=0, iSize =arr.length;
		
		for(int i=0;i<iSize && bRet!=false;i++)
		{
			bRet=false;
			for(int j=0;j<iSize-1-i;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					bRet=true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
	}
				
}


class demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter number of element size: ");
		int iNo = sobj.nextInt();
		
		sorting srobj = new sorting(iNo);
		
		srobj.accept();
		srobj.display();
		srobj.bubble();
		srobj.display();
		
	}
}
		
		
