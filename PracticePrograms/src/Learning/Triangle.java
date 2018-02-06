package Learning;


import java.util.Scanner;

public class Triangle {
	
	
	public  void pyr(int n)
	{
		int k=2*n-2;
		
	//outer loop for number of rows
		for(int i=0;i<n;i++)
		{
			
		
	//to print the spaces
		for (int j=0;j<=k;j++)
		{
			System.out.println();
			
		}
		
		for(int j=0;j<=i;j++)
		{
			System.out.println("* ");
			
		}
		
	}
	}
	public static void main(String[] args)
	
	{
		Triangle T=new Triangle();
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		T.pyr(n);
		
		
	}
}
