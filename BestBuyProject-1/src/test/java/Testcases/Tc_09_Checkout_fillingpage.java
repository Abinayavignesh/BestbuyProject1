package Testcases;

import org.testng.annotations.Test;

import Base.Baseclass;
import Pageobject.Cartpage;
import Pageobject.CheckOutpage;
import Pageobject.Homepage;
import Pageobject.Locatepage;
import Pageobject.Productpage;


public class Tc_09_Checkout_fillingpage extends Baseclass{
	
	@Test(priority=10)
	public void CheckOutPageFillingas_using_guest() throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Homepage hp=new Homepage(driver);
		hp.searchProduct("Mouse");
		Thread.sleep(6000);
		Productpage pp = new Productpage(driver);		
		pp.addLogitechMouse();
		Thread.sleep(3000);
		Cartpage cp=new Cartpage(driver);
		cp.goToCheckOutPage();
		CheckOutpage cop=new CheckOutpage(driver);
		cop.contactInfoAtCheckOut("dummytesting23541@gmail.com", "8965847854");
		Thread.sleep(3000);
		//For the Dummy payment details
		//I'm not using this line no-32,because of im using dummy id its required password to further process of page.
		//cop.enterDetailsOnCheckOut("374245455400127", "03", "2026", "0000", "Testing", "Test", "2 1 Dallas Ct", "Angleton", "TX", "77515");
		
	}
	
}
