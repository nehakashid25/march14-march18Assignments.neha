package march17_oops_polymorphism;

 class Dog1
{
    private String name;

    public Dog1(String name)
    {
        this.name = name;
    }

    public boolean equals(String name)
    {
         if(name == name)
         {
        	 return true;
         }
         else
         {
        	 return false;
         }
    }

    
}


public class March17_Qn2nd {
	public static void main(String[] args)
    {
        Dog1 d1 = new Dog1("Rufus");
        Dog1 d2 = new Dog1("Sally");
        Dog1 d3 = new Dog1("Rufus");
        Dog1 d4 = new Dog1("Rufus");
        d1 = d2;
        d2 = d3;
        d1 = d3;
        d3 = d4;
           
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d2));
        System.out.println(d3.equals(d4));
        
    }

}
