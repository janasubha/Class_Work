package collection;

import java.util.ArrayList;

public class UserArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<student> student=new ArrayList<>();
//		student s1=new student(101, "Monojit", "MCA");
//		student s2=new student(102, "koustav", "MCA");
//		student s3=new student(103, "Rahul", "MCA");
//		
//		student.add(s3);
//		student.add(s1);
//		student.add(s2);
		
		student.add(new student (101,"Monojit", "MCA"));
		student.add(new student (101,"koustav", "MCA"));
		student.add(new student (101,"Rahul", "MCA"));
		
		for(student std:student)
		{
			System.out.println("id:"+std.getId());
			System.out.println("name:"+std.getName());
			System.out.println("Course:"+std.getCourse());
			System.out.println("============");
		}
	}

}
