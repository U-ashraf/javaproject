package ujava;

public class multidimentinalarray {

	public static void main(String[] args) {
		         //2 4 5 7 0 -Row 0
				//3 4 7 8 5- Row 1
				//1 2 6 9 8 - Row 2
				 /*
				int x[][]=new int[3][5];
				
				x[0][0]=2;
				x[0][1]=4;
				x[0][2]=5;
				x[0][3]=7;
				x[0][4]=0;
				
				System.out.println(x[0][3]);
				*/
				
				int x[][] = {{1,4,5,7},{3,4,7,8},{1,2,6,9}};
				
				/*
			    System.out.println(x[0][0]);
				System.out.println(x[0][1]);
				System.out.println(x[0][2]);
				System.out.println(x[0][3]);
				System.out.println(x[1][0]);
				System.out.println(x[1][1]);
				System.out.println(x[1][2]);
				System.out.println(x[1][3]);
				System.out.println(x[2][0]);
				System.out.println(x[2][1]);
				System.out.println(x[2][2]);
				System.out.println(x[2][3]);
				*/
				
				int i,j;
				
				for (i=0;i<3;i++)
				{
					for(j=0;j<4;j++)
					{
						System.out.print(x[i][j]);

					}
					System.out.println("\t");//"\t" is used to go to new line to separate the rows
				}
					
				
				
				
				
	}

}
