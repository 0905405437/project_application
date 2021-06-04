package lab01_1216586;

import java.util.Scanner;

public class TestLab01_1216586
{
	public static void main(String[] args)
	{
		int i,j,k=1,n;  
		Scanner kb=new Scanner(System.in);
		System.out.print("Nhap pham vi: ");  
		n=kb.nextInt();  
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			k++;
			System.out.println();
		}
	}
}