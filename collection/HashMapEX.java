package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
//		map.put(1,"Mango");
//		map.put(2, "Apple");
//		map.put(3, "Banana");
//		map.put(4, "Grapes");
//		//map.put(1, "Kiwi");
//		map.remove(1,"Mango");
		
		map.put(101, "Amit");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		for(Map.Entry m: map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		System.out.println("==============");
		
		map.putIfAbsent(104, "Gaurav");
		for(Map.Entry m: map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
