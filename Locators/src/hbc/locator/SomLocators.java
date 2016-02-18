package hbc.locator;

public class SomLocators {
	
	/* Log in Page */
	PageElement USER_NAME=new PageElement("//input[@id='idx_form_TextBox_0']", "SOM username");
	PageElement PASSWORD=new PageElement("//input[@id='loginPassword']", "SOM password");
	PageElement LOGIN=new PageElement("//span[@id='dijit_form_Button_0_label']", "SOM button to login");
	
	/* 
	 * Home Page
	 * Pickup search tab */
	PageElement PHONE_NUMBER=new PageElement("//input[@id='idx_form_TextBox_0']", "SOM customer phonenumber");
	PageElement ORDER_NUMBER=new PageElement("//input[@id='idx_form_TextBox_4']", "SOM order number");
	PageElement FIRST_NAME=new PageElement("//input[@id='idx_form_TextBox_2']", "SOM customer first name");
	PageElement LAST_NAME=new PageElement("//input[@id='idx_form_TextBox_3']", "SOM customer last name");
	PageElement EMAIL=new PageElement("//input[@id='idx_form_TextBox_1']", "SOM customer email address");
	PageElement FIND_PICKUP=new PageElement("//span[@id='dijit_form_Button_0_label']", "SOM button to search pick up orders");
	PageElement ADVANCED_SEARCH=new PageElement("//a[@class='idxLinkDerived idxLink' and contains(.,'Advanced Search')]", "advanced search link");
	
	/* 
	 * Home Page
	 * Backroom pick tab */
	PageElement ORDERS_READY_FOR_PICK=new PageElement("//input[@id='idx_form_NumberTextBox_0']", "Orders ready to be picked stat");
	PageElement REFRESH=new PageElement("//a[@class='idxLinkDerived idxLink idxLinkHover dijitHover' and contains(.,'Refresh')]", "Refresh button");
	
	/*Advanced Search page*/
	PageElement BACKROOM_PICK_READY=new PageElement("//input[@id='idx_form_CheckBoxList_0_CheckItem0']", "SOM backroom pick check-box");
	PageElement CUSTOMER_PICK_READY=new PageElement("idx_form_CheckBoxList_0_CheckItem2", "SOM 'ready for customer pickup' check-box");
	PageElement CUSTOMER_PICKED=new PageElement("//input[@id='idx_form_CheckBoxList_0_CheckItem3']", "SOM  'picked up by customer' check-box");
	PageElement PICKS_IN_PROGRESS=new PageElement("//input[@id='idx_form_CheckBoxList_0_CheckItem1']", "SOM 'picks in progress' check-box");
	PageElement ADVANCED_ORDER_NO=new PageElement("//input[@id='idx_form_TextBox_7']", "SOM pickup order number field");
	PageElement INCLUDE_OTHER_STORE_ORDERS=new PageElement("//input[@id='idx_form_CheckBox_0']", "SOM 'include orders being picked up' check-box");
	PageElement ORDER_BY=new PageElement("//input[@id='idx_form_FilteringSelect_0']", "SOM order by drop down");
	PageElement PICKUP_RECIPIENT=new PageElement("//input[@id='idx_form_CheckBox_1']", "SOM customer 'is pickup recipient' check-box");
	PageElement CUST_PHONE_NO=new PageElement("//input[@id='idx_form_TextBox_12']", "SOM customer phone number input ");
	PageElement CUST_EMAIL=new PageElement("//input[@id='idx_form_TextBox_13']", "SOM customer email input");
	PageElement CUST_FIRST_NAME=new PageElement("//input[@id='idx_form_TextBox_14']", "SOM customer first name input");
	PageElement CUST_LAST_NAME=new PageElement("idx_form_TextBox_15", "SOM customer last name input");
	PageElement SEARCH=new PageElement("//span[@id='dijit_form_Button_5_label']", "SOM advanced search button");
	
	/*Pick up order summary page*/
	PageElement PRINT_PICK_TICKET=new PageElement("(//a[text()='Print Pick Ticket'])[2]", "print pick ticket link");
	PageElement START_CUSTOMER_PICK=new PageElement("//a[text()='Start Customer Pick']", "start customer pick link");
	PageElement RECORD_BACKROOM_PICK=new PageElement("//a[text()='Record Backroom Pick']", "Record backroom Pick link");
	PageElement PRINT_RECEIPT=new PageElement("//a[text()='Print Receipt']", "Print receip link");
	

}
