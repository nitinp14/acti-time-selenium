package com.actitime.testscript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Create Customer",true);
//		Assert.fail();
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskPage t=new TaskPage(driver);
		t.addNew();
		t.newCustom();
		t.custName();
		t.describe();
		t.selectcust();
		t.bang();
		t.createCust();
		
	}
}
