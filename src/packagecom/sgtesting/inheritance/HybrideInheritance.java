package packagecom.sgtesting.inheritance;
//Hybrid Inheritance Demo

class passenger
{
	void psgr(int noofpsngr)
	{
		System.out.println("No of Passangers:"+noofpsngr);
	}
}
class place extends passenger
{
	void place(String plce)
	{
		System.out.println("city name :"+plce);
	}
}
class travelotpn1 extends place
{
	void trvloptn(String toptn)
	{
		System.out.println("Travel option 1:"+toptn);
	}
}
class traveloptn2 extends passenger
{
	void trvlopt2(String trvt2)
	{
		System.out.println("Travel option 2:"+trvt2);
	}
}

public class HybrideInheritance {

	public static void main(String[] args) {

		travelotpn1 v=new travelotpn1();
		v.psgr(500000);
		v.place("Bangalore");
		v.trvloptn("Metro");
		
		traveloptn2 g=new traveloptn2();
		g.psgr(300000);
		g.trvlopt2("BUS");

	}

}
