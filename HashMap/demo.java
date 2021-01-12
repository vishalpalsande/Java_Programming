import java.lang.*;
import java.util.*;

class Hash
{
	public void occur(String str)
	{
		char arr[] = str.toCharArray();
		
		HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();
		
		for(char c : arr)
		{
			if(hobj.containsKey(c) && c!= ' ')
			{
				hobj.put(c,hobj.get(c)+1);
			}
			else
			if(c!= ' ')
			{
				hobj.put(c,1);
			}
		}
		
		System.out.println("Followings are occurences:\n"+hobj );
	}

}

class demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter any string: ");
		String str = sobj.nextLine();
		
		Hash hobj = new Hash();
		
		hobj.occur(str);
	}
}
		
