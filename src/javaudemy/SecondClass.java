package javaudemy;

public class SecondClass {
	
	public void gettext()
	{
		System.out.println("second class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
     String a = "cskforever";
     String b = " there is no need to be afraid";
     
     System.out.println(a);
     System.out.println(b);
     
     System.out.println(a.charAt(2));
     System.out.println(a.length());
	 System.out.println(b.compareTo("there is no need"));
	String arr[]=b.split("s");
	System.out.println(arr[1]);
	 System.out.println(b);
	 System.out.println(b.substring(6));
	 System.out.println(b.trim());
	 System.out.println(b);
	 System.out.println(b.replace("e", "x"));
	 
	}

}
