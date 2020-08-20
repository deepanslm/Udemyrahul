package javaudemy;

public class Deepinterface implements DeepinterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeepinterDemo de= new Deepinterface();
		
		de.getscore();
		de.getcentury();
	}

	@Override
	public void getscore() {
		// TODO Auto-generated method stub
		System.out.println("This is corrrect");
		
	}

	@Override
	public void getcentury() {
		// TODO Auto-generated method stub
		System.out.println("Deep test");

		
	}

	@Override
	public void getduck() {
		// TODO Auto-generated method stub
		
	}

}
