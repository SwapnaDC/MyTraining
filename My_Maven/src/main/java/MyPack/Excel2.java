package MyPack;

import java.io.IOException;

public class Excel2
	{

	public static void main(String[] args) throws IOException
	{
		Excel e1=new Excel();
		
		
		String ob=e1.readData(0, 0);
		System.out.println("valuse of first column :"+ob);
		
		String ob1=e1.readData(0, 1);
		System.out.println("value of second column :"+ob1);
		
		String ob2=e1.readData(0, 2);
		System.out.println("value of third column :"+ob2);
		
		String ob3=e1.readData(0, 3);
		System.out.println("value of fourth column :"+ob3);
		
		

	}

}
