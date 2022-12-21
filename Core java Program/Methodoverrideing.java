
class ParentBank
{
public void loaninterest()
{
System.out.println("7% interest");
}
}

class ChildSbi extends ParentBank
{
public void loaninterest()
{
System.out.println("7.5% interest");
}
}

class ChildHdfc extends ParentBank
{
public void loaninterest()
{
System.out.println("8% interest");
}
}

class ChildAxis extends ParentBank
{
public void loaninterest()
{
System.out.println("10% interest");
}
}

public class Methodoverrideing
{
public static void main(String[] args)
{
ParentBank  pb;

pb=new ChildSbi();
pb.loaninterest();

 pb=new ChildHdfc();
pb.loaninterest();

 pb=new ChildAxis();
pb.loaninterest();
}
}