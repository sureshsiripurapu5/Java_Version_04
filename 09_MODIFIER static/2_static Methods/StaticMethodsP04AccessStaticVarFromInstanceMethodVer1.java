class MyClass
{
      static int stVar;    

    void instanceMethod() 
    {
     System.out.println("From instance Method stVar = "+ stVar );
    }
}                       
class StaticMethodsP04AccessStaticVarFromInstanceMethodVer1
{
    public static void main(String[] args)
    {
        MyClass obj=new MyClass();
                obj.instanceMethod();	  
    }
}   