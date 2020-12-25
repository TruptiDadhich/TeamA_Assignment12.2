package Utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class utility {
	public static String URL1() 
    {
	String URL1 = "https://jsonplaceholder.typicode.com";
	return URL1;
    }
	
    public static String URL2() 
    {
	String URL2 = "https://help.tableau.com/current/api/rest_api/en-us/REST/rest_api_concepts_example_requests.htm";
	return URL2;
    }
    public static String body(String name, String password) 
    {
	String body = "{\r\n"
			+ "  \"credentials\": {\r\n"
			+ "    \"name\": \""+name+"\",\r\n"
			+ "    \"password\": \""+password+"\",\r\n"
			+ "    \"site\": {\r\n"
			+ "      \"contentUrl\": \"\"\r\n"
			+ "    }\r\n"
			+ "  }\r\n"
			+ "}";
	return body;
    }
        public static String getCurrentDateTime() {
    	DateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    	Date currentDate = new Date();
    	return customFormat.format(currentDate);
    }
}