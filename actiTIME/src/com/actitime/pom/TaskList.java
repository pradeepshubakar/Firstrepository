package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNew;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
	private WebElement custNameTbx;
	@FindBy(xpath="//div[.='- Select Customer -'and @class='emptySelection']")
	private WebElement selectCustDropDown;
	@FindBy(xpath="//div[.='Our company'and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyOption;
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomer;
	@FindBy(xpath="//div[.='HDFC_001'and @class='title']")
	private WebElement ActTitle;
	@FindBy(xpath="//div[.='+ New Tasks']")
	private WebElement newTasks;
	
	@FindBy(xpath="//div[.='- Select Customer -'and @class='selectedItem']")
	private WebElement selectCustomer;
	@FindBy(xpath="//div[.='- New Customer -']")
	private WebElement taskNewCustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
	private WebElement taskEnterCustNameTbx;
	@FindBy(xpath="//input[@placeholder='Enter Project Name'and @class]")
	private WebElement taskEnterProjNameTbx;
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskEnterTaskNameTbx;
	@FindBy(xpath="(//button[.='set deadline'])[1]")
	private WebElement taskDeadLine;
	@FindBy(xpath="//button[@id='ext-gen126']")
	private WebElement selectMonYear;
	@FindBy(xpath="//a[.='Apr']")
	private WebElement selectMon;
	@FindBy(xpath="//a[.='2020']")
	private WebElement selectYear;
	@FindBy(xpath="//button[@id='ext-gen188']")
	private WebElement okButton;
	public void setOkButton(WebElement okButton) {
		this.okButton = okButton;
	}
	public void setSelectDate(WebElement selectDate) {
		this.selectDate = selectDate;
	}
	public void setCheckBox(WebElement checkBox) {
		this.checkBox = checkBox;
	}
	public void setCreateTask(WebElement createTask) {
		this.createTask = createTask;
	}

	@FindBy(xpath="(//span[.='30'])[2]")
	private WebElement selectDate;
	@FindBy(xpath="(//span[@class='checkmark checkMark'])[2]")
	private WebElement checkBox;
	@FindBy(xpath="//div[.='Create Tasks']")
	private WebElement createTask;
	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickfirstcheckbox() {
		checkBox.click();
	}
	public void selectMonYearBx(String month,int year) {
		this.selectMon.click();
		this.selectYear.click();
	}
	public WebElement getActTitle() {
		return ActTitle;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public void clickOnAddNew() {
		addNew.click();;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getCustNameTbx() {
		return custNameTbx;
	}

	public WebElement getSelectCustDropDown() {
		return selectCustDropDown;
	}

	public WebElement getOurCompanyOption() {
		return ourCompanyOption;
	}
	public WebElement getNewTasks() {
		return newTasks;
	}
	public void clickSelectCustomer() {
	 selectCustomer.click();
	}
	public void clickTaskNewCustomer() {
		 taskNewCustomer.click();;
	}
	public WebElement getTaskEnterCustNameTbx() {
		return taskEnterCustNameTbx;
	}
	public WebElement getTaskEnterProjNameTbx() {
		return taskEnterProjNameTbx;
	}
	public WebElement getTaskEnterTaskNameTbx() {
		return taskEnterTaskNameTbx;
	}
	public WebElement getTaskDeadLine() {
		return taskDeadLine;
	}
	public WebElement getSelectMonYear() {
		return selectMonYear;
	}
	public WebElement getSelectMon() {
		return selectMon;
	}
	public WebElement getSelectYear() {
		return selectYear;
	}
	public WebElement getOkButton() {
		return okButton;
	}
	public WebElement getSelectDate() {
		return selectDate;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getCreateTask() {
		return createTask;
	}

	
}
