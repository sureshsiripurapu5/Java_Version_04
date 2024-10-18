class MyClass   
{
    static int    x ,z=3;  // stored under className.
	static double y;   // ALSO stored under className.
    
    // NO method(s)	
}                       

class StaticVariablesP01AccessFromOutsideTheClassVer2
{
   public static void main(String[] args)
   { 
       System.out.println("static x = " + MyClass.x);
	   MyClass.y=1.1;
	   System.out.println("static y = " + MyClass.y);
	   System.out.println("static z = " + MyClass.z);
   }
}   