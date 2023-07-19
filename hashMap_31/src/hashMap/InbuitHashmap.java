package hashMap;
import java.util.*;

public class InbuitHashmap {

	public static void main(String[] args) {
		
	
	HashMap<String,Integer> map = new HashMap<>();
	
	map.put("abc",1);//insert in map
	map.put("gfh", 3);
	map.put("jk", 5);
	
	if(map.containsKey("abc")) {//to check key is present or not
		System.out.println("map has abc");
	}
	

	if(map.containsKey("ab")) {
		System.out.println("map has ab");
	}
	
	int v=map.get("abc");//get value
	System.out.println("v= "+v);
	
	/*int z=map.get("ab");//if we do not have value it will throw null pointer exception 
	System.out.println(z);*/
	
	//hence its better to initialize the variable first before getting its value
	int z= 0;
	if(map.containsKey("ab")) {
	z = map.get("ab");
	}
	System.out.println("z= " +z);//here we will get zero if ab is not present
	
	int c= 0;
	if(map.containsKey("jk")) {
	c = map.get("jk");
	}
	System.out.println("c= "+c);
	
	map.remove("jk");//to remove
	
	if(map.containsKey("jk")) {
		System.out.println("map has jk");
	}
	
	int size =map.size();//get size
	System.out.println("Size= "+size);
	
	Set<String> keys = map.keySet();//to iterate on all keys prints all keys
	for(String s:keys) {
		System.out.println(s);
	}
}
}