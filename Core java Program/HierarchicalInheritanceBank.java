
class Bank
{
public void loaninterest()
{
System.out.println("9% interrest");
}
}

class Sbi extends Bank
{
public void sbiloan()
{
System.out.println("For sbi");
}
}

class Hdfc extends Bank
{
public void hdfcloan()
{
System.out.println("For Hdfc");
}
}

class Axis extends Bank
{
public void axisloan()
{
System.out.println("For AXIS");
}
}

class HierarchicalInheritanceBank
{
public static void main(String[] args)
{
Sbi  si = new Sbi ();
si.sbiloan();
si.loaninterest();

Hdfc hd=new Hdfc();
hd.hdfcloan();
hd.loaninterest();

Axis ax=new Axis();
ax.axisloan();
ax.loaninterest();
}
}