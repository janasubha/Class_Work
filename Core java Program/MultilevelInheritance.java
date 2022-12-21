
class Animal
{
public void display()
{
System.out.println("Animal");
}
}

class Dog extends Animal
{
public void dog()
{
System.out.println("Dog is  barking");
}
}

class Puppy extends Dog
{
public void puppy()
{
System.out.println("puppy is barking...");
}
}

class MultilevelInheritance
{
public static void main(String[] args)
{
Puppy py = new Puppy();
py.display();
py.dog();
py.puppy();
}
}