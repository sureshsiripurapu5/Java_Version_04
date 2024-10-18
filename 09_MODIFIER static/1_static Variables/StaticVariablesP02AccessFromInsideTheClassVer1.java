class MyClass   
{
    static int x ; // stored under className.
    void ToShowStaticVarValue()  
	     {
		  System.out.println("static x = " + MyClass.x);
		 }
   
}                       

class StaticVariablesP02AccessFromInsideTheClassVer1
{
   public static void main(String[] args)
   {     
        MyClass.ToShowStaticVarValue() ;
   }
}   