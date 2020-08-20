package javaudemy;

public class arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int[] values; 
		values = new int[3];
		
		values[0]= 1;
		values[1]=2;
		values[2]=3;
		

		for (int depe : values) {
			
			System.out.println(depe);
		}
		
		int[] deep = {5,6,7};

		for (int j=0;j<deep.length;j++) {
			
			System.out.println(deep[j]);
		}
		
	}

}
