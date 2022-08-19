package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {

		// 1.Mention the file Location
		File f = new File(
				"C:\\Users\\Nandhini\\eclipse-workspace\\MavenProject\\src\\test\\resources\\TestData\\sampleexcel.xlsx");

		// 2.Read the file from excel
		FileInputStream fin = new FileInputStream(f);

		// 3.Type of workbook
		Workbook w = new XSSFWorkbook(fin);

		// 4.Get the Sheet
		Sheet s = w.getSheet("greens");

		// Get the physical no of rows
		int pRows = s.getPhysicalNumberOfRows();
		System.out.println("Physical No of Rows :" + pRows);

		// get the Row
		Row r = s.getRow(4);

		// get the physical number of cells
		int pCells = r.getPhysicalNumberOfCells();
		System.out.println("Phsical No of Cells :" + pCells);

		// // 5.Select the row
		// Row r = s.getRow(3);
		//
		// // 6.Select the cell
		// Cell c = r.getCell(1);
		//
		// System.out.println(c);

	}
}
