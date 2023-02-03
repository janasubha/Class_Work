package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> list=new ArrayList<>();
		list.add(new Student1(101, "nikhil", 10));
		list.add(new Student1(102, "ajay", 1));
		list.add(new Student1(103, "ram", 4));
		System.out.println("sort by roll");
		Collections.sort(list,new RollComparator());
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Student1 s=(Student1) itr.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getRollno());
		}
	}

}
