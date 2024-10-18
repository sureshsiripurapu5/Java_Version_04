class MyClass   
{
    static int x=333 ; // stored under className.
    void ToShowStaticVarValue()  // need an object to store this method
	     {
		  System.out.println("static x = " + MyClass.x); 
		  System.out.println("static x = " + x); // also OK
		 
		 }
   
}                       

class StaticVariablesP02AccessFromInsideTheClassVer2
{
   public static void main(String[] args)
   {     
        MyClass obj=new MyClass();
		        obj.ToShowStaticVarValue() ;
   }
}   