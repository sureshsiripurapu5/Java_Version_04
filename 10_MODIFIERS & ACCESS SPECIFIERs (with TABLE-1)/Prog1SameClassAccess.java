// same program file / same package
class A
{
                         int  defField;  // default access behaviour
      public         int  pubField;
      private        int  pvtField;
      protected   int  protField;

    void   testAccess()     // test same class accessibility
              {
                  defField=1;          //OK for default
                  pubField=2;        //OK  for public 
                  protField=3;       //OK  for protected
                  pvtField=4;         //OK  for private
            }
}

class Prog1SameClassAccess  // othr class of same file/package
{
    public static void main(String args[])
   {
       A   aObj = new A();
             aObj.testAccess(); // method call
    }
}
            



     





