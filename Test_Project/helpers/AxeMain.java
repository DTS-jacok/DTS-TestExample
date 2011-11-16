package helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.rational.test.ft.object.interfaces.BrowserTestObject;
import com.rational.test.ft.object.interfaces.ProcessTestObject;
import com.rational.test.ft.object.interfaces.TestObject;
import com.rational.test.ft.object.interfaces.TopLevelTestObject;
import com.rational.test.ft.script.IOptionName;
import com.rational.test.ft.script.RationalTestScript;
import com.rational.test.ft.value.RegularExpression;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Variant;
import com.jacob.com.Dispatch;

public abstract class AxeMain extends RationalTestScript
{
	public static ActiveXComponent axe;
	public static ActiveXComponent harness;
	public static TestObject application;
	public static BrowserTestObject browser;
	public static TestObject htmlDocument;
		
	public static void axeInit(String testProject, String testSuite)
	{
	     axe = new ActiveXComponent("OdinTechnology.Axe.Runtime.Test"); 
         harness = new ActiveXComponent("OdinTechnology.Axe.Harness.AxeHarnessAPI");
         Dispatch.call(axe, "InitSuite", testProject, testSuite);
         Dispatch.call(harness, "SetSettings", Dispatch.call(axe, "GetRunCategoryOptions", "AxeHarness"));
         axeSetRFTOptions(Dispatch.call(axe, "GetRunCategoryOptions", "RFT").toString());
         String browserName = Dispatch.call(axe, "GetRunCategoryOption", "Browser", "name").toString();
         if(browserName.equals("Firefox") || browserName.equals("Mozilla Firefox"))
         {
        	 setCurrentBrowser("Mozilla Firefox");
         }
	}
	
	public static void axeSetRFTOptions(String optionsList)
	{
		if(optionsList.equals(""))
		{
			return;
		}
		String options[] = optionsList.split(";");
		String[] kvp;
		String optionName;
		String optionValue;
		for(String option : options)
		{
			kvp = option.split("=");
			optionName = kvp[0].toUpperCase();
			optionValue = kvp[1];
			logInfo(optionName + "=" + optionValue);
			if(optionName.equals("AMBIGUOUS_RECOGNITION_THRESHOLD"))
				setOption(IOptionName.AMBIGUOUS_RECOGNITION_THRESHOLD, Integer.parseInt(optionValue));
			else if(optionName.equals("DELAY_AFTER_WINDOW_ACTIVATE"))
				setOption(IOptionName.DELAY_AFTER_WINDOW_ACTIVATE, Double.parseDouble(optionValue));
			else if(optionName.equals("DELAY_BEFORE_GUI_ACTION"))
				setOption(IOptionName.DELAY_BEFORE_GUI_ACTION, Double.parseDouble(optionValue));
			else if(optionName.equals("DELAY_BEFORE_KEY_DOWN"))
				setOption(IOptionName.DELAY_BEFORE_KEY_DOWN, Double.parseDouble(optionValue));
			else if(optionName.equals("DELAY_BEFORE_KEY_UP"))
				setOption(IOptionName.DELAY_BEFORE_KEY_UP, Double.parseDouble(optionValue));
			else if(optionName.equals("DELAY_BEFORE_MOUSE_DOWN"))
				setOption(IOptionName.DELAY_BEFORE_MOUSE_DOWN, Double.parseDouble(optionValue));
			else if(optionName.equals("DELAY_BEFORE_MOUSE_MOVE"))
				setOption(IOptionName.DELAY_BEFORE_MOUSE_MOVE, Double.parseDouble(optionValue));
			else if(optionName.equals("DELAY_BEFORE_MOUSE_UP"))
				setOption(IOptionName.DELAY_BEFORE_MOUSE_UP, Double.parseDouble(optionValue));
			else if(optionName.equals("FIND_OBJECT_DELAY_BETWEEN_RETRIES"))
				setOption(IOptionName.FIND_OBJECT_DELAY_BETWEEN_RETRIES, Double.parseDouble(optionValue));
			else if(optionName.equals("INTERACTIVE"))
				setOption(IOptionName.INTERACTIVE, Boolean.parseBoolean(optionValue));
			else if(optionName.equals("LOG_APPLICATION_GUI_ACTION"))
				setOption(IOptionName.LOG_APPLICATION_GUI_ACTION, Boolean.parseBoolean(optionValue));
			else if(optionName.equals("LOG_EXCEPTION_SNAPSHOT"))
				setOption(IOptionName.LOG_EXCEPTION_SNAPSHOT, Boolean.parseBoolean(optionValue));
			else if(optionName.equals("LOG_FORMAT"))
				setOption(IOptionName.LOG_FORMAT, optionValue);
			else if(optionName.equals("MAXIMUM_FIND_OBJECT_TIME"))
				setOption(IOptionName.MAXIMUM_FIND_OBJECT_TIME, Double.parseDouble(optionValue));
			else if(optionName.equals("MAXIMUM_WAIT_FOR_EXISTENCE"))
				setOption(IOptionName.MAXIMUM_WAIT_FOR_EXISTENCE, Double.parseDouble(optionValue));
			else if(optionName.equals("MOUSE_HOVER_TIME"))
				setOption(IOptionName.MOUSE_HOVER_TIME, Double.parseDouble(optionValue));
			else if(optionName.equals("RECOGNITION_THRESHOLD"))
				setOption(IOptionName.RECOGNITION_THRESHOLD, Integer.parseInt(optionValue));
			else if(optionName.equals("RECOGNITION_THRESHOLD_WARNING"))
				setOption(IOptionName.RECOGNITION_THRESHOLD_WARNING, Integer.parseInt(optionValue));
			else if(optionName.equals("RECOGNITION_THRESHOLD_LASTCHANCE"))
				setOption(IOptionName.RECOGNITION_THRESHOLD_LASTCHANCE, Integer.parseInt(optionValue));
			else if(optionName.equals("TIME_MULTIPLIER"))
				setOption(IOptionName.TIME_MULTIPLIER, Double.parseDouble(optionValue));
			else if(optionName.equals("USE_DEFAULT_LOG_INFO"))
				setOption(IOptionName.USE_DEFAULT_LOG_INFO, Boolean.parseBoolean(optionValue));
			else if(optionName.equals("WAIT_FOR_EXISTENCE_DELAY_BETWEEN_RETRIES"))
				setOption(IOptionName.WAIT_FOR_EXISTENCE_DELAY_BETWEEN_RETRIES, Double.parseDouble(optionValue));
			else
				logError("Invalid option name -- " + optionName);						
		}
	}

	public static void axeLogMessage(String message)
	{
		logInfo(message);	
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		java.util.Date date = new java.util.Date();
		Dispatch.call(axe, "StepInfo", "[" + dateFormat.format(date) + "] " + message);	
	}
	
	public static void axeStepEnd()
	{
		int resultCode = Dispatch.get(axe, "ResultCode").getInt();
		Dispatch.call(axe, "StepEnd", resultCode, "");
		if(resultCode != 0)		
			logTestResult("Step", false);
	}
	
	public static void axeSubtestEnd()
	{
		Dispatch.call(axe, "SubtestEnd");
		for(TestObject to : getRegisteredTestObjects())
		{      
			if(!to.equals(application) && !to.equals(browser))
          		to.unregister();  
		}	         
	}
	
	public static void axeTestAbort(String message)
	{
		Dispatch.call(axe, "StepInfo", message);
		Dispatch.call(axe, "TestAbort");
		logTestResult("TestAbort", false, message);
	}
	
	public static TestObject axeFind(String className, String properties) throws Exception
	{
		return axeFind(null, className, properties);
	}
	 
	public static TestObject axeFind(TestObject root, String className, String properties) throws Exception
	{
		String[] kvp = properties.split("=");
		String propertyName = kvp[0];
		String propertyValue = kvp[1];			
		TestObject[] testObjects;
		RegularExpression regex = null;
		
		if(propertyName.endsWith("_regex"))
		{
			regex = new RegularExpression(propertyValue, true);
			propertyName = propertyName.substring(0, propertyName.indexOf("_regex"));
		}
		
		if(root == null)
		{
			if(regex == null)
				testObjects = find(atDescendant(".class", className, propertyName, propertyValue));
			else
				testObjects = find(atDescendant(".class", className, propertyName, regex));
		}
		else
		{
			if(regex == null)
			{
				if(className == "Html.HtmlDocument")
					testObjects = root.find(atChild(".class", className, propertyName, propertyValue));
				else
					testObjects = root.find(atDescendant(".class", className, propertyName, propertyValue));
			}
			else
			{
				if(className == "Html.HtmlDocument")
					testObjects = root.find(atChild(".class", className, propertyName, regex));
				else
					testObjects = root.find(atDescendant(".class", className, propertyName, regex));
			}
		}
		if(testObjects.length == 0)
		{
			throw new Exception("Object not found. Class: " + className + " Properties: " + properties);	
		}
		if(testObjects.length > 1)
		{
			throw new Exception("Object not unique. Class: " + className + " Properties: " + properties);	
		}
		return testObjects[0];
	}
	 
	public static BrowserTestObject axeBrowserBasestate(String url) throws Exception
	{
		TestObject browsers[] = find(atChild(".class" , "Html.HtmlBrowser"));
		if(browsers.length != 1)
		{
			return axeBrowserRestart(url);
		}
		BrowserTestObject browser = (BrowserTestObject)browsers[0];
		String currentUrl = browser.getProperty(".documentName").toString();
		axeLogMessage("Found browser " + currentUrl);
		if(!currentUrl.equals(url))
		{
			axeLogMessage("Navigating to " + url);
			browser.loadUrl(url);
		}
		return browser;
	}
	
	public static BrowserTestObject axeBrowserRestart(String url) throws Exception
	{
		axeBrowserCloseAll();
		ProcessTestObject browserProcess = startBrowser(url);
		browserProcess.waitForExistence();
		java.util.Calendar start = java.util.Calendar.getInstance(); 
		while((java.util.Calendar.getInstance().getTimeInMillis() - start.getTimeInMillis())/1000 < ((Number)getOption(IOptionName.MAXIMUM_WAIT_FOR_EXISTENCE)).longValue())
		{
			TestObject browsers[] = find(atChild(".class" , "Html.HtmlBrowser"));
			if(browsers.length > 0)
			{
				BrowserTestObject browser = (BrowserTestObject)browsers[0];					
				return browser;
			}
			sleep(1);
		}					
		throw new Exception("Browser not found.");	
	}
	
	public static void axeBrowserCloseAll() throws Exception
	{
		int closeWait = 0;
		for(TestObject browser : find(atChild(".class" , "Html.HtmlBrowser")))
		{
			axeLogMessage("Closing " + ((BrowserTestObject)browser).getProperty(".documentName").toString());
			((BrowserTestObject)browser).close();
			sleep(1);
			while(((BrowserTestObject)browser).exists())
			{
				if(closeWait++ > 10)
				{
					throw new Exception( "Timed-out waiting for browser to close." );
				}
				sleep(1);
			}
		}
	}
	
	public static void axeBrowserWait() throws Exception
	{
		long startTimeInSeconds = System.currentTimeMillis()/1000;
		while(Integer.parseInt(browser.getProperty(".readyState").toString()) < 4)
		{   	 
			if((System.currentTimeMillis()/1000 - startTimeInSeconds) > ((Double)RationalTestScript.getOption(IOptionName.MAXIMUM_WAIT_FOR_EXISTENCE)).doubleValue())
			{
				throw new Exception( "Timed-out waiting for browser to be ready." );
			}
			sleep(1);
		}
	}
}
