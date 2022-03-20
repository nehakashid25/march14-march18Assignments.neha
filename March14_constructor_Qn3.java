package march14_oops1;
class CarTruck
{
	String name;
	String model;
	int avg;
	int warrentyYears;
	String cost;
	
	CarTruck(String name, String model, int avg, int warrentyYears, String cost)
	{
		this.name = "car";
		this.model = "mercedes";
		this.avg = 40;
		this.warrentyYears = 8;
		this.cost = "1 crore";
	}
	CarTruck(String name
			
			, int avg, int warrentyYears, String cost)
	{
		this.name = "truck";
		this.avg = 60;
		this.warrentyYears = 6;
		this.cost = "4 Lack";
	}
	
	public String toString()

	{
		return ("Name of vehicle::"+this.name+"\n"+"Name of model::"+this.model+"\n"+"avarage km per hr::"+this.avg+"\n"+"warrenty in years::"
	+this.warrentyYears+"\n"+"cost of vehicle::"+this.cost);
	}
}
public class March14_constructor_Qn3 {
	
	public static void main(String args[])
	{
		CarTruck v1 = new CarTruck("","",30, 5,"");
		CarTruck v2 = new CarTruck("",0,0,"");
		 
		System.out.println(v1);
		System.out.println();
		System.out.println(v2);
	}

}




