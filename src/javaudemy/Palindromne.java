package javaudemy;

public class Palindromne {
	
	public static void main(String[] args) {
		
		String de = "madam";
	    String pe = "";
	    
	   for (int i=de.length()-1;i>=0;i--)
	   {
		  pe= pe+(de.charAt(i)); 
	   }
		
	   System.out.println(pe);
	   
	   if (de.equalsIgnoreCase(pe))
	   {
		   System.out.println("Its a Palindrome");
	   }
	   else {
		   System.out.println("Not a palindrome");
	   }
	}
	
	

}
