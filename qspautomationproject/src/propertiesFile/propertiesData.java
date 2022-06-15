package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesData 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
        prop.load(fis);
        String value = prop.getProperty("browser");
        String value1 = prop.getProperty("url");
        System.out.println(value);
        System.out.println(value1);
        
        
        
	}

}
