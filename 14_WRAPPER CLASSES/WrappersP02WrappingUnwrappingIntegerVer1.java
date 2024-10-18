class WrappersP02WrappingUnwrappingIntegerVer1
{
    public static void main(String[ ] args)
    { 
	   // wrapping/Boxing==>primitive TO object
       int x=23;
	   Integer  intObj=new Integer(x);   
	   System.out.println("value of intObj="+intObj);
	
	   // unwrapping/unBoxing==>object TO primitive
	    int i=intObj.intValue();
		System.out.println("value of i="+i);
	}
}

 