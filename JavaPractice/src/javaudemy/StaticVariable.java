package javaudemy;

public class StaticVariable {
	
	String name;
	String Addrss;	
	static String City = "Chennai";
	static int i=0;
	
	StaticVariable(String name,String Addrss)
	{
		this.name=name;
		this.Addrss=Addrss;
		i++;
		
		System.out.println(i);
		//System.out.println(name+ " "+Address);
	}
		
	
	public void getAddress()
	{
		System.out.println(Addrss+" "+City);
	}

	public static void getCity() {
		System.out.println("city");
		
	}
	public static void main(String[] args) {
		
		StaticVariable sv= new StaticVariable("Deepan","jai nagar");
		StaticVariable sv1= new StaticVariable("karthi","vallu nagar");
		StaticVariable sv2=new StaticVariable ("venba","Nall nagar");
	    sv.getAddress();
	    sv1.getAddress();
	    StaticVariable.getCity();
		
		// TODO Auto-generated method stub

	}

}
