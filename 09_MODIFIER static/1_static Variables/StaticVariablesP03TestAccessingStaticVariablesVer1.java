class A
{
    void storeAndShow()
         {
           // can we declare static variables in METHODS?? (non-static)
          static int  a;     
         System.out.println("method's static variable  a : "+a);
         }
                             
}                       

class StaticVariablesP03TestAccessingStaticVariablesVer1 
{
   public static void main(String[] args)
   {
	   static int x;
        A aObj=new A();    
          aObj.storeAndShow();
      
  }
}   