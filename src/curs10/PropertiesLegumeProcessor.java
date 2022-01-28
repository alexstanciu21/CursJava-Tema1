package curs10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLegumeProcessor {

	public void readProperties(String key) throws IOException {

		InputStream inputStream = new FileInputStream("legume.properties");
		Properties prop = new Properties();
		prop.load(inputStream);

		String calorie = prop.getProperty(key.toLowerCase());
		System.out.println("Leguma " + key + " are " + calorie + " calorii");

	}

}
