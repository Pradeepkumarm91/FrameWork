package org.cts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {
	public static void main(String[] args) throws IOException {
		// 1.Mention the file Location
		File f = new File(
				"C:\\Users\\Nandhini\\eclipse-workspace\\MavenProject\\src\\test\\resources\\TestData\\sampleexcel.xlsx");

		// 2.Create a new file
		boolean create = f.createNewFile();
		System.out.println(create);

		// 3.Type of workbook
		Workbook w = new XSSFWorkbook();

		// 4.Create the sheet
		Sheet s = w.createSheet("Infosys");

		// 5.Create the row
		Row row = s.createRow(0);

		// 6.Create the cell
		Cell cell = row.createCell(0);

		// 7.Set the value
		cell.setCellValue("Selenium");

		// 8.Update the file
		FileOutputStream fout = new FileOutputStream(f);

		// 9.Write the Changes
		w.write(fout);

		System.out.println("Success");

	}
}
