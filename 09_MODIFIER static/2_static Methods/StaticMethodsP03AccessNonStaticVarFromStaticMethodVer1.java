class MyClass
{
      int i;   // NON-STATIC needs obj to store

    static void myStaticMethod() 
    {
        System.out.println("From static method i = "+ i );
    }
}                       
class StaticMethodsP03AccessNonStaticVarFromStaticMethodVer1
{
    public static void main(String[] args)
    {
         MyClass.myStaticMethod();     
    }
}   