package march18_debugging;
 class Candy
{
    public String taste()
    {
        return "tastes sweet!";
    }   
}
 
class Chocolate extends Candy
{
    public String taste()
    {
    	return "tastes chocolately";
    	}
}
public class March18_override_candy_chocolate {
	public static void main(String args[])
	{
	    Candy c1 = new Candy();
	    System.out.println(c1.taste());
	    Candy c2 = new Chocolate();
	    System.out.println(c2.taste());
	}    
}




