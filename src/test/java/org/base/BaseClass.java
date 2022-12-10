package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver; 
	public static JavascriptExecutor js;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		}
	public static void maximizeScreen() {
		driver.manage().window().maximize();
	}
	public static void launchurl(String url) {
		driver.get(url);
	}
	public static void browserClose() {
		driver.close();
	}
	public static void sendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void submit(WebElement element) {
		element.submit();
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static WebElement findElementBy(By by) {
		return driver.findElement(by);
	}
	public static WebElement findByName(String name)
	{
	return driver.findElement(By.name(name));
	}
	public static WebElement findElementXpath(String data) {
		return driver.findElement(By.xpath("+data+"));
	}
	public static void getAttribute(WebElement element) {
		String value=element.getAttribute("value");
		System.out.println(value);
	}
	public static void selectbyvalue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}
		public static void selectbyindex(WebElement element, int data) {
		Select s = new Select(element);
		s.selectByIndex(data);
	}
		public static void jsSetAttribute(String attrName,String attrValue,WebElement element)
		{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('"+attrName+"','"+attrValue+"')",
		element);
		}
		public static void jsGetAttribute(String attrName,WebElement element)
		{
		js=(JavascriptExecutor)driver;
		String value=(String)js.executeScript("return arguments[0].getAttribute('"+attrName+"')", element);
		System.out.println(value);
		}
		public static void sleep(int milliseconds) throws InterruptedException
		{
		Thread.sleep(milliseconds);
		}
		public static String getExcelData(int i,int j) {
			String value = null;
			try {
				File f = new File("C:\\Users\\Hp\\project-workspace\\ProjectTask\\src\\test\\resources\\Exceldata\\Book1.xlsx");
				FileInputStream fis = new FileInputStream(f);
				try {
					Workbook wb = new XSSFWorkbook(fis);
					Sheet sheet = wb.getSheet("Sheet1");
					Row row = sheet.getRow(i);
					Cell cell = row.getCell(j);
					int getcell = cell.getCellType();
					if (getcell == 1) {
						 value = cell.getStringCellValue();
						//String value = cell.getStringCellValue();
						System.out.println(value);
					} else if (getcell == 0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
							value = sm.format(dateCellValue);
							//String format = sm.format(dateCellValue);
							System.out.println(value);
						} else {
							double numericCellValue = cell.getNumericCellValue();
							long l = (long) numericCellValue;
							value= String.valueOf(l);
							//String valueOf = String.valueOf(l);
							System.out.println(value);
						}
					}

				} catch (IOException e) {
				}
			} catch (FileNotFoundException e) {

			}
			return value;
		}

		public static void main(String[] args) {
			getExcelData(0,1);
		}


	}

