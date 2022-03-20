package march16_oops2;


class Animal3 
	{
		 int legs ;
		 int mouth ;
		 int tail ;

		 public void eat() 
		 {
			System.out.println("I eat");
		}

		 public void walk() 
		 {
			System.out.println("I walk");
		}
		 Animal3()
		 {
			 
		 }
		 Animal3(int legs)
		 {
			 this.legs = legs;
		 }
		 Animal3(int legs, int mouth, int tail)
		 {
			 this.legs = legs;
			 this.mouth = mouth;
			 this.tail = tail;
		 }
		
	}
public class March16_Animals_constructor {
	public static void main(String agd[])
	{
		Animal3 A1 = new Animal3();
		System.out.println(A1.legs);
		
		
		Animal3 A2 = new Animal3(4);
		System.out.println("usually animals have "+A2.legs+"legs");
		
		
		Animal3 A3 = new Animal3(4, 1, 1);
		System.out.println("usually animals have "+A2.legs+" legs");
		System.out.println("usually animals have "+A3.mouth+" mouth");
		System.out.println("usually animals have "+A3.tail+" tail");
	}

}
