package refactoring.chap14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Database {
	private final Properties properties;
	private final String filename;
	
	public Database(String filename) {
		this.filename = filename;
		properties = new Properties();
		try (InputStream is = new FileInputStream(filename)) {
			properties.load(is);
			/*properties.loadFromXML(in);*/
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void set(String key, String value) {
		properties.setProperty(key, value);
	}

	public String get(String key) {
		return properties.getProperty(key, null);
	}
	public void update() throws IOException{
		properties.store(new FileOutputStream(filename), "");
		properties.store(new FileOutputStream(filename.replace(".txt", ".xml")), "");
	}
	public Properties getProperties() {
		return properties;
	}
	
	
}
