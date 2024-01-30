package com.actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.FileLib;

public class TaskPage {
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath ="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custNameBtn;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descBtn;
	
	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustDD;
	
	@FindBy(xpath = "//div[@class='searchItemList']//div[text()='Big Bang Company']")
	private WebElement bigBang;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjectName;
	
	@FindBy(xpath="//div[text()=\"-- Please Select Customer to Add Project for  --\"]")
	private WebElement selectCustomDD;
	
	@FindBy(xpath = "//div[@class=\"itemRow cpItemRow \"and text()=\"Our company\"]")
	private WebElement ourCompany;
	
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDesc;
	
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProject;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer' ]/div[@class='title']")
	private WebElement projectTitle;
	
	public WebElement getProjectTitle() {
		return projectTitle;
	}

	public void setNewProject(WebElement newProject) {
		this.newProject = newProject;
	}

	public void setEnterProjectName(WebElement enterProjectName) {
		this.enterProjectName = enterProjectName;
	}

	public void setSelectCustomDD(WebElement selectCustomDD) {
		this.selectCustomDD = selectCustomDD;
	}

	public void setOurCompany(WebElement ourCompany) {
		this.ourCompany = ourCompany;
	}

	public void setProjectDesc(WebElement projectDesc) {
		this.projectDesc = projectDesc;
	}

	public WebElement getCreateProject() {
		return createProject;
	}

	public void setCreateProject(WebElement createProject) {
		this.createProject = createProject;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustNameBtn() {
		return custNameBtn;
	}

	public WebElement getDescBtn() {
		return descBtn;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getBigBang() {
		return bigBang;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getEnterProjectName() {
		return enterProjectName;
	}

	public WebElement getSelectCustomDD() {
		return selectCustomDD;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getProjectDesc() {
		return projectDesc;
	}

	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void addNew() {
		addNewBtn.click();
	}
	public void newCustom()
	{
		newCustomerBtn.click();
	}
	public void custName() throws EncryptedDocumentException, IOException 
	{
		FileLib f=new FileLib();
		String d = f.getExcelData("createcustomer", 1, 4);
		
		custNameBtn.sendKeys(d);
	}
	public void describe() throws EncryptedDocumentException, IOException 
	{
		FileLib f=new FileLib();
		String data = f.getExcelData("createcustomer", 1, 5);
		
		descBtn.sendKeys(data);
	}
	public void selectcust()
	{
		selectCustDD.click();
	}
	public void bang() {
		bigBang.click();
	}
	public void createCust()
	{
		createCustomer.click();
	
	}
}
