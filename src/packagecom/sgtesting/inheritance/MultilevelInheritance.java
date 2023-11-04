package packagecom.sgtesting.inheritance;

//Write a program to achieve Multilevel inheritance in which super class contains parametrized constructor

class student
{
	String fname;
	student(String name)
	{
		this.fname=name;
		System.out.println("Student Name:"+name);
	}
}
class department extends student
{
	String bname;
	department(String name, String bname)
	{
		super("name");
		this.bname=bname;
		System.out.println("Department name:"+bname);
	}
}
class college extends department
{
	String clg;
	college(String name,String bname,String cname)
	{
		super("name","banme");
		this.clg=cname;
		System.out.println("College name:"+cname);
		
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		college obj=new college("Amar","Contractor","Patilgroup");

	}

}
