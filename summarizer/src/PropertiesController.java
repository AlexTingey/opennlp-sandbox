
import java.io.File;


import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import javax.naming.InitialContext;


/**
 * A class which controls the loading of the various properties needed for the application to function
 * @author Alex Tingey
 *
 */
public class PropertiesController {
	
	/**
	 * Creates a Properties object from a config file at a specified location
	 * @return A Properties object based off of the provided propertiesPath 
	 */
	
	public static String EN_POS_BIN_LOCATION = "enPos";
	public static String EN_SENT_BIN_LOCATION = "enSent";
	public static String EN_TOKEN_LOCATION = "enToken";
	public static String IDF_CSV = "idfCSV";

	public static Properties loadProperties() {
		Properties prop = new Properties();
		FileReader stream;
		try {
			InitialContext initialContext = new javax.naming.InitialContext();
			
			String propertiesPath = "C:/config/chatbot_app/config.properties";

			stream = new FileReader(propertiesPath);
			prop.load(stream);
			stream.close();
			
		}
		catch(Exception e) {
			System.out.println("System missing properties at: C:/config/chatbot_app/config.properties");
			System.out.println(e.getMessage());
		}
		return prop;
	}
	
}
