class MyClass
{
    static int i;

    static void myStaticMethod() 
    {
        System.out.println("From static method static i = "+ i );
    }
}                       
class StaticMethodsP02AccessStaticVarFromStaticMethodVer1
{
    public static void main(String[] args)
    {
         MyClass.myStaticMethod();     
    }
}   