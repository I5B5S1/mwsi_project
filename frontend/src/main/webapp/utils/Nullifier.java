package main.webapp.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Nullifier {
	public static  Map<String, String> nullify(Map<String, String[]> requestMap) {
		Map<String, String> map = new HashMap<String, String>();
		
		for (String key : requestMap.keySet()) {
			for (String value : requestMap.get(key)) {
				if ("".equals(value)) {
					map.put(key, null);
				} else {
					map.put(key, value);
				}
			}
		}
		return map;
	}
}
