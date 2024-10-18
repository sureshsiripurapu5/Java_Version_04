//tO sHOW Members Access FROM SAME CLASS
class A
{
              int   defVar;  //  field:default access	
	public    int   pubVar;	  
	protected int   protVar;	  
	private   int   pvtVar;	
}

class INHRTP03ToShowAccessfromOtherClassVer2  // other class wrt A
{
	
	public static void main(String args[])
	{
	    A aObj=new A();
		System.out.println("Accessed: assigned from other class:");
		   aObj.defVar=1;
		   aObj.pubVar=2;
		   aObj.protVar=3;
		   //aObj.pvtVar=4;
		System.out.println("Accessed: displayed from other class:"); 	
		System.out.println(""+aObj.defVar+aObj.pubVar+aObj.protVar);
		   //System.out.println(aObj.pvtVar);
	 	
			
	}
}