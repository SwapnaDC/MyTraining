package MyPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel1
	{
	XSSFSheet s;
	
	public String getData(int i,int j)
	{
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		
		int cellType=c.getCellType();
		
		switch (cellType)
		{
		case Cell.CELL_TYPE_STRING:
		{
			String st=c.getStringCellValue();
			return String .valueOf(st);
		}
		}
		return null;
	}

	
public Excel1 () throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Desktop\\excelfile\\excel1.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		s=w.getSheet("sheet2");
	
	}
}