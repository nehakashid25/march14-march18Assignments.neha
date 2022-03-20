package march15_oops;

public class March15_coins {
 
	private static int HEADS = 1;
	private static int TAILS = 0;
 
	private int value = 0;
 
	public void flip()
	{
	if (Math.random() < 0.5)
	{
	value = 0;
	}
	else
	{
	value = 1;
	}
	}
 
	public boolean isTail()
	{
		return value ==TAILS;
	} 
	public String toString()
	{
	if (value == TAILS) return "Tails";
	else return "heads";
	}
	public static void main(String[] args)
	{

	March15_coins myCoin = new  March15_coins();
	for (int i = 0; i < 10; i++)
	{
	myCoin.flip();
	System.out.println(myCoin);
	System.out.println(myCoin.isTail());
	}
	}
	


}
