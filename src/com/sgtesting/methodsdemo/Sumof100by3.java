package com.sgtesting.methodsdemo;
class Sumandby3
{
	void Sumandby3 (int num)
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				sum=sum+1;
			}
		}
				System.out.println("#sum of first 100 number divisible by 3:"+sum); 
	}
	
}
public class Sumof100by3 {

	public static void main(String[] args) {
		Sumandby3 obj1=new Sumandby3();
		obj1.Sumandby3(1);

	}

}
