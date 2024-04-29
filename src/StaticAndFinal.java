

/*
 * The code below is to understand the concept of Static and Final keywords.
 * 
 *Static is a key word used to make a variable or method to be accessed with out creating an object
 *Simply this can be referred to as the variable or method related to class and not instance
 *
 *
 *Final is used when we want a variable to be a constant and immutable
 */


class Obj {
	
	public final static int LUCKY_NUMBER = 7;               // Here Final is used so the value cannot be changed. And it is good practice to name final variables in capital case
	public String name;
	public String description;
	public static String property;      // Here the variable property is declared as static variable 
	
	public static void staticMethod() {                            //Here the method is created as static method
		System.out.println("This is a static method");
	}
	public static void staticMethod2() {                            //Here the method is created as static method
		System.out.println("can access static variables only " + property);
	}
	public void staticMethod3() {                            //Here the method is created as static method
		System.out.println("Non static method can access both static and non static variables" + "/n");
		System.out.println(name + ":" + property);
	}
	public void method1() {
		System.out.println("This is method1");
	}
	
	public static void method2() {
		System.out.println("This is method2");
	}
	
}







public class StaticAndFinal {
	public static void main(String[] args){
		
		System.out.println(Obj.LUCKY_NUMBER);
		
		
		
		Obj.property = "This is static variable property";
		
		System.out.println(Obj.property);            //This is to show that the static variables can be accessed with out creating an instance of class i.e object
		
		Obj.staticMethod();                 //This is to show that the static methods can be accessed with out creating an instance of class i.e object
		
		
	
		Obj.staticMethod2();
		
		Obj obj1 = new Obj();
		Obj obj2 = new Obj();
		
		obj1.name = "object1";
		obj2.name = "object2";
		obj1.description = "This is object1";
		obj2.description = "This is object2";
		
		obj1.staticMethod3();
		
		System.out.println( obj1.name + " : " + obj1.description);
		System.out.println( obj2.name + " : " + obj2.description);
		
	}

}
