package march17_oops_polymorphism;

class Dog
{
	 public void speak()
	    {
	        System.out.println("woof!");
	    }
	   
	}

	class Beagle extends Dog
	{
	      public void speak()
	    {
	        System.out.println("arf arf");
	    }
	
}
public class March17_1stQn
{
	 public static void main(String[] args)
	    {
	        Dog d = new Dog();
	        d.speak();
	        Dog b = new Beagle();
	        b.speak();
	    }
}

   



