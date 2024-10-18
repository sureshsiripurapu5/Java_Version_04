//tO sHOW Members Access FROM SAME CLASS
class A
{
              int   defVar;  //  field:default access	
	public    int   pubVar;	  
	protected int   protVar;	  
	private   int   pvtVar;	  
              void  method()  // method:default access
			        {
						System.out.println("from same class:");
						defVar = 1;
						pubVar = 2;
						protVar= 3;
						pvtVar = 4; // can access private variable also
						System.out.println(""+defVar+pubVar+protVar+pvtVar);
				    }
			  	
  	 
}

class INHRTP02ToShowAccessfromSameClassVer1
{
	public static void main(String args[])
	{
	    A	aObj=new A();
		    aObj.method();
	
	}
}