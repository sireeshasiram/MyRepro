package Slenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[]args) throws IOException
	{
	//work with properties file

	Properties User = new Properties();

	File file = new File(System.getProperty("user.dir")+"/src/Slenium/User.properties");

	try {
		FileInputStream input = new FileInputStream(file);
		User.load(input);
		
	System.out.println("Getting property:"+User.getProperty("UserName"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}