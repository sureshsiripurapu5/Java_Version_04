import mainpackage.A; //from other package
class B 
{
    
    void   testAccess()  // test Non-sub class accessibility
           {
              A aObj=new A();  //need to  create object 

               aObj.defaf=1;  //Not OK
               aObj.pubaf=2;  //OK
               aObj.pvtaf=3;  //Not OK
               aObj.protaf=4; //Not OK
            }

}

class TestPackageNonSubClassAccess 
{
  public static void main(String args[])
  {
    
              B bObj=new B(); //need to call B class method  
                bObj.testAccess();
  }
}
            



     





