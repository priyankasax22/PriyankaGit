package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utilityExcel {
	
	public ArrayList<String>  getData(String testsheetname,String testcasename) throws IOException
	{
		//taking array type variable a ,just to store cell values in proper format so that can  pass it in test case using index
	ArrayList<String> a=new ArrayList<String>();
	
	//to read any file FileInputStream class is used
		FileInputStream fi=new FileInputStream("C:\\Users\\User\\Documents\\TestCaseWorkbook.xlsx");
		
		//passing file to XSSFWorkbook class to handle excel Workbook
		XSSFWorkbook wbook= new XSSFWorkbook (fi);
		
		//collecting total number of sheets from workbook
		int sheets=wbook.getNumberOfSheets();
		
		//now iterating on sheets to get desired sheet
		for(int i=0;i<sheets;i++)
		{
			if(wbook.getSheetName(i).equalsIgnoreCase(testsheetname))
			{
				//after reaching on desired sheet,get that sheet
				XSSFSheet sheet=wbook.getSheetAt(i);
				
				//now after getting sheet,will start iterating on rows using iterator() of Iterator class
				Iterator<Row> rows=sheet.iterator();
				
				//to reach on first row
				Row firstRow=rows.next();
				
				//after reaching on first row,will start iterating on its each cell
				Iterator<Cell> ce=firstRow.cellIterator();
				
				//to iterate on each cell of  row need to use Loop//////
				int k=0;
				int column = 0;
				
				//to validate cell exist
				while(ce.hasNext())
				{
					//to reach first cell of first row
					Cell value=ce.next();
					
					
					//now check first cell value is desired value otherwise keep going to next cell  using loop
					if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
					{
						column=k;
					}
					k++;
					//System.out.println(column);
					
				}
												
		//to validate next rows exist 
			while(rows.hasNext())
			{
				//to reach next row
				Row r=rows.next();
				
				//now will work on coordinator(rows and columns) to access each cell value from table
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
				{
					//work on cell cell of table
					Iterator<Cell>  cv=r.cellIterator();
					
					//keep checking each cell of table
					while(cv.hasNext())
					{
						Cell c=cv.next();
						//System.out.println(c);
						
						
						//checking type of cell value
						if(c.getCellTypeEnum()==CellType.STRING)
						{
						//getting value of each cell
						a.add(c.getStringCellValue());
						}
						else
						{
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							
						}
					}
				}
			}
				
		}}
		return a;
		

}}


