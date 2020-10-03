package com.versapay.qa.test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.versapay.qa.base.TestBase;
import com.versapay.qa.pages.FAQPage;
import com.versapay.qa.pages.HomePage;

public class FAQPageTest extends TestBase{
	HomePage hp;
	FAQPage fqa;
	
	

	@BeforeMethod
	void starUp() {
		initialisation();
		hp = new HomePage();
		fqa= new FAQPage();
	}
	
	@Test
	void verifyFQAlinks() throws InterruptedException
	{
		hp.naviagateToFAQPage();
		fqa.click_pdfDownloadLink();
		Assert.assertTrue(fqa.zone_pdfDownload().isDisplayed());
        Assert.assertTrue(fqa.lbl_pdfDownload().isDisplayed());
        fqa.click_backToFaqListing();
        Assert.assertTrue(fqa.FaqHeader().isDisplayed());
        fqa.click_addCreditCard();
        Assert.assertTrue(fqa.lbl_addCreditCard().isDisplayed());
        //Ambrish push gitbash exp
        //Ambrish push gitbash exp2
        
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}

