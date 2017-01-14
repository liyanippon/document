
package salary.util;

import java.util.*;
import java.text.*;
import java.io.*;

public class DataConvert {

	public DataConvert(){}

	// Format YYYY-MM-DD
	public static String getStringDate() 
	{
		java.util.Date currentTime = new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	public static java.sql.Date StrTosqlDate(String strDate) 
	{
		if(strDate==null || strDate=="")
			strDate = "1980-01-01";
		return java.sql.Date.valueOf(strDate.substring(0, 10));
	}

	public static String sqlDateToStr(java.sql.Date dateDate) 
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
		String dateString = formatter.format(dateDate);
		return dateString;
	} 

	public static String sqlDateToStrr(java.sql.Date dateDate) 
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(dateDate);
		return dateString;
	} 
	
	public static int StrToInt(String str) 
	{
		if(str==null || str == "")
			return 0;
		return Integer.parseInt(str);
	}

	public static String IntToStr(int i) 
	{
		return String.valueOf(i);
	}

	public static String ViewStr(String str) 
	{
		if (str.equals(""))
			return "Пе";
		else
			return str;
	}
	public static Double ViewDou(Double str) 
	{
		if (str.equals(""))
			return 0.0;
		else
			return str;
	}
	
}
