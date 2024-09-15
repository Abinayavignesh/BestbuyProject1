package Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Pageobject.Homepage;
import Pageobject.Locatepage;
import Pageobject.Signinpage;


public class Tc_04_Siginpage extends Baseclass{
	
	@BeforeTest
	public void setup() {
		sheetname="SigninData";
	}
	
	@Test(dataProvider="Testdata", priority=4)
	public void SignIn(String email,String password) throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Thread.sleep(2000);
		Homepage hp=new Homepage(driver);
		hp.goToSignIn();
		Signinpage sp=new Signinpage(driver);
		sp.signin(email,password);
		
	}

}
