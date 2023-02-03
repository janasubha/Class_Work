package collection;

import java.util.ArrayList;

public class ArrayListConversion {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();  
        list.add("santanu");  
        list.add("sayan");  
        list.add("ram");  
        String array[] = new String[list.size()];          
        for(int j =0;j<list.size();j++){  
          array[j] = list.get(j);  
        }  
        for(String k: array)  
        {  
            System.out.println(k);  
        }  
	}

}
