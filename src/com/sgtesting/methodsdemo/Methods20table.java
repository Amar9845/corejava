package com.sgtesting.methodsdemo;
class Twentytable
{
	void Twentytable (int n)
	{
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("***********");
		}
	}
}
public class Methods20table {

	public static void main(String[] args) {
		Twentytable obj1=new Twentytable();
		obj1.Twentytable(20);
		

	}

}
