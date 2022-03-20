package march17_oops_polymorphism;
abstract class Book{
    String title;
    
    abstract void setTitle(String title);
    
    String getTitle(){
        return title;
    }
}
class Mybook extends Book
{
	void  setTitle(String title)
	{
		this.title = title;
	}
}

public class March17_Qn3rd {
	public static void main(String args[])
	{
		Mybook b = new Mybook();
		b.setTitle("A tale of two cities");
		System.out.print("the title is:"+b.getTitle());
		
	}

}
