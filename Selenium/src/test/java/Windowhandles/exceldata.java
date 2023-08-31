package Windowhandles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File file=new File("./target/Bug Report Sheet of User panel.xlsx");
		//System.out.println(file.exists());
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet sheet= workbook.getSheet("BUG REPORT");
		//System.out.println(sheet.getPhysicalNumberOfRows());
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(1).getLastCellNum();
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cells;j++)
			{
				DataFormatter df=new DataFormatter();
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			}
			System.out.println();
		}
	}
}
