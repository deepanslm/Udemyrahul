package javaudemy;



public class arrayDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grid= {
				{2,3,3},
				{23,43,43,54},
				{323,924,92847,2873}

	};
		
		
        for (int row=0;row<grid.length;row++)
{
	for (int column=0;column<grid[row].length;column++)
	{
		System.out.print(grid[row][column] + "\t");
	}
	
	System.out.println();
	}

	
        String[][]words= new String[3][3];
    	words[0][1]= "hi there";
    	
    	System.out.println(words[0][1]);
	}
	
}



 
 