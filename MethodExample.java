//Example 1 on methods which is implemented without passing parameters
class MethodExample 
{
	//instance method
	void m1(){------//no return type and no parameters
		//instance area
		System.out.println("Instance method");
	}
	//static method
	static void m2(){------//no return type and no parameters
		//static area
		System.out.println("Static method");
	}
	//static method
	public static void main(String[] args) 
	{
		//static area
		MethodExample m=new MethodExample();
		m.m1();
		MethodExample.m2();
		System.out.println("main method");
	}
}
