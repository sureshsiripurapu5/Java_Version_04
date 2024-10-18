class WrappersP01AccessingMethodOfIntegerObjectVer1
{
    public static void main(String[ ] args)
    { 
       String strObj="23";
	   Integer  ageObj= Integer.valueOf(strObj);
	   System.out.println("AGE="+ageObj);
	   System.out.println("By next Year my AGE="+(ageObj+1));
	   
	   String myStrAgeObj="49";
	   int age=Integer.parseInt(myStrAgeObj);
	   System.out.println("By next Year my AGE="+(age+1));
	}
}

