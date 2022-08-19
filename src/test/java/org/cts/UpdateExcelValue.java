package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcelValue {
	public static void main(String[] args) throws IOException {
		// 1.Mention the file Location
		File f = new File(
				"C:\\Users\\Nandhini\\eclipse-workspace\\MavenProject\\src\\test\\resources\\TestData\\sampleexcel.xlsx");

		// 2.Read the value
		FileInputStream fin = new FileInputStream(f);

		// 3.Type of workbook
		Workbook w = new XSSFWorkbook(fin);

		// 4.Get the sheet
		Sheet s = w.getSheet("greens");

		// 5. Get the row
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row row = s.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				int cellType = cell.getCellType();
				if (cellType == 1) {
					String value = cell.getStringCellValue();
					if (value.equals("Kumar")) {
						cell.setCellValue("Kevin");
						FileOutputStream fout = new FileOutputStream(f);
						w.write(fout);
						System.out.println("Success");

					}
				}

			}

		}

	}
}
