package pages;

//import PageSuites.listeners;
//import PageSuitesWork.*;
//import PageSuitesWork.LoanRequest;
//import PageSuitesWork.LogOut;
import all_pages.*;

//import TestSuitesWork.DriveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import static pages.Test.driver;

@Listeners(all_pages.listeners.class)
public class ApplicationTest extends listeners {
    @Test(priority = 1)
    public static void registration_check() throws Exception {
        login_registration_page obj = new login_registration_page(driver);
        //obj.registrationn_check();
        //obj.login();

    }

    @Test(priority = 2)
    public static void update() throws Exception {
        update_contact_info obj = new update_contact_info(driver);
        //obj.update();

    }

    @Test(priority = 3)
    public static void opening() throws Exception {
        open_new_account obj = new open_new_account (driver);

        //String str= obj.accountopening();

       //String str1 = obj.Validate_Account(str);

        transfer_fund tf = new transfer_fund(driver);
        //tf.transfer(str1);
        //obj.Transfer(str);
         accounts_overview ob =new  accounts_overview(driver);
         //ob.accounts_overview();

    }

    @Test(priority = 4)
    public static void Bill() throws Exception {
        BillPay obj = new BillPay(driver);
    }


    @Test(priority = 5)
    public static void requestloan() throws Exception {
        LoanRequest obj = new LoanRequest(driver);
    }



    @Test(priority = 6)
    public static void transfer() throws Exception {
        FindTransaction obj = new FindTransaction(driver);
    }

    @Test(priority = 7)
    public static void lgout() throws Exception {
        LogOut obj = new LogOut(driver);
    }

}




