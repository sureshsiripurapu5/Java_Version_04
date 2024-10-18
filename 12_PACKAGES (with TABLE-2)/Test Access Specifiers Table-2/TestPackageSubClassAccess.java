import mainpackage.A; //from other package
class B extends A
{
 
    
    void   testAccess()  // test sub class accessibility
           {
             
               defaf=1;  //Not OK
               pubaf=2;  //OK
               pvtaf=3;  //Not OK
               protaf=4; //OK
            }

}

class TestPackageSubClassAccess 
{
  public static void main(String args[])
  {
    
              B bObj=new B(); //need to call B class method  
                bObj.testAccess();
  }
}
            



     





