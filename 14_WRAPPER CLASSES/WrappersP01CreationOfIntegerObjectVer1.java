import java.lang.Integer; 
 
class WrappersP01CreationOfIntegerObjectVer1
{
    public static void main(String[ ] args)
     { 
       //Integer  intObjRefVar1= new Integer(); 
       int age=23;
	   Integer  intObjRefVar1= new Integer(age);
	   System.out.println("AGE="+intObjRefVar1);
	   
	   Integer  ageObj= new Integer("23");
	   System.out.println("AGE="+ageObj);
        
      }
}

