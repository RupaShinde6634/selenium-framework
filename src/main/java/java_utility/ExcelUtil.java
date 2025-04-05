package java_utility;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	// 👇 Read data from a specific cell
	public static String readCell(String filePath, String sheetName, int rowNum, int colNum) {
		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(colNum);

			return cell.toString();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 👇 Write data to a specific cell
	public static void writeCell(String filePath, String sheetName, int rowNum, int colNum, String value) {
		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheet(sheetName);
			if (sheet == null) {
				sheet = workbook.createSheet(sheetName);
			}

			Row row = sheet.getRow(rowNum);
			if (row == null) {
				row = sheet.createRow(rowNum);
			}

			Cell cell = row.createCell(colNum);
			cell.setCellValue(value);

			fis.close(); // Close input stream before writing

			try (FileOutputStream fos = new FileOutputStream(filePath)) {
				workbook.write(fos);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
