package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import controller.Select_Stress;
import model.User;
import validation.EmailValidation;

public class UserOperations {

//Insert user details
	@SuppressWarnings({ "resource" })
	public void signUp() throws IOException {
		List<User> list = new ArrayList<User>();
		System.out.println("\tEnter Your Details ");
		System.out.print("Name :\n ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("Mobile Number :\n ");
		Scanner sc1 = new Scanner(System.in);
		String mobileNo = sc1.nextLine();
	//email validation
		EmailValidation emailValidation = new EmailValidation();
		String email = emailValidation.Email();
		System.out.print("Password :\n ");
		Scanner sc3 = new Scanner(System.in);
		String password = sc3.nextLine();
		User user = new User(name , mobileNo , email , password);
		list.add(user);
		File myFile = new File("F:\ssignup.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook= new XSSFWorkbook(fis);
		XSSFSheet sheet=myWorkBook.getSheetAt(0);
		int rownum= sheet.getLastRowNum();
		for(User user1 : list ) {
			Row row = sheet.createRow(++rownum);
			createList(user1 , row);
		}
		FileOutputStream fos=new FileOutputStream(myFile);
		myWorkBook.write(fos);
	}	
	private void createList(User user1, Row row) {
		Cell cell = row.createCell(0);
		cell.setCellValue(user1.getName());
		cell = row.createCell(1);
		cell.setCellValue(user1.getMobileNo());
		cell = row.createCell(2);
		cell.setCellValue(user1.getEmail());
		cell = row.createCell(3);
		cell.setCellValue(user1.getPassword());
	}	

//login credentials
	@SuppressWarnings("resource")
	public void login() throws IOException {
		Select_Stress ss = new Select_Stress();
		System.out.println("\tEnter Your Details ");
		System.out.print("User Id : ");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		System.out.print("Password : ");
		Scanner sc1 = new Scanner(System.in);
		String password = sc1.nextLine();
		File myFile = new File("F:\ssignup.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		XSSFSheet sheet = myWorkBook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		int count = 0;
		while (rowIterator.hasNext())
		{
			Row row = rowIterator.next();
			Cell cell1 = row.getCell(2);
			Cell cell2 = row.getCell(3);
			String value1 = cell1.getStringCellValue();
			String value2 = cell2.getStringCellValue();			
			if(value1.equals(email) && value2.equals(password)) {					
				count +=1;			
			}
		}
		if(count > 0) {
			System.out.println("\t\tLogin Successful");
			ss.choice_of_stress();	
		}
		else {
			System.out.println("\t Check Your UserId and Password");
			System.out.println("\n");
		}	
	}
		
//Display user details
	public void userdetails() throws IOException {
		File myFile = new File("F:\ssignup.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		XSSFSheet sheet = myWorkBook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext())
		{
			Row row = rowIterator.next();
			Cell cell1 = row.getCell(0);
			Cell cell2 = row.getCell(2);
			System.out.print(" "+ cell1.getStringCellValue()+ "\t\t");
			System.out.print("\t"+ cell2.getStringCellValue()+"\t");
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
//Deletion of user details
	@SuppressWarnings("resource")
	public void removedetails() throws IOException {
		System.out.print(" Enter UserId to Remove : ");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		File myFile = new File("F:\ssignup.xlsx");
		FileOutputStream out;
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		XSSFSheet sheet = myWorkBook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		for(int i=0;i<=rowNum;i++) {
			Row row = sheet.getRow(i);
			String value = row.getCell(2).getStringCellValue();
			if(value.equals(email)) {
				sheet.removeRow(row);
				System.out.println("\t  Successfully Deleted");
				break;
			}
		}
		out = new FileOutputStream(myFile);
		myWorkBook.write(out);
		out.close();
	}
}