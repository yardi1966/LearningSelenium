package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	//in order to call getData method we have to create the object of the PropertiesUtility class
	//make this method static so you can call it without creating an object of the class
	public static String getData(String key) throws IOException {
		
		//create a file class object that will reference the properties file
		File file = new File("D:\\selenium-java\\javacode\\TestData.properties");
		
		//create fileReader class object with the file class object
		FileReader reader = new FileReader(file);
		
		//properties class object contains all the data in the file
		Properties prop = new Properties();
		
		//load properties file with the reader class object
		prop.load(reader);
		
		//call getValue() method
		prop.get(key);
		
		//type cast the return vale as String as it originally returns a type object
		return (String) prop.getProperty(key);
		
	}

}
