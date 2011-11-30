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
 * Generated     : <b>2011/11/24 6:52:48 AM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 build 7601 Service Pack 1 <br>
 * 
 * @since  November 24, 2011
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
	public DocumentTestObject sblLogin() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("sblLogin"));
	}
	/**
	 * SiebelMarketing: with specific test context and state.
	 *		.title : Siebel Marketing
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://192.168.1.201:7780/marketing_enu/start.swe?SWECmd=Login&SWEPL=1&_sn=Hd5sN ...
	 */
	public DocumentTestObject sblLogin(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("sblLogin"), anchor, flags);
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
	public StatelessGuiSubitemTestObject sblLogin_imglogin() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("sblLogin_imglogin"));
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
	public StatelessGuiSubitemTestObject sblLogin_imglogin(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("sblLogin_imglogin"), anchor, flags);
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
	public TextGuiTestObject sblLogin_txtPassword() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("sblLogin_txtPassword"));
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
	public TextGuiTestObject sblLogin_txtPassword(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("sblLogin_txtPassword"), anchor, flags);
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
	public TextGuiTestObject sblLogin_txtUserName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("sblLogin_txtUserName"));
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
	public TextGuiTestObject sblLogin_txtUserName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("sblLogin_txtUserName"), anchor, flags);
	}
	
	/**
	 * SiebPageTabs: with default state.
	 *		ClassName : SiebPageTabs
	 * 		.class : SiebPageTabs
	 * 		RepositoryName : SiebPageTabs
	 */
	public SiebPageTabsTestObject sblLoginPageTabList() 
	{
		return new SiebPageTabsTestObject(
                        getMappedTestObject("sblLoginPageTabList"));
	}
	/**
	 * SiebPageTabs: with specific test context and state.
	 *		ClassName : SiebPageTabs
	 * 		.class : SiebPageTabs
	 * 		RepositoryName : SiebPageTabs
	 */
	public SiebPageTabsTestObject sblLoginPageTabList(TestObject anchor, long flags) 
	{
		return new SiebPageTabsTestObject(
                        getMappedTestObject("sblLoginPageTabList"), anchor, flags);
	}
	
	

	protected ObjectMapHelper()
	{
		setScriptName("ObjectMap.ObjectMap");
	}
	
}

