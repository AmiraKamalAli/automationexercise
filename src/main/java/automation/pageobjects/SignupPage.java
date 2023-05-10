package automation.pageobjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

import automation.actiondriver.Action;
import automation.base.BaseClass;

public class SignupPage extends BaseClass {
	@FindBy(xpath = "//input[@placeholder='Name'][@data-qa='signup-name']")
	private WebElement name;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement email;

	@FindBy(xpath = "//button[contains(text(),'Signup')]")
	private WebElement submit;

	Action action = new Action();

	public SignupPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void addName(String Name) {

		action.implicitWait(getDriver(), 1000);
		action.type(name, Name);

	}

	public void addEmail(String Email) {
		// TODO Auto-generated method stub

		action.implicitWait(getDriver(), 2000);
		action.type(email, Email);

	}

	public void clickSignupButton() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1000);
		action.click(getDriver(), submit);

	}

	public void createRandomData() throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<Map<String, String>> testDataAllRow = null;
		Map<String, String> testData = null;

		testDataAllRow = new ArrayList<Map<String, String>>();
		Faker faker = new Faker();
		String Name = faker.name().fullName();
		String Email = faker.internet().emailAddress();
		String Password=faker.internet().password();
		String First_name = faker.name().firstName();
		String Last_name = faker.name().lastName();
		String Company = faker.company().name();
		String Address = faker.address().firstName();
		String Address2 = faker.address().secondaryAddress();
		String Country = faker.country().capital();
		String State = faker.address().state();
		String City = faker.address().city();
		String Zipcode = faker.address().zipCode();
		String Mobile_Number = faker.phoneNumber().cellPhone();
		//String Email = faker.internet().emailAddress();
		XSSFWorkbook workbook = new XSSFWorkbook();
		// spreadsheet object
		XSSFSheet spreadsheet = workbook.createSheet("CreatedAccount");

		// creating a row object
		XSSFRow row;

		// This data needs to be written (Object[])
		Map<String, Object[]> Accountetails = new TreeMap<String, Object[]>();
		Accountetails.put("1", new Object[] {"Testcase", "Name", "Email", "Password", "First_name","Last_name", "Company", "Address", "Address2" , "Country","State", "City", "Zipcode", "Mobile_Number"});
		Accountetails.put("2", new Object[] { "Account1",Name, Email, Password,First_name, Last_name,Company, Address,Address2, Country,State,City,Zipcode,Mobile_Number});
		Set<String> keyid = Accountetails.keySet();

		int rowid = 0;
		// writing the data into the sheets...
		for (String key : keyid) {
		row = spreadsheet.createRow(rowid++);
		Object[] objectArr = Accountetails.get(key);
		int cellid = 0;
		for (Object obj : objectArr) {
		Cell cell = row.createCell(cellid++);
		cell.setCellValue((String) obj);
		}
		}

		// .xlsx is the format for Excel Sheets...
		// writing the workbook into the file...
		FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.dir")+"\\src\\test\\Data\\CreatedAccount.xlsx"));
		try {
			workbook.write(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
