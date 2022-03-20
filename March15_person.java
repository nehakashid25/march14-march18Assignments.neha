package march15_oops;

public class March15_person
	{
		// fields
		private String name;
		private String email;
		private String phoneNumber;

		// constructor
		public March15_person(String theName)
		{
		this.name = theName;
		}
		
		public March15_person(String theName, String email)
		{
		this.name = theName;
		this.email = email;
		}
		public March15_person(String theName, String email, String phoneNumber)
		{
		this.name = theName;
		this.email = email;
		}


		// methods - getters
		public String getName() { return this.name;}
		public String getEmail() { return this.email;}
		public String getPhoneNumber() { return this.phoneNumber;}

		// methods - setters
		public void setName(String theName) { this.name = theName;}
		public void setEmail(String theEmail) {this.email = theEmail;}
		public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
		public String toString()
		{
		return this.name + " " + this.email + " " + this.phoneNumber;
		}

		// main method for testing
		public static void main(String[] args)
		{
			March15_person p1 = new March15_person("Sana","sana123@gmail.com");
			System.out.println(p1);
			March15_person p2 = new March15_person("Jean");
			p2.setEmail("jean@gmail.com");
			p2.setPhoneNumber("404 899-9955");
			System.out.println(p2);
			March15_person p3 = new March15_person("neha", "kashidneha1999@gmail.com","7620306585");
			System.out.println(p3);
			
		}
		


}
