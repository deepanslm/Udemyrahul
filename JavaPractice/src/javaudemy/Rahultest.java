package javaudemy;

public class Rahultest {
	
	public void getdata()
	{
		System.out.println("method execution");
		
	}
	
	static int a=10;

	public static void main(String[] args) {
		
		SecondClass sc =new SecondClass();
		
		Rahultest dp = new Rahultest();
		
		sc.gettext();
		dp.getdata();
		System.out.println("hello world");
		System.out.print(a);

		

	}

}
