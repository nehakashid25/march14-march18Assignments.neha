package march14_oops1;


class vehicles
{
	String name;
	String model;
	int avg;
	int warrentyYears;
	String cost;
	
}
public class March14_vehicles {
	public static void main(String argd[])
	{
		vehicles v1 = new vehicles();
		v1.name = "car";
		v1.model = "mercedes";
		v1.avg = 40;
		v1.warrentyYears = 8;
		v1.cost = "1 crore";
		
		System.out.println("Name of vehicle::"+v1.name);
		System.out.println("Name of model::"+v1.model);
		System.out.println("avarage km per hr::"+v1.avg);
		System.out.println("warrenty in years::"+v1.warrentyYears);
		System.out.println("cost of vehicle::"+v1.cost);
		System.out.println();
		
		vehicles v2 = new vehicles();
		v2.name = "bike";
		v2.model = "Apache";
		v2.avg = 60;
		v2.warrentyYears = 5;
		v2.cost = "1 Lack";
		
		System.out.println("Name of vehicle::"+v2.name);
		System.out.println("Name of model::"+v2.model);
		System.out.println("avarage km per hr::"+v2.avg);
		System.out.println("warrenty in years::"+v2.warrentyYears);
		System.out.println("cost of vehicle::"+v2.cost);
		System.out.println();
		
		vehicles v3 = new vehicles();
		v3.name = "truck";
		v3.avg = 60;
		v3.warrentyYears = 6;
		v3.cost = "4 Lack";
		
		System.out.println("Name of vehicle::"+v3.name);
		System.out.println("avarage km per hr::"+v3.avg);
		System.out.println("warrenty in years::"+v3.warrentyYears);
		System.out.println("cost of vehicle::"+v3.cost);
	
	}

}
