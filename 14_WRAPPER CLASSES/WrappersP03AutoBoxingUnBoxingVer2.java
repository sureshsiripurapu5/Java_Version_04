class WrappersP03AutoBoxingUnBoxingVer2
{
    public static void main(String[ ] args)
    { 
	   String strObj1="23";
	   //Logic-1
	   Integer  intObj1=new Integer(strObj1);  
	   System.out.println("value of intObj="+intObj1);
	   //Logic-2
	   String strObj2="44";
	   Integer intObj2=Integer.valueOf(strObj2);
	   System.out.println("value of intObj="+intObj2);  
	   // the above process can not be done using AutoBoxing  
		 
        String strObj3=intObj1.toString();   		 
		System.out.println("value of strObj3="+strObj3);  
		  
	   // the above process can not be done using AutoUnBoxing  
	}
}

 