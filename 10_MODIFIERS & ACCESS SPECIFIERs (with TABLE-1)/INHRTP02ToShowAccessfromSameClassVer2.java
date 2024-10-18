//tO sHOW Members Access FROM SAME CLASS
class INHRTP02ToShowAccessfromSameClassVer2
{
	
              int   defVar;  //  field:default access	
	public    int   pubVar;	  
	protected int   protVar;	  
	private   int   pvtVar;	
	
	
	public static void main(String args[])
	{
	    INHRTP02ToShowAccessfromSameClassVer2	aObj=new INHRTP02ToShowAccessfromSameClassVer2();
		System.out.println("Accessed: assigned from same class:");   
		    aObj.defVar=1;
			aObj.pubVar=2;
			aObj.protVar=3;
			aObj.pvtVar=4;
		System.out.println("Accessed: displayed from same class:"); 	
		System.out.println(""+aObj.defVar+aObj.pubVar+aObj.protVar+aObj.pvtVar);	
			
	}
}