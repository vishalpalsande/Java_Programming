import java.lang.*;
import java.util.*;

class lucky
{
	boolean number(int num)
	{
		int count = 2;
		
		if(count>num)
			return true;
			
		for(count=2; count < num; count++)
		{
			if(num%count ==0)
				break;
			System.out.println(count+" "+num);	
			num = num - (num/count);
		}
		
		if(count > num)
			return true;
		else
			return false;	
	
	}
}


class demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		
		int num = sobj.nextInt();
		
		lucky lobj = new lucky();
		
		System.out.println(lobj.number(num));
	}
}
