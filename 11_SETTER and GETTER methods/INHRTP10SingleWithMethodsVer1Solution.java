class A 
{
			  
			  void methodDef()  // default access
		      {
               System.out.println("DEFAULT access method Executed");
              }
	public	  void methodPub()
		      {
                System.out.println("PUBLIC access method Executed");
               }
	protected void methodProt()
		      {
               System.out.println("PROTECTED access method Executed");
              }
	private   void methodPvt()
		      {
               System.out.println("PRIVATE access method Executed");
              }
	public     void getMethodPvt()
			   {
				methodPvt();  
	           }

}	
	
class INHRTP10SingleWithMethodsVer1Solution
{
    public static void main(String[ ] args)
    {
                // methodDef();  //ERROR bcz object NOT taken
	    A obj=new A();
		  obj.methodDef();
		  obj.methodPub();
		  obj.methodProt();
		  //obj.methodPvt();  / can not access
	      obj.getMethodPvt();
	}
}   

      