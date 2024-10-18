class MyClass   
{
    static int x ; // stored under className.
    
    // NO method(s)	
}                       

class StaticVariablesP01AccessFromOutsideTheClassVer1
{
   public static void main(String[] args)
   {     // NO object , NOT NEEDED
         //int x; // DON'T TRY SUCH THINGS
        System.out.println("static x = " + MyClass.x);
   }
}   