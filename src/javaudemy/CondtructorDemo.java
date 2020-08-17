package javaudemy;

public class CondtructorDemo {
	
	
public CondtructorDemo()
{
	System.out.println("this is the constructor");
	
}

public CondtructorDemo(int a,int b)
{
	System.out.println("this is the constructor param");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 CondtructorDemo cd =new CondtructorDemo();
		 CondtructorDemo ci =new CondtructorDemo(4,5);

	}

}
