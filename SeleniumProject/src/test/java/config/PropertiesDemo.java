package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {
	
	static Properties prop = new Properties();

	public static void main(String[] args) {

//		readPropFile();
		writePropFile();
	}


	public static void readPropFile() {

		try {
//			Properties prop = new Properties();

			//			String projectPath = System.getProperty("user.dir");
			//			System.out.println(projectPath);
			//			String configFilePath = projectPath+"/src/test/java/config/config.properties";
			//			System.out.println(configFilePath);

			InputStream input = new FileInputStream("./src/test/java/config/config.properties");
			prop.load(input);

			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("name", "Automation"));
			System.out.println(prop.getProperty("project", "Java"));

		}catch(Exception exp) {
			System.out.println("Found exception - "+exp.getMessage());
		}
	}




	public static void writePropFile() {
		try {

//			Properties prop = new Properties();
			
			OutputStream output = new FileOutputStream("./src/test/java/config/config.properties");

			prop.setProperty("result", "pass");
			prop.setProperty("name", "automation");
			prop.setProperty("project", "selenium");
			prop.setProperty("browser", "firefox");
			
			prop.store(output, null);
			
		}catch(Exception exp) {
			System.out.println("Found exception - "+exp.getMessage());

		}
	}


}














