package march16_oops2;
class Animal1 
{
	 int legs =4;
	 int mouth = 1;
	 int tail = 1;
	 int speeddog = 20;
	 int speedcow = 5;
	 int speedele = 3;

	 public void eat() {
		  System.out.println("I eat");
		 }

		 public void walk() {
		  System.out.println("I walk");
		 }
}
class Dog1 extends Animal1 
{
	 String bark;

	 public void bark() {
	  System.out.println("Dog bark");
	 }
}
class Cow1 extends Animal1{
	 String milk;
	 public static void milk()
	 {
		 System.out.println("i give milk 5 lit per day");
	 }
}

class elephant extends Animal1{
	 String trunk;
	 String weight;
	 public static void trunk()
	 {
		 System.out.println("I have 1 trunk");
	 }
	 public static void weight()
	 {
		 System.out.println("my weight is 500kg");
	 }	  
}

public class March16_Animal1_with_different_child_class {
	
	public static void main(String agr[])
	{
		System.out.println("--------------Animal------------");
		  Animal1 a1 = new Animal1( );
		  a1.eat();
		  a1.walk();
		  System.out.println("legs of animals are usually "+a1.legs );
		  System.out.println("speed of animals are usually "+a1.speeddog+"km/hr");
		  System.out.println("--------------Dog---------------");
		  Dog1 d1 = new Dog1();
		  d1.bark();
		  d1.eat();
		  d1.walk();
		  System.out.println("legs of dogs are "+d1.legs);
		  System.out.println("speed of dogs is "+d1.speeddog+"km/hr");
		  System.out.println("--------------Cow--------------");
		  Cow1 c1 = new Cow1();
		  c1.eat();
		  c1.walk();
		  c1.milk();
		  System.out.println("legs of cow are "+c1.legs);
		  System.out.println("speed of cow is "+c1.speedcow+"km/hr");
		  System.out.println("--------------elephant---------------");
		  elephant e1 = new elephant();
		  e1.eat();
		  e1.walk();
		  e1.trunk();
		  e1.weight();
		  System.out.println("legs of elephant are "+e1.legs);
		  System.out.println("speed of elephant is "+e1.speedele+" km/hr");
	}

}
