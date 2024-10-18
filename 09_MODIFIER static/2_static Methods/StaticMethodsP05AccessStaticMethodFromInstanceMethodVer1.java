class MyClass
{
 static void staticMethod() 
        {
         System.out.println("staticMethod() executed");
        }
        void instanceMethod() 
        {
           staticMethod();
        }
}                       
class StaticMethodsP05AccessStaticMethodFromInstanceMethodVer1
{
    public static void main(String[] args)
    {
        MyClass obj=new MyClass();
                obj.instanceMethod();	  
    }
}   