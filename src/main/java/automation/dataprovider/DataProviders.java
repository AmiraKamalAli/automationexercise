package automation.dataprovider;

import java.io.File;
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
import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import automation.utility.ExcelUtility;

public class DataProviders {

		@DataProvider(name = "Account")
	public Object[][] getdataweb() throws IOException {

		List<Map<String, String>> testDataInMap =ExcelUtility.getMapTestDataInMap();

		Object[][] data = new Object[1][13];

		String Name = testDataInMap.get(0).get("First_name");
		String Email = testDataInMap.get(0).get("Email");
		String Password = testDataInMap.get(0).get("Password");
		String First_name = testDataInMap.get(0).get("First_name");
		String Last_name = testDataInMap.get(0).get("Last_name");
		String Company = testDataInMap.get(0).get("Company");
		String Address = testDataInMap.get(0).get("Address");
		String Address2 = testDataInMap.get(0).get("Address2");
		String Country = testDataInMap.get(0).get("Country");
		String State = testDataInMap.get(0).get("State");
		String City = testDataInMap.get(0).get("City");
		String Zipcode = testDataInMap.get(0).get("Zipcode");
		String Mobile_Number = testDataInMap.get(0).get("Mobile_Number");

		data[0][0] = Name;
		data[0][1] = Email;
		data[0][2] = Password;
		data[0][3] = First_name;
		data[0][4] = Last_name;
		data[0][5] = Company;
		data[0][6] = Address;
		data[0][7] = Address2;
		data[0][8] = Country;
		data[0][9] = State;
		data[0][10] = City;
		data[0][11] = Zipcode;
		data[0][12] = Mobile_Number;

		return data;
	}
	
}
