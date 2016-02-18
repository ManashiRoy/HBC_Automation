package hbc.locator;

public class ComLocators {
	
	/*Home Page*/
	PageElement SEARCH_PRODUCT=new PageElement("//input[@id='dijit_form_TextBox_0']", "Product search input at the top right");
	PageElement MAGNIFIER=new PageElement("//span[@class='dijitReset dijitInline dijitIcon idxHeaderSearchButton']", "Magnifier search icon at top right");
	PageElement USER_NAME_DROP_DOWN=new PageElement("(//span[@class='idxHeaderDropDownArrow'])[2]", "drop down on the right side of the user name");
	PageElement LOGOUT=new PageElement("//td[@id='dijit_MenuItem_2_text']", "Logout option top right corner");
	
	/*Home Page
	 * Related Task tab
	 */
	PageElement RETURN_SEARCH=new PageElement("//a[text()='Return Search']", "Return search link under related task tab");
	PageElement CUSTOMER_SEARCH=new PageElement("//a[text()='Customer Search']", "Customer search link");
	PageElement CREATE_CONSUMER=new PageElement("(//a[text()='Create Consumer'])[1]", "Create consumer link");
	PageElement ORDER_SEARCH=new PageElement("(//a[text()='Order Search'])[1]", "Order search link");
	
	/*Order Search page*/
	PageElement ORDER_SEARCH_EMAIL=new PageElement("//input[@id='idx_form_TextBox_13']", "Order search email");
	PageElement ORDER_SEARCH_SUBMIT=new PageElement("//span[@id='dijit_form_Button_19']", "Order search button");
	PageElement ORDER_SEARCH_NEXT=new PageElement("//span[@id='dijit_form_Button_38']", "next button");
	
	/*Create Consumer Pop up*/
	PageElement CONSUMER_ENTERPRISE=new PageElement("//input[@id='idx_form_FilteringSelect_61']", "Consumer enterprise dropdown input inside pop up");
	
	/* Create consumer page
	 * Contact information tab
	 */
	PageElement CONSUMER_FIRSTNAME=new PageElement("//input[@id='idx_form_TextBox_112']", "First name input");
	PageElement CONSUMER_MIDDLENAME=new PageElement("//input[@id='idx_form_TextBox_113']", "Middle name input");
	PageElement CONSUMER_LASTNAME=new PageElement("//input[@id='idx_form_TextBox_114']", "last name input");
	PageElement CONSUMER_TITLE=new PageElement("//input[@id='idx_form_FilteringSelect_62']", "title input");
	PageElement CONSUMER_JOBTITLE=new PageElement("//input[@id='idx_form_TextBox_115']", "jobtitle input");
	PageElement CONSUMER_DEPARTMENT=new PageElement("//input[@id='idx_form_TextBox_116']", "department input");
	PageElement CONSUMER_STATUS=new PageElement("//input[@id='idx_form_FilteringSelect_63']", "status input");
	PageElement CONSUMER_EMAIL=new PageElement("//input[@id='idx_form_TextBox_117", "email input");
	PageElement CONSUMER_MOBILE=new PageElement("//input[@id='idx_form_TextBox_118']", "mobile phone input");
	PageElement CONSUMER_TELEPHONE=new PageElement("//input[@id='idx_form_TextBox_119']", "telephone input");
	PageElement CONSUMER_EVENING_PHONE=new PageElement("//input[@id='idx_form_TextBox_120", "evening phone input");
	PageElement CONSUMER_DAY_FAX=new PageElement("//input[@id='idx_form_TextBox_121']", "consumer day fax input");
	PageElement CONSUMER_EVENING_FAX=new PageElement("//input[@id='idx_form_TextBox_122']", "consumer evening fax input");
	PageElement CONSUMER_LANGUAGE=new PageElement("//input[@id='idx_form_FilteringSelect_64']", "consumer language dropdown input");
	
	/*Create consumer page
	 * ship to tab
	 */
	PageElement SHIP_TO_ADD=new PageElement("(//a[text()='Add'])[1]", "consumer ship to details add link");
	
	/*Create consumer page
	 * ship to tab
	 * ship to pop up
	 */
	PageElement CONSUMER_REGION=new PageElement("//input[@id='idx_form_FilteringSelect_73']", "consumer country/region dropdown input");
	PageElement CONSUMER_ADDRESS_LINE1=new PageElement("//input[@id='idx_form_TextBox_154']", "consumer address line 1 input");
	PageElement CONSUMER_ADDRESS_LINE2=new PageElement("//input[@id='idx_form_TextBox_155']", "consumer address line 1 input");
	PageElement CONSUMER_CITY=new PageElement("//input[@id='idx_form_TextBox_156']", "consumer city input");
	PageElement CONSUMER_STATE=new PageElement("//input[@id='idx_form_FilteringSelect_75']", "consumer state input");
	PageElement CONSUMER_POSTAL_CODE=new PageElement("//input[@id='idx_form_TextBox_158']", "consumer postal code input");
	PageElement CONSUMER_ADDRESS_DESCRIPTION=new PageElement("//input[@id='idx_form_TextBox_159']", "consumer address description input");
	PageElement CONSUMER_ADDRESS_APPLY=new PageElement("//span[@id='dijit_form_Button_127_label']", "consumer apply button");
	
	/* Create consumer page
	 * Demographics tab
	 */
	PageElement CONSUMER_DOB=new PageElement("//input[@id='idx_form_DateTextBox_15']", "consumer date of birth input");
	PageElement CONSUMER_WEDDING_ANNIVERSERY=new PageElement("//input[@id='idx_form_DateTextBox_17']", "consumer wedding anniversery input");
	PageElement CONSUMER_SPOUSE_DOB=new PageElement("//input[@id='idx_form_DateTextBox_16']", "consumer's spouse date of birth input");
	
	/*Consumer creation successful page
	 * Related task tab
	 */
	PageElement MANAGE_CONSUMER=new PageElement("(//a[text()='Manage Consumer'])[2]", "Manage consumer link");
	
	/*Manage consumer page*/
	PageElement MANAGE_CONSUMER_CONFIRM=new PageElement("//span[@id='dijit_form_Button_145_label']", "consumer manage confirm button");
	
	/*Manage consumer page
	 * Addreses tab
	 */
	PageElement CONSUMER_CREATE_ADDRESS=new PageElement("//span[@id='dijit_form_Button_150_label']", "consumer apply button");
	PageElement CONSUMER_MAKE_DEFAULT_BILL=new PageElement("(//a[text()='Make Default Bill to'])[5]", "make default bill to link");
	PageElement CONSUMER_MAKE_DEFAULT_SHIP=new PageElement("(//a[text()='Make Default Ship to'])[5]", "make default ship to link");
	
	/*Manage consumer page
	 * Addreses tab
	 * pop up
	 */
	PageElement MANAGE_CONSUMER_REGION=new PageElement("//input[@id='idx_form_FilteringSelect_90']", "consumer country/region dropdown input");
	PageElement MANAGE_CONSUMER_ADDRESS_LINE1=new PageElement("//input[@id='idx_form_TextBox_191']", "consumer address line 1 input");
	PageElement MANAGE_CONSUMER_ADDRESS_LINE2=new PageElement("//input[@id='idx_form_TextBox_192']", "consumer address line 1 input");
	PageElement MANAGE_CONSUMER_CITY=new PageElement("//input[@id='idx_form_TextBox_193']", "consumer city input");
	PageElement MANAGE_CONSUMER_STATE=new PageElement("//input[@id='idx_form_TextBox_194']", "consumer state input");
	PageElement MANAGE_CONSUMER_POSTAL_CODE=new PageElement("//input[@id='idx_form_TextBox_195']", "consumer postal code input");
	PageElement MANAGE_CONSUMER_ADDRESS_DESCRIPTION=new PageElement("//input[@id='idx_form_TextBox_196']", "consumer address description input");
	PageElement MANAGE_CONSUMER_FIRSTNAME=new PageElement("//input[@id='idx_form_TextBox_185']", "consumer first name input");
	PageElement MANAGE_CONSUMER_LASTNAME=new PageElement("//input[@id='idx_form_TextBox_186']", "consumer last name input");
	PageElement MANAGE_CONSUMER_TITLE=new PageElement("//input[@id='idx_form_FilteringSelect_91']", "consumer title input");
	PageElement MANAGE_CONSUMER_EMAIL=new PageElement("//input[@id='idx_form_TextBox_188']", "consumer email input");
	PageElement MANAGE_CONSUMER_TELEPHONE=new PageElement("//input[@id='idx_form_TextBox_189']", "consumer telephone input");
	PageElement MANAGE_CONSUMER_EVENING_PHONE=new PageElement("//input[@id='idx_form_TextBox_190']", "consumer evening phone input");
	PageElement MANAGE_CONSUMER_ADDRESS_APPLY=new PageElement("//span[@id='dijit_form_Button_154_label']", "consumer apply button");
	
	
	/*Home Page
	 * Customer tab
	 */
	PageElement ENTERPRISE=new PageElement("//input[@id='idx_form_FilteringSelect_0']", "Enterprise dropdown input");
	PageElement PHONE_NUMBER=new PageElement("//input[@id='idx_form_TextBox_4']", "phone number input under customer tab");
	PageElement EMAIL=new PageElement("//input[@id='idx_form_TextBox_5']", "email input under customer tab");
	PageElement FIND_CUSTOMER=new PageElement("//span[@id='dijit_form_Button_2_label']", "find customer button");
	
	/*Home Page
	 * Product tab
	 */
	PageElement PRODUCT_ENTERPRISE=new PageElement("//input[@id='idx_form_FilteringSelect_1']", "Enterprise dropdown under product tab");
	PageElement PRODUCT_KEYWORD=new PageElement("idx_form_TextBox_9", "Keyword input");
	PageElement FIND_PRODUCT=new PageElement("//span[@id='dijit_form_Button_4_label']", "Find product button");
	
	
	/*Customer Search page*/
	PageElement CUST_SEARCH_PHONE_NO=new PageElement("//input[@id='idx_form_TextBox_99']", "Phone number input inside customer search page");
	PageElement CUST_SEARCH_EMAIL=new PageElement("//input[@id='idx_form_TextBox_96']", "email input inside customer search page");
	PageElement CUST_SEARCH_SUBMIT=new PageElement("//span[@id='dijit_form_Button_79_label']", "Customer search button");
	
	/*Return search page*/
	PageElement RETURN_NO=new PageElement("//input[@id='idx_form_TextBox_10']", "Return number input ");
	PageElement RETURN_SEARCH_SUBMIT=new PageElement("//span[@id='dijit_form_Button_8_label']", "Return search button ");
	PageElement CUST_PHONE_NUMBER=new PageElement("//input[@id='idx_form_TextBox_13']", "Customer phone number input");
	PageElement RETURN_SEARCH_RESULT=new PageElement("(//a[@linkuid='OrderNo'])[1]", "Return search result");
	PageElement CUST_EMAIL=new PageElement("//input[@id='idx_form_TextBox_14']", "Return search email input");
}
