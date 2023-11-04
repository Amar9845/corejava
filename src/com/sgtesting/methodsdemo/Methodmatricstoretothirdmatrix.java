package com.sgtesting.methodsdemo;
class  Mtrixtomatrix
{
	void   Mtrixtomatrix (int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int c[][]=new int [a.length][a[0].length];
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
}

public class Methodmatricstoretothirdmatrix {

	public static void main(String[] args) {
		int u[][]= {{1,2,3},{4,5,6}};
		int v[][]= {{1,4,7},{2,5,8}};
		  Mtrixtomatrix obj1=new Mtrixtomatrix();
		  obj1.Mtrixtomatrix(u,v);

	}
	
}
