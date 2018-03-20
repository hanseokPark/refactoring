package refactoring.chap02.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {
	private  Map<String,String> _map = new HashMap<String,String>();
	public SimpleDatabase(Reader r) throws IOException{
		BufferedReader reader = new BufferedReader(r);
		boolean reading = false;
		String line;
		while(!reading) {
			line = reader.readLine();
			if(line == null) {
				reading = true;
			}else {
				boolean scanningKey = true;
				StringBuffer keyBuffer = new StringBuffer();
				StringBuffer valueBuffer = new StringBuffer();
				for(int i=0; i<line.length(); i++) {
					char c = line.charAt(i);
					if(scanningKey) {
						if(c == '=') {
							scanningKey = false;
						}else {
							keyBuffer.append(c);
						}
					}else {
						valueBuffer.append(c);
					}
				}
				String key = keyBuffer.toString();
				String value = valueBuffer.toString();
				_map.put(key, value);
			}
		}
	}
	public void putValue(String key, String value) {
		_map.put(key, value);
	}
	public String getValue(String key) {
		return _map.get(key);
	}
	public Iterator<String> iterator(){
		return _map.keySet().iterator();
	}
	
	
}
