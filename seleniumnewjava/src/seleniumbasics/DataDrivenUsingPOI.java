package seleniumbasics;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDrivenUsingPOI {
	static List<String> userNameList=new ArrayList<String>();
	static List<String> passwordList=new ArrayList<String>();



	public void readExcel() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FileInputStream excel=new FileInputStream("E:\\Testing\\TestData.xlsx");
		Workbook workbook= new XSSFWorkbook(excel);

		Sheet sheet= (Sheet)workbook.getSheetAt(0);

		Iterator<Row> rowIterator=sheet.iterator();

		while(rowIterator.hasNext()) {
			Row rowValue=rowIterator.next();

			Iterator<Cell> columnIterator=rowValue.iterator();
			int i=2;
			while(columnIterator.hasNext()) {
				if(i%2==0) {
					userNameList.add(columnIterator.next().getStringCellValue());
				}else {
					passwordList.add(columnIterator.next().getStringCellValue());
					i++;


				}

			}






		}





	}


	public static void main(String[] args) throws IOException {


		DataDrivenUsingPOI usingPOI=new DataDrivenUsingPOI();
		usingPOI.readExcel();

		System.out.println("UserNameList"+userNameList);
		System.out.println("PasswordList"+passwordList);







	}



}


