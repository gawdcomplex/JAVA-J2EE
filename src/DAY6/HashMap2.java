package DAY6;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
 public static void main(String[] args) {

	 HashMap<String,String>  map= new HashMap<String, String>();
	     map.put("lang1","java");
	     map.put("lang2", "c++");
	     map.put("lang3", "c#");
	     map.put("lang4", "python");
	 
	     
	     for( Map.Entry<String,String>   obj       : map.entrySet() )
	     System.out.println(obj.getKey()+"  "+obj.getValue());
	 
 }
 }