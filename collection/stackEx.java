package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
//import java.util.Stack;

public class stackEx {

	public static void main(String[] args) {
		LinkedList<String> stack=new LinkedList<>();
        //Stack<String> stack=new Stack<>();
        stack.add("monojit");
        stack.add("suvankar");
        stack.add("suraj");
        //stack.pop();
       // System.out.println(stack);
for(String str:stack)
{
	System.out.println(str);
}
System.out.println("================");
Iterator itr=stack.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
stack.addFirst("First");
stack.addLast("last");
stack.add(2, "rakesh");
System.out.println(stack);
stack.removeFirst();
stack.removeLast();
System.out.println(stack);
stack.remove(1);
System.out.println(stack);
stack.remove("suraj");
System.out.println(stack);

ListIterator listitr=stack.listIterator(); // for linklist
System.out.println("Forward direction: ");
{
	while(listitr.hasNext()) 
	{
		System.out.println(listitr.next());
	}
	System.out.println("========");
	
	System.out.println("Backward direction: ");
	{
		while(listitr.hasPrevious()) 
		{
			System.out.println(listitr.previous());
		}
		
	  }
	
  }
Iterator it=stack.descendingIterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
if(stack.contains("suvankar"))
{
	System.out.println("data present");
}
else
	System.out.println("data not present");
stack.push("sam");
System.out.println(stack);
stack.pop();
System.out.println(stack);
stack.poll();
System.out.println(stack);

	}
        
}
