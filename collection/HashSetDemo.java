package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("santanu");
		set.add("kallol");
		set.add("sahil");
		set.add("Monojit");
		set.add("Riya");
		set.add("priya");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("==========");
		set.remove("kallol");
		Iterator<String> itr1=set.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		set.removeIf(str->str.contains("jit"));
		System.out.println(set);
	}

}
