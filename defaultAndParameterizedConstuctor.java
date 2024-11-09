class Human
{
	private int age;
	private String name;
	
	public Human() //Default Constructor
	{
		age=12;
		name="John";
        System.out.println("This is the Default Constructor");
	}
	public Human(String name) {  // paramerterized constructor 
		this.age=age;
		this.name=name;
	}
	public Human(int age, String name)  // Parameterized constructor 
	{
		this.age=age;
		this.name=name;
        System.out.println("This is paramterized Constructor");
	}
	
	
//	public Human()    //default constructor
//	{
//		age=12;
//		name="John";
//		//System.out.println("in constructor");
//	}
//	public Human(int a, String n)  //Parameterized constructor
//	{
//		age=a;
//		name=n;
//	}
	
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class defaultAndParameterizedConstuctor {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
//		Human obj1=new Human(18, "Navin");
		System.out.println(obj.getName()+" : "+obj.getAge());
//		System.out.println(obj1.getName()+" : "+obj1.getAge());
		
//		obj.SetAge(30);
//		obj.setName("Reddy");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}