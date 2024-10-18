class WrappersP03AutoBoxingUnBoxingVer1
{
    public static void main(String[ ] args)
    { 
	   // Auto Boxing 
       String strObj="23";
	   Integer  intObj=strObj;  // FAILURE  
	   System.out.println("value of intObj="+intObj);
	   
	   // Auto UnBoxing
	   String   strObj=intObj;     // FAILURE
	   System.out.println("value as String="+strObj);
	}
}

 