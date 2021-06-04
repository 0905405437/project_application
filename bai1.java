package mang1chieu;

import java.util.Scanner;
public class bai1 {
	int []a;
	void nhap()
	{
		int n;
		Scanner kb=new Scanner(System.in);
		kb = new Scanner(System.in);
		System.out.print("nhap so phan tu mang:"); n=kb.nextInt(); 
		a= new int [n];
		for (int i=0; i<a.length; i++)
		{
			System.out.print("Nhap so thu "+ (i+1)+ ":");
			a[i]= kb.nextInt();
		}
	}
	void in()
	{
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
	}
	int tong()
	{
		int k=0;
		for(int i:a) k= k+i;
		return k;
	}
	void max()
	{
		int k=a[0];
		for(int i:a) if(i>k) k=i;
		System.out.println("\nSo lon nhat trong mang la:"+ k);
	}
	void dao()
	{
		int i=0,j=a.length-1;
		while(i<=j)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
		}
	}
	boolean tang()
	{
		for(int i=0; i<a.length-1; i++)
			if(a[i]>a[i+1]) return false;
		return true;
	}
	int timx(int x)
	{
		for(int i=0; i<a.length; i++)
			if(a[i]==x) return 1;
		return 0;
	}
	int demle()
	{
		int k=0;
		for(int i=0; i<a.length; i++)
			if(a[i]%2==1) k++;
		return k;
	}
	void chen()
	{
		int x,y;
		Scanner kb=new Scanner(System.in);
		System.out.print("\nnhap gia tri can chen : ");
		x=kb.nextInt();
		System.out.print("nhap vi tri can chen : ");
		y=kb.nextInt();
		int n=a.length;
		int b[]=new int[n+1];
		for(int i=0;i<y-1;i++)
		{
			b[i]=a[i];
		}
		b[y-1]=x;
		for(int i=y;i<b.length;i++)
		{
			b[i]=a[i-1];
		}
		a=b;
	}
	void xoa()
	{
		int x;
		Scanner kb=new Scanner(System.in);
		System.out.print("\nNhap vi tri can xoa : ");
		x=kb.nextInt();
		int n=a.length;
		int b[]=new int[n-1];
		for(int i=0;i<x-1;i++)
		{
			b[i]=a[i];
		}
		for(int i=x-1;i<b.length;i++)
		{
			b[i]=a[i+1];
		}
		a=b;
	}
	public static void main(String[] args)
	{
		int x;
		bai1 m= new bai1();
		m.nhap();
		System.out.println("\nNoi dung mang:");
		m.in();
		System.out.println("\nTong cac so trong mang la:" +m.tong());
		m.max(); 
		m.dao();
	System.out.print("\nMang sau khi dso nguoc : ");m.in();
		if(m.tang()) System.out.println("\nMang tang dan");
		else System.out.println("\nMang khong tang dan");
	Scanner kb=new Scanner(System.in);
		System.out.println("\nNhap x :");
		x=kb.nextInt();
		if(m.timx(x)==1) System.out.println("yes");
		else System.out.println("no");
		m.chen();
		System.out.print("\nMang sau khi chen : ");
		m.in();
//		m.xoa();
//		System.out.print("\nMang sau khi xoa :" );
//		m.in();
// khánh đẹp Trai
// khánh đẹp Trai





	}
}
