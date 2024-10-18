class MyClass
{
    // No fields Here

  static void myMethod() 
              {
                System.out.println("static method: myMethod() Executed");
              }
}                       
class StaticMethodsP01AccessFromOutsideTheClassVer2
{
    public static void main(String[] args)
    {
        MyClass.myMethod();     
    }
}   