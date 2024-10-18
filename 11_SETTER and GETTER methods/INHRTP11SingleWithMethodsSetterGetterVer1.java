class A 
{
			    int fieldDef;  //default ACCESS
	public		int fieldPub;
	protected	int fieldProt;
	private		int fieldPvt;	
				void methodToStoreVals()  // default access
				{
				fieldDef=1;  //default ACCESS
				fieldPub=2;
				fieldProt=3;
				fieldPvt=4;
				}
				void methodToShowVals()
				{
                System.out.println("fieldDef = " + fieldDef);               
			    System.out.println("fieldPub = " + fieldPub);
			    System.out.println("fieldProt = " + fieldProt);
			    System.out.println("fieldPvt = " + fieldPvt);
			   }
	

}	
	
class INHRTP11SingleWithMethodsSetterGetterVer1
{
    public static void main(String[ ] args)
    {
                
	    A obj=new A();
		  obj.methodToStoreVals();
		  obj.methodToShowVals();
		  
	}
}   

      