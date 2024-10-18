class A 
{
			    int fieldDef;  //default ACCESS
	public		int fieldPub;
	protected	int fieldProt;
	private		int fieldPvt;	
			void setFieldPvt(int x)
				 { 
				   fieldPvt=x;
				 }
			int  getFieldPvt()
				 { 
				   return fieldPvt;
				 }	

}	
	
class INHRTP11SingleWithMethodsSetterGetterVer3
{
    public static void main(String[ ] args)
    {
                
	    A obj=new A();
		
		  obj.fieldDef=1;  //default ACCESS
		  obj.fieldPub=2;
		  obj.fieldProt=3;
		  
		System.out.println("fieldDef = " +  obj.fieldDef);               
		System.out.println("fieldPub = " +  obj.fieldPub);
		System.out.println("fieldProt = "+  obj.fieldProt);
		
		  obj.setFieldPvt(4);
		  
		    int r=obj.getFieldPvt();
		    System.out.println("fieldPvt = " + r);
		  // OR
		  //System.out.println("fieldPvt = " + obj.getFieldPvt());
		  
	}
}   

      