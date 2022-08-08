package starpatterns;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
            
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		n=scanner.nextInt();
		scanner.close();
		
		pattern1(n);


	}
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n+1-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
