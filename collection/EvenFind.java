package collection;

import java.util.Arrays;
import java.util.List;

public class EvenFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
number.stream().filter(n->n%2==0).forEach(System.out::println);
int sum1=number.stream().reduce(0,(a,b)->a+b);
System.out.println(sum1);
int sum2=number.stream().mapToInt(i->i).sum();
System.out.println(sum2);

	}

}
