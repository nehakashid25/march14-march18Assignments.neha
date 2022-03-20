package march18_debugging;
public class March18_overload_talk {

    public static void talk()
    {
        System.out.print("hello! ");
    }

    public static void talk(String name)
    {
    	System.out.print("Matthew");
    }

    public static void main(String[] args)
    {
    	  talk();
          talk("Matthew");
    }
}



