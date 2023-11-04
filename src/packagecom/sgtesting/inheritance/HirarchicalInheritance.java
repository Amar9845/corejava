package packagecom.sgtesting.inheritance;
//Hierarchical inheritance Demo

class Travel
{
	void place(String place)
	{
		System.out.println("Travel Destination:"+place);
	}
}
class distance extends Travel
{
	void dist(int km)
	{
		System.out.println("Distance of travel Destination :"+km);
	}
}

class vehicle extends Travel
{
	void vehcl(String vhcl)
	{
		System.out.println("Travelling by vehicle :"+vhcl);
	}
}
public class HirarchicalInheritance {

	public static void main(String[] args) {
		distance v=new distance();
		v.place("kalaburagi");
		v.dist(550);
		
		
		vehicle k=new vehicle();
		k.vehcl("car");
		k.place("kalaburagi");
	}

}
