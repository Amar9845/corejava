package packagecom.sgtesting.inheritance;
//ex for multilevel Inheritance demo 

class multidemox
{
	void person(String pname)
	{
		System.out.println("Person Name:"+pname);
	}
}
class demoy extends multidemox
{
	void place(String cityname)
	{
	     System.out.println("City name:"+cityname);	
	}
}
class demoz extends demoy
{
	void job(String jobname)
	{
		System.out.println("Person job:"+jobname);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		 demoz obj=new demoz();
		    obj.person("Amar");
		    obj.place("Bangalore");
		    obj.job("Engineer");


	}

}
