class A
{
            int  defaf;
  public    int  pubaf;
  private   int  pvtaf;
  protected int  protaf;
   
    void   testAccess()  // test same class accessibility
           {
               defaf=1;  //OK
               pubaf=2;  //OK
               pvtaf=3;  //OK
               protaf=4; //OK
            }

}

class TestSameClassAccess
{

  public static void main(String args[])
  {
    A aObj = new A();
      aObj.testAccess();
    
    

    
  }
}
            



     





