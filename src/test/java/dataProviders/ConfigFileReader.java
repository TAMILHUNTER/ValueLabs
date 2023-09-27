package dataProviders;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import Constants.GlobalConstants;

public class ConfigFileReader {

	protected InputStream input = null;
	protected static Properties properties = null;

	public ConfigFileReader() {
		try {
			input = Files.newInputStream(Paths.get(GlobalConstants.Config_Properties_Loc));
			properties = new Properties();
			properties.load(input);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getDriverPath_Chrome() {
		String DriverPath_Chrome = properties.getProperty("DriverPath_Chrome");
		if (DriverPath_Chrome != null)
			return DriverPath_Chrome;
		else
			throw new RuntimeException("DriverPath_Chrome not specified in the Configuration.properties file.");
	}

	public static String getChrome_Binary() {
		String Chrome_Binary = properties.getProperty("Chrome_Binary");
		if (Chrome_Binary != null)
			return Chrome_Binary;
		else
			throw new RuntimeException("Chrome_Binary not specified in the Configuration.properties file.");
	}

	public String getBrowser() {
		if (properties.getProperty("browserName") == null)
			return "";
		else
			return properties.getProperty("browserName");
	}

	public static String getDriverPath_Firefox() {
		String driverPath = properties.getProperty("DriverPath_Firefox");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath_Firefox not specified in the Configuration.properties file.");
	}

	public static String getDriverPath_Edge() {
		String DriverPath_Edge = properties.getProperty("DriverPath_Edge");
		if (DriverPath_Edge != null)
			return DriverPath_Edge;
		else
			throw new RuntimeException("DriverPath_Edge not specified in the Configuration.properties file.");
	}

	public static String getEnvironment() {
		String Environment = properties.getProperty("Environment");
		if (Environment != null)
			return Environment;
		else
			throw new RuntimeException("Browser not specified in the Configuration.properties file.");
	}

	public static String getBrowserCompatipility() {
		String BrowserCompatipility = properties.getProperty("BrowserCompatipility");
		if (BrowserCompatipility != null)
			return BrowserCompatipility;
		else
			throw new RuntimeException("BrowserCompatipility not specified in the Configuration.properties file.");
	}

	public static String getLanguage() {
		String Language = properties.getProperty("Language");
		if (Language != null)
			return Language;
		else
			throw new RuntimeException("Language not specified in the Configuration.properties file.");
	}

	public static String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public static String getScreenshotPath_Pass() {
		String ScreenshotPath_Pass = properties.getProperty("ScreenshotPath_Pass");
		if (ScreenshotPath_Pass != null)
			return ScreenshotPath_Pass;
		else
			throw new RuntimeException("ScreenshotPath_Pass not specified in the Configuration.properties file.");
	}

	public static String getScreenshotPath_Fail() {
		String ScreenshotPath_Fail = properties.getProperty("ScreenshotPath_Fail");
		if (ScreenshotPath_Fail != null)
			return ScreenshotPath_Fail;
		else
			throw new RuntimeException("ScreenshotPath_Fail not specified in the Configuration.properties file.");
	}

	public static String getScreenshotPath_Scenario() {
		String ScreenshotPath_Scenario = properties.getProperty("ScreenshotPath_Scenario");
		if (ScreenshotPath_Scenario != null)
			return ScreenshotPath_Scenario;
		else
			throw new RuntimeException("ScreenshotPath_Scenario not specified in the Configuration.properties file.");
	}

	public static String getReportPath() {
		String ReportPath = properties.getProperty("ReportPath");
		if (ReportPath != null)
			return ReportPath;
		else
			throw new RuntimeException("ReportPath not specified in the Configuration.properties file.");
	}

	public static String getLoggerPath() {
		String LoggerPath = properties.getProperty("LoggerPath");
		if (LoggerPath != null)
			return LoggerPath;
		else
			throw new RuntimeException("LoggerPath not specified in the Configuration.properties file.");
	}

	public static String getSparkReportPath() {
		String SparkReportPath = properties.getProperty("SparkReportPath");
		if (SparkReportPath != null)
			return SparkReportPath;
		else
			throw new RuntimeException("SparkReportPath not specified in the Configuration.properties file.");
	}

	// ***********************************************************************************************************************//
	// Login Test-Data

	public static String getEnableScreenRecording() {
		String EnableScreenRecording = properties.getProperty("EnableScreenRecording");
		if (EnableScreenRecording != null)
			return EnableScreenRecording;
		else
			throw new RuntimeException("EnableScreenRecording not specified in the Configuration.properties file.");
	}

	public static String getScreenRecordPath() {
		String ScreenRecordPath = properties.getProperty("ScreenRecordPath");
		if (ScreenRecordPath != null)
			return ScreenRecordPath;
		else
			throw new RuntimeException("ScreenRecordPath not specified in the Configuration.properties file.");
	}

	public static String getEnableHeadless() {
		String EnableHeadless = properties.getProperty("EnableHeadless");
		if (EnableHeadless != null)
			return EnableHeadless;
		else
			throw new RuntimeException("EnableHeadless not specified in the Configuration.properties file.");
	}

	public static String getDisableNotification() {
		String DisableNotification = properties.getProperty("DisableNotification");
		if (DisableNotification != null)
			return DisableNotification;
		else
			throw new RuntimeException("DisableNotification not specified in the Configuration.properties file.");
	}

	
	public static String getLogin_Landing() {
		String Login_Landing = properties.getProperty("Login_Landing");
		if (Login_Landing != null)
			return Login_Landing;
		else
			throw new RuntimeException("Login_Landing not specified in the Configuration.properties file.");
	}

	public static String getskip_session() {
		String skip_session = properties.getProperty("skip_session");
		if (skip_session != null)
			return skip_session;
		else
			throw new RuntimeException("skip_session not specified in the Configuration.properties file.");
	}

	public static String getScreenshotPath_testcomplete() {
		String ScreenshotPath_testcomplete = properties.getProperty("ScreenshotPath_testcomplete");
		if (ScreenshotPath_testcomplete != null)
			return ScreenshotPath_testcomplete;
		else
			throw new RuntimeException(
					"ScreenshotPath_testcomplete not specified in the Configuration.properties file.");
	}
//***********************************************************************************************************************//

}
