package Learning;

import java.util.Scanner;

public class duplicateProgram {

	public void methoddup()
	{
		
		//Scanner sc = new Scanner(System.in);
		
		// System.out.println("Enter the inputs number: ");
	//	 int n=sc.nextInt();
		 
		int a[]={1,2,5,78,3,10,5};
		
		
	for(int i=0;i<a.length;i++)
	{
		for(int j=1;j<(a.length-i);j++)
		{
			int temp=0;
			
		/*if(a[i]==a[j])
		{
			System.out.println(a[i]);
			
		}
		else */
		
		if(a[j-1]>a[j])
		{
			temp=a[j-1];
			a[j-1]=a[j];
			a[j]=temp;
			
		}
		
		
		 if(a[j-1]==a[j])
			{
				System.out.println("Duplicate element in array:"+a[j-1]);
			}
	
		}
		
		System.out.println(a[i]);	
		
		
	}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateProgram d=new duplicateProgram();
		d.methoddup();
		
		
	}

}
