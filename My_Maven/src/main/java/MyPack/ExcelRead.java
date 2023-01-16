package MyPack;

import java.io.IOException;

public class ExcelRead
{
	public static void main(String[] args) throws IOException 
	{
		Excel ob= new Excel();
		
		
		String a=ob.readData(0,0);
		System.out.println("Value of a is "+a);
 
		String b=ob.readData(0,1);
		System.out.println("Value of b is "+b);
		
		
	}
}


