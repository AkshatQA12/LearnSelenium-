package pageobjects;

import org.openqa.selenium.By;

public class ElementsOR {
	// containing elements of text box
	public static final By TXT_FNAME = By.id("userName");
	public static final By TXT_EMAIL = By.id("userEmail");
	public static final By TXT_CADD = By.id("currentAddress");
	public static final By TXT_PADD = By.id("permanentAddress");
	// containing elements of check box
	public static final By CHK_HOME = By.className("rct-checkbox");
	// containing elements of radio button
	public static final By RDIO_YS = By.id("yesRadio");
	public static final By RDIO_IMP = By.id("impressiveRadio");
	// containing elements of web table
	public static final By WEB_ADD = By.id("addNewRecordButton");
	// add containing register form
	public static final By WEB_RGF_FNAME = By.id("firstName");
	public static final By WEB_RGF_LNAME = By.id("lastName");
	public static final By WEB_RGF_EMAIL = By.id("userEmail");
	public static final By WEB_RGF_AGE = By.id("age");
	public static final By WEB_RGF_SALARY = By.id("salary");
	public static final By WEB_RGF_DEP = By.id("department");
	// editing register form
	public static final By WEB_RGF_EDITBTN = By.id("edit-record-1");
	// delete the existing web table
	public static final By WEB_RGF_DELBTN = By.id("delete-record-1");
	// search the web table
	public static final By WEB_REG_SRCH = By.id("searchBox");
	// containing elements of button
	public static final By BTN_DBLCLK = By.id("doubleClickBtn");
	public static final By BTN_RGTCLK = By.id("rightClickBtn");
	public static final By BTN_CLK = By.id("");// dynamic id

}
