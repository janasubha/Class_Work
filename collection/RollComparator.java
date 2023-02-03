package collection;

import java.util.Comparator;

public class RollComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2)
	{
		if(o1.getRollno()==o2.getRollno())
			return 0;
		else if(o1.getRollno()>o2.getRollno())
			return 1;
		else
			return -1;
					
		
	}
}
