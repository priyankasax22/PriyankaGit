package excelDataDriven;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class callUtility {

	

	

		@Test
		public void mytest() throws IOException
		{
		utilityExcel ex=new utilityExcel();
		
		ArrayList<String> data=ex.getData("TestCaseSheet1", "login");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));	
		System.out.println(data.get(2));
		
	}
	

	
		
	}


