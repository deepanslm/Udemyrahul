package javaudemy;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
      int val[][]= {{2,4,5},{3,0,5},{1,2,9}};
      
       int max=val[0][0];
      
      for(int i=0;i<3;i++)
      {
    	  for(int j=0;j<3;j++)
    	  {
    		  if (val[i][j]>max)
    		  {
    			  max=val[i][j];
    		  }
    			  
    	  }
    	  
    	  }
     
      System.out.println(max);
	}

}
