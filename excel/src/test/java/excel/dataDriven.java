package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("//Users//sds-deepan.m//Documents//Demosheet.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);

		int sheets= workbook.getNumberOfSheets();
		
		for (int i=0;i<sheets;i++)
		  {
			if (workbook.getSheetName(i).equalsIgnoreCase("Testdata"))
			  {
			XSSFSheet sheet= workbook.getSheetAt(i);
			
			Iterator<Row> rows = sheet.iterator();
			Row firstrow = rows.next();
			Iterator<Cell> cells = firstrow.cellIterator();
			int k=0;
			int column = 0;
			
			while (cells.hasNext())
			{
				Cell value =cells.next();
				if (value.getStringCellValue().equalsIgnoreCase("Testcase"))
				{
					column=k;
				}
				
				k++;
			}
			System.out.println(column);
			
			while (rows.hasNext())
				
			{
				Row r = rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
				{
					Iterator<Cell> cr=r.cellIterator();
					while (cr.hasNext())
					{
						System.out.println(cr.next().getStringCellValue());
					}

				}
										
						
			}
		      }
	}
		

	}
}
