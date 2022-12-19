class Box{
	private int l;
	private int b;
	private int h;
	public void setData(int length,int breadth,int height)
	{
		l=length;
		b=breadth;
		h=height;
	}
	public void display()
	{
		System.out.println("Length: "+l+"\n"+"Breadth: "+b+"\n"+"Height: "+h);
	}
	
}
public class AccessSpecifierDemo {

	public static void main(String[] args) {
		Box b1=new Box();
		b1.setData(12, 15, 18);
		b1.display();
	}

}