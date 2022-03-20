package march14_oops1;

class vehicle
{
	String name;
	String model;
	int avg;
	String cost;
	
	vehicle()
	{
		this.name = "car1";
		this.model = "lamborghini";
		this.avg = 20;
		this.cost="2 crores";
	}
	
	public String getname()
	{
		return this.name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getmodel()
	{
		return this.model;
	}
	public void setmodel(String model)
	{
		this.model= model;
	}
	public int getavg()
	{
		return this.avg;
	}
	public void setavg(int avg)
	{
		this.avg=avg;
	}
	public String getcost()
	{
		return this.cost;
	}
	public void setcost(String cost)
	{
		this.cost=cost;
	}
	
}
public class March14_getter_setter {
	
	public static void main(String agr[])
	{
		vehicle v1 = new vehicle();
		
		v1.setname("car");
		v1.setmodel("mercedes");
		v1.setavg(15);
		v1.setcost("1 crores");
		
		System.out.println(v1.getname());
		System.out.println(v1.getmodel());
		System.out.println(v1.getavg());
		System.out.println(v1.getcost());
		System.out.println();
		
		vehicle v2 = new vehicle();
		
		v2.setname("bike");
		v2.setmodel("apache");
		v2.setavg(40);
		v2.setcost("1 lack");
		
		System.out.println(v2.getname());
		System.out.println(v2.getmodel());
		System.out.println(v2.getavg());
		System.out.println(v2.getcost());
		System.out.println();
		
		vehicle v3 = new vehicle();
		
		v3.setname("truck");
		v3.setmodel("mahindra");
		v3.setavg(40);
		v3.setcost("6 lack");
		
		System.out.println(v3.getname());
		System.out.println(v3.getmodel());
		System.out.println(v3.getavg());
		System.out.println(v3.getcost());
		
		
	}

}
