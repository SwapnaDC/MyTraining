package MyPack;

import java.io.IOException;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException
	{
		Excel ex=new Excel();
		
		for(int i=0;i<ex.rowsize();i++)
		{
			for(int j=0;j<2;j++)
			{
				String str=ex.readData(i,j);
				System.out.println("Value of cell ("+i+","+j+")"   +str);
			}
		}
		

	}

}
