package com.actitime.testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass {

	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("create project",true);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		
		FileLib f=new FileLib();
		String projectName = f.getExcelData("createcustomer", 4, 4);
		String projectDesc = f.getExcelData("createcustomer", 4, 5);
		
		TaskPage t=new TaskPage(driver);
		t.addNew();
		t.getNewProject().click();
		t.getEnterProjectName().sendKeys(projectName);
		t.getProjectDesc().sendKeys(projectDesc);
		t.getSelectCustomDD().click();
		t.getOurCompany().click();
		t.getCreateProject().click();
		
		System.out.println(projectName);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(t.getProjectTitle()));
		Thread.sleep(5000);
		String title = t.getProjectTitle().getText();
		System.out.println(title);
		AssertJUnit.assertEquals(projectName,title);
		
	}
}
