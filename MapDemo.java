package spider;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
HashMap<String,String> map = new HashMap<>();
map.put("jack", "jill");
map.put("jen", "ben");
map.put("scott", "tiger");
map.put("duke", "java");

for(String key : map.keySet())
	System.out.println(key + ": "+map.get(key));
	}

}
