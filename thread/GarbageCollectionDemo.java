package thread;

public class GarbageCollectionDemo {
public void finalize()
{
	System.out.println("object is garbage collected");
}
	public static void main(String[] args) {
		GarbageCollectionDemo g1=new GarbageCollectionDemo();
		GarbageCollectionDemo g2=new GarbageCollectionDemo();
		g1=null;
		g2=null;
		System.gc();
	}

}
