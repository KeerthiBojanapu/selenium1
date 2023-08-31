package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceldataget {
	@Test
	//@DataProvider
	//public String[][] getdata() throws Throwable{
	public void getdata() throws IOException {

		File file=new File("./target/testdata (1).xlsx");
		System.out.println(file.exists());
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(1).getLastCellNum();
		//String[][] data=new String[rows-1][cells];
		for(int i = 0; i < rows; i++)
		//for(int i=0;i<rows-1;i++)
		{
			for(int j = 0; j < cells; j++)
			{
				DataFormatter df=new DataFormatter();				
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				//data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
				
			}
		System.out.println();
			
		}
//		for(String[]datas:data) {
//			System.out.println(Arrays.toString(datas));
//				
//	}
//		return data;

}
}

