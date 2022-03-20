package march16_oops2;

class person
{
	static int age=6;
	
	public void increamentage()
	{
		age = age+1;
		System.out.println(age);
	}
}

public class March16_age {
	
	public static void main(String ags[])
	{
		person s = new person();
		s.increamentage();
	}

}
