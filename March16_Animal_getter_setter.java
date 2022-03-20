package march16_oops2;

class Animal {
 int legs;
 int mouth;
 int tail;
 int speed;

	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getMouth() {
		return mouth;
	}
	
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	
	public int getTail() {
		return tail;
	}
	
	public void setTail(int tail) {
		this.tail = tail;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
 }
 

public class March16_Animal_getter_setter {

 public static void main(String[] args) {
	 Animal a = new Animal();
	 a.setLegs(4);
	 a.setMouth(1);
	 a.setTail(1);
	 a.setSpeed(10);
	 System.out.println(a.getLegs() );
	 System.out.println(a.getMouth());
	 System.out.println(a.getTail());
	 System.out.println(a.getSpeed());
	 
 }
  
 }




