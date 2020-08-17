package javaudemy;

public class Minmaxexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{2,4,5},{6,8,1},{5,0,4}};
		
		int min=arr[0][0];
		int mincolumn=0;
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(arr[i][j]< min)
                  {
                	  min=arr[i][j];
                	  mincolumn=j;
	               }

			}
			
		}System.out.println(min);
		System.out.println(mincolumn);
		
		int k=0;
		int maxcolumn= arr[0][mincolumn];
		
		while (k<3)
		{
			if (arr[k][mincolumn]>maxcolumn)
					
			{
				maxcolumn=arr[k][mincolumn];
			
			}	k++;
		}
			
       System.out.println(maxcolumn);
	}

}
