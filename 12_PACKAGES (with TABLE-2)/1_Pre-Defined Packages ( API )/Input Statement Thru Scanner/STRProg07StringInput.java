import java.util.*;
class STRProg07StringInput 
{
  public static void main(String[] x)
  {  
    Scanner scnrObj=new Scanner(System.in);       
    
       //CORRECT  sequence
    
    System.out.println("Enter your Name(with spaces)?");
        String  name=scnrObj.next();  
    
    System.out.println("Enter your Father's Name(with spaces)?");
        String  fname=scnrObj.next();  
    
     System.out.println("NAME:"+name);   
     System.out.println("FATHER'S NAME:"+fname);   

  }

}