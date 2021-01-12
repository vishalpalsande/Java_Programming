package scandata;
import java.lang.*;
import java.util.*;

public class scan
{
	public
		int arr[];
		
	public scan(int size)
	{
		arr = new int[size];
	}
	
	public void accept()
	{
		Scanner sobj= new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sobj.nextInt();
		}
	}
	
	public void display()
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
}
		
