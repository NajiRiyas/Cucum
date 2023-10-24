package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Description:BaseClass1
 * Author:Najimunisa Begum
 * Date: 21-08-2022
 */
public class BaseClass1 {

	public static WebDriver driver;
	public static WebElement findElement;

	/**
	 * Description:getdriver
	 * Author:Najimunisa Begum
	 * Date: 21-08-2022
	 */
	public static void getdriver() { //1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	/**
	 * Description:launchurl
	 * Author:Najimunisa Begum
	 * Date: 21-08-2022
	 * @param URL
	 */
	public void launchurl(String URL) { //2
		driver.get(URL);
	}
	/**
	 * Description: findelementbyid	
	 * Author:Najimunisa Begum
	 * Date: 21-08-2022
	 * @param id
	 * @return
	 */
	public WebElement findelementbyid(String id) {//3
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	/**
	 * Description:findelememtbyname
	 * Author:Najimunisa Begum
	 * Date: 21-08-2022
	 * @param Name
	 * @return
	 */
	public WebElement findelememtbyname(String Name) { // 4
		WebElement findElement = driver.findElement(By.xpath(Name));
		return findElement;
	}
	public void textsendkeys(WebElement findelement, String sendvalues) {//5
		findelement.sendKeys(sendvalues);
	}
	public void buttonclick (WebElement element ) { //6
		element.click();
	}
	public String gettittle() {//7
		String title = driver.getTitle();
		return title;
	}

	public String getAttributeValue(WebElement element, String AttributeName) {

		String attribute = element.getAttribute(AttributeName);
		return attribute;
	}
	public String getAttributeValue(WebElement element) {

		String attribute = element.getAttribute("value");
		return attribute;
	}
	public String getText(WebElement findElement) {//8
		String text = findElement.getText();
		return text;
	}
	public WebElement findelementbytagname(String attributesvalues) { //9
		findElement = driver.findElement(By.tagName(attributesvalues));
		return findElement;
	}
	public WebElement linkedTextString(String value) { //10
		findElement = driver.findElement(By.linkText(value));
		return findElement;
	}
	public WebElement partialLinkedText(String value) { //11
		findElement = driver.findElement(By.partialLinkText(value));
		return findElement;
	}
	public void moveToElement(WebElement element) { //12
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public void contextclick(WebElement element) { //13
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}
	public void DoubleClick(WebElement element) { //14
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
	public void DragandDrop(WebElement element) { //15
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element, element).perform();
	}
	public void navigateStringUrl(String URL) { //16
		driver.navigate().to(URL);
	}
	public void backward() { //17
		driver.navigate().back();
	}
	public void forward() { //18
		driver.navigate().forward();
	}
	public void Refresh() { // 19
		driver.navigate().refresh();
	}
	public boolean isEnable(WebElement element) { //20
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public boolean isDisplayed(WebElement element) { //21
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public boolean isSelected(WebElement element) { //22
		boolean selected = element.isSelected();
		return selected;
	}
	public void Quit() { //24
		driver.quit();
	}
	public void Close() { //25
		driver.close();
	}
	public void keyPress() throws AWTException { //26
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
	}
	public WebElement nameValue(String name) { //27
		findElement = driver.findElement(By.name(name));
		return findElement;
	}
	public void screenShot(String ScreenName) throws IOException { //28
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\HP"+ScreenName+".jpeg");
		FileUtils.copyFile(Source, target);
	}
	public Dimension Dimentionsize(WebElement element) { //29
		Dimension size = element.getSize();
		return size;
	}
	public String getWindowHandle() { //30
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public Set<String> getWindowHandles() { //31
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public void typejs(String data, WebElement Element) { //32
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','textdata')",Element);
	}
	public void txtclear(WebElement element) { //33
		
		element.clear();
	}
	public Alert switchToAlert() { //34
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	/*	public void acceptAlert(Alert alert) { //35
		alert.accept();
	}*/

	public void confirmAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void dismis(Alert alert) {//36
		alert.dismiss();
	}
	public String getCurrentURL() {//37
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static void SelectOptionsByText(WebElement element , String text) {//38
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static  void SelectOptionsByAttributes(WebElement element , String value) {//39
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static void SelectOptionsByIndexNo(WebElement element,int Indextno) {//40
		Select s = new Select(element);
		s.selectByIndex(Indextno);
	}
	public void deselectByIndexNo(WebElement element,int DeselectIndextno) {//41
		Select s = new Select(element);
		s.deselectByIndex(DeselectIndextno);
	}
	public void deselectByValue(WebElement element, String value) {//42
		Select s = new Select(element);
		s.deselectByValue(value);
	}
	public void deselectbytext(WebElement element , String text) {//43
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}
	public List<WebElement> getOption(WebElement element) {//44
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}
	public WebElement getFirstSelectOption(WebElement element) {//45
		Select s = new Select(element);
		WebElement firstselectedOption = s.getFirstSelectedOption();
		return firstselectedOption;
	}
	public List<WebElement> getAllSelectedOptions(WebElement element) {//46
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}
//Read Data
	/*	String res=null;
	public String getData(String sheetname,int rownum,int cellnum) throws IOException {

		File file =new File("C:\\Users\\elcot\\eclipse-workspace\\FrameworkMaven\\excel\\omrbranchbn.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type=cell.getCellType();

		switch (type) {

		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:

			if(DateUtil.isCellDateFormatted(cell)) {

				Date dateValue = cell.getDateCellValue();
				SimpleDateFormat simpleformat=new SimpleDateFormat("dd/MM/yyyy");
				res = simpleformat.format(dateValue);
			}

			else {
				double cellValue = cell.getNumericCellValue();
				BigDecimal decimal=BigDecimal.valueOf(cellValue);
				res = decimal.toString();

			}
			break;
		default:
			break;
		}

		return res;

	}*/


	/*	// Update data
	public void modifyData(String sheetname,int rownum,int cellnum,String olddata,String newdata) throws IOException {

		File file =new File("C:\\Users\\elcot\\eclipse-workspace\\FrameworkMaven\\excel\\omrbranchbn.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);

		String Value = cell.getStringCellValue();
		if(Value.equals(olddata)) {

			cell.setCellValue(newdata);


		}
		FileOutputStream output=new FileOutputStream(file);
		workbook.write(output);


	}*/

	// Write Data in Excel value in cell

	public void insertValueInCell(String sheetname,int rownum,int cellnum,String data) throws IOException {

		File file =new File("C:\\Users\\elcot\\eclipse-workspace\\FrameworkMaven\\excel\\omrbranchbn.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell = (Cell) row.createCell(cellnum);

		((org.apache.poi.ss.usermodel.Cell) cell).setCellValue(data);

		FileOutputStream output=new FileOutputStream(file);
		workbook.write(output);


	}    
	/*	public void getinsertValueInCell(WebElement element,String sheetname,int rownum,int cellnum) throws IOException {

		File file =new File("C:\\Users\\elcot\\eclipse-workspace\\FrameworkMaven\\excel\\omrbranchbn.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		String value = element.getAttribute("value");
		cell.setCellValue(value);



		FileOutputStream output=new FileOutputStream(file);
		workbook.write(output);


	}
	public void getScreenShot(String filename) throws IOException {
		TakesScreenshot sc=(TakesScreenshot) driver;
		File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		File file=new File(filename);
		FileHandler.copy(screenshotAs, file);
	}*/



	public void tabKeyPress() throws AWTException {
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

	}


	// To get the locators like id, Xpath, name, tagname
	public static WebElement locators(String attributename, String attributevalue) {

		if (attributename.equals("id")) {
			findElement = driver.findElement(By.id(attributevalue));
		} else if (attributename.equals("name")) {
			findElement = driver.findElement(By.name(attributevalue));
		} else if (attributename.equals("xpath")) {
			findElement = driver.findElement(By.xpath(attributevalue));
		} else if (attributename.equals("tagname")) {
			findElement = driver.findElement(By.tagName(attributevalue));
		}
		return findElement;

	}

	// to enter values to sendkeys
	public static void textSend(WebElement findElement, String sendvalues) {

		findElement.sendKeys(sendvalues);
	}



	// to quit the program
	public void quit() {
		driver.quit();
	}

	// To perform ScreenShot
	public void ScreenShot(String pathname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(pathname);
		FileUtils.copyFile(screenshotAs, f);
	}

	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		properties.load(new FileInputStream("C:\\Users\\user\\eclipse-workspace\\OMRBranchAdactinAutomation\\Config\\config.properties"));
		String value = (String) properties.get(key);
		return value;
	}

	public static WebDriver getDriver(String browserType) {

		switch (browserType) {
		case "chromeBrowser":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		case "firefor":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;
		case "ie":

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

			break;
		case "edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			break;



		default:
			break;
		}
		return driver;
	}


	public static void maximize() {
		driver.manage().window().maximize();

	}
}




