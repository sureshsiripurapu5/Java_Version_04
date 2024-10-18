class MyClass
{
    // No fields Here

     static void myStaticMethod() 
              {
                myOtherStaticMethod();
              }
			  
	  static void myOtherStaticMethod() 
      {
         System.out.println("from static myOtherStaticMethod() Executed"); 
      }		  
}                       
class StaticMethodsP02AccessFromInsideTheClassVer1 
{
    public static void main(String[] args)
    {
        MyClass.myStaticMethod();     
    }
}   