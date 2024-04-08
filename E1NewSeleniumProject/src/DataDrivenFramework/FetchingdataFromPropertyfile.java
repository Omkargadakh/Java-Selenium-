package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingdataFromPropertyfile {
	
	public static void main(String[] args) throws IOException{
	
		FileInputStream fis = new FileInputStream("./testData/CommanData.Properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String url = prop.getProperty("Url");
		System.out.println(url);
		
		String pass = prop.getProperty("password");
		System.out.println(pass);
	}
}
