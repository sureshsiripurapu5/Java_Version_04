class A 
{
			    int fieldDef;  //default ACCESS
	public		int fieldPub;
	protected	int fieldProt;
	private		int fieldPvt;	
			void storeDataToPvtField(int x)
				 { 
				   fieldPvt=x;
				 }
			void showDataToPvtField()
				 { 
				   System.out.println("fieldPvt = " + fieldPvt);
				 }	

}	
	
class INHRTP11SingleWithMethodsSetterGetterVer2FromOtherClass
{
    public static void main(String[ ] args)
    {
                
	    A obj=new A();
		
		  obj.fieldDef=1;  //default ACCESS
		  obj.fieldPub=2;
		  obj.fieldProt=3;
		  //obj.fieldPvt=4;  // can not acces by others
		  obj.storeDataToPvtField(4);
		System.out.println("fieldDef = " +  obj.fieldDef);               
		System.out.println("fieldPub = " +  obj.fieldPub);
		System.out.println("fieldProt = "+  obj.fieldProt);
		//System.out.println("fieldPvt = " +  obj.fieldPvt); // can not acces by others
		 obj.showDataToPvtField();
	}
}   

      