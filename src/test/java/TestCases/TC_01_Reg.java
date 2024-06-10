package TestCases;

import org.testng.annotations.Test;

import Hybridframework.RegPage;

public class TC_01_Reg extends Baseclass {
	@Test
	public void RegTest() {
		
		RegPage rp=new RegPage(driver);
		rp.Clickregisterbutton();
		rp.setfirstname("Harsha");
		rp.setlastname1();
		rp.setaddress();
		rp.setcityname();
		rp.setstatename();
		rp.setZipcode();
		rp.setphoneNumber();
		rp.setssn();
		rp.setusername();
		rp.setpassword();
		rp.setrepeatedPassword();
		rp.registerButton();
	}

}
