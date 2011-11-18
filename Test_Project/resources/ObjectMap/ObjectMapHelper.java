// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.ObjectMap;
import helpers.AxeMain;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>ObjectMap</b><br>
 * Generated     : <b>2011/11/18 8:23:13 AM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 build 7601 Service Pack 1 <br>
 * 
 * @since  November 18, 2011
 * @author Jaco
 */
public abstract class ObjectMapHelper extends helpers.AxeMain
{
	/**
	 * SiebelMarketing: with default state.
	 *		.title : Siebel Marketing
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://192.168.1.201:7780/marketing_enu/start.swe?SWECmd=Login&SWEPL=1&_sn=Hd5sN ...
	 */
	public DocumentTestObject Login() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("Login"));
	}
	/**
	 * SiebelMarketing: with specific test context and state.
	 *		.title : Siebel Marketing
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://192.168.1.201:7780/marketing_enu/start.swe?SWECmd=Login&SWEPL=1&_sn=Hd5sN ...
	 */
	public DocumentTestObject Login(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("Login"), anchor, flags);
	}
	
	/**
	 * Login: with default state.
	 *		.alt : Login
	 * 		.id : 
	 * 		.src : http://192.168.1.201:7780/marketing_enu/images/login77_d.gif
	 * 		.title : 
	 * 		.class : Html.IMG
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	public StatelessGuiSubitemTestObject Login_imglogin() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("Login_imglogin"));
	}
	/**
	 * Login: with specific test context and state.
	 *		.alt : Login
	 * 		.id : 
	 * 		.src : http://192.168.1.201:7780/marketing_enu/images/login77_d.gif
	 * 		.title : 
	 * 		.class : Html.IMG
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	public StatelessGuiSubitemTestObject Login_imglogin(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("Login_imglogin"), anchor, flags);
	}
	
	/**
	 * SWEPassword: with default state.
	 *		.id : s_swepi_2
	 * 		.type : password
	 * 		.title : 
	 * 		.class : Html.INPUT.password
	 * 		.name : SWEPassword
	 * 		.classIndex : 0
	 */
	public TextGuiTestObject Login_txtPassword() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("Login_txtPassword"));
	}
	/**
	 * SWEPassword: with specific test context and state.
	 *		.id : s_swepi_2
	 * 		.type : password
	 * 		.title : 
	 * 		.class : Html.INPUT.password
	 * 		.name : SWEPassword
	 * 		.classIndex : 0
	 */
	public TextGuiTestObject Login_txtPassword(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("Login_txtPassword"), anchor, flags);
	}
	
	/**
	 * SWEUserName: with default state.
	 *		.id : s_swepi_1
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : SWEUserName
	 * 		.classIndex : 0
	 */
	public TextGuiTestObject Login_txtUserName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("Login_txtUserName"));
	}
	/**
	 * SWEUserName: with specific test context and state.
	 *		.id : s_swepi_1
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : SWEUserName
	 * 		.classIndex : 0
	 */
	public TextGuiTestObject Login_txtUserName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("Login_txtUserName"), anchor, flags);
	}
	
	/**
	 * logo_wesbankGif: with default state.
	 *		.alt : 
	 * 		.id : 
	 * 		.src : https://www.wesbank.co.za/WesBankCoZa/pics/miscellaneous/calculators/logo_wesban ...
	 * 		.title : 
	 * 		.class : Html.IMG
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	public StatelessGuiSubitemTestObject WestBank_logo() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("WestBank_logo"));
	}
	/**
	 * logo_wesbankGif: with specific test context and state.
	 *		.alt : 
	 * 		.id : 
	 * 		.src : https://www.wesbank.co.za/WesBankCoZa/pics/miscellaneous/calculators/logo_wesban ...
	 * 		.title : 
	 * 		.class : Html.IMG
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	public StatelessGuiSubitemTestObject WestBank_logo(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("WestBank_logo"), anchor, flags);
	}
	
	

	protected ObjectMapHelper()
	{
		setScriptName("ObjectMap.ObjectMap");
	}
	
}

