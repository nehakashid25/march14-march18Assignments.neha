package march16_oops2;
class Animal2 
{
	 int legs =4;
	 int mouth = 1;

	 public void eat() 
	 {
		  System.out.println("I eat");
	}

	 public void walk() 
	 {
		  System.out.println("I walk");
	 }
	 public void tail()
	 {
		 System.out.println("I have 1 tail");
	 }
}
public class March16_Animal_var_and_method {
	 public static void main(String args[])
	 {
		 Animal2 a = new Animal2();
		 a.eat();
		 a.walk();
		 a.tail();
		 System.out.println("usually animal have"+a.legs+"legs");
		 System.out.println("usually animal have"+a.mouth+"mouth");		 
	 }
}
