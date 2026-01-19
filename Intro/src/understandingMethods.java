
public class understandingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To access the method:
		// first is to create the object 
		understandingMethods get = new understandingMethods();
		//use the variable of that object and get the method name
		//to get the return value create another object 
		int num = get.getData();
		System.out.println(num);
		
		//to access the understandingMethods2 class 
		//create an object named understandingMethods2
		understandingMethods2 getNum = new understandingMethods2();
		System.out.print(getNum.getNumData());
		
		
		getData2();//using static void 
		
		understandingMethods2 getName = new understandingMethods2();
		System.out.print(getName.getStringData());
	

	}
	//Resue lines of code by wrapping it in this method
	//add static to access self class without creating an object
	public int getData() 
	{
		System.out.println("i am a method");
		System.out.println("groot");
		return 100; 
	}
	
	public static void getData2() 
	{
		System.out.println("\nNo need to have an object");
		
		
	}
	

}
