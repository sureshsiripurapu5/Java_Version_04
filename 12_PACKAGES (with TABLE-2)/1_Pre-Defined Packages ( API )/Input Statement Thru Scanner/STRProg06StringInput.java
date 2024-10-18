import java.util.*;
class STRProg06StringInput 
{
  public static void main(String[] x)
  {  
    Scanner scnrObj=new Scanner(System.in);       
    
       //CORRECT  sequence
    
    System.out.print("Enter your Address(with spaces):-");
        String  addr=scnrObj.nextLine(); //receives sentence
    
    System.out.println("Enter your Name?");
        String  name=scnrObj.next(); //receives only a word   
    
     System.out.println("NAME:"+name);   
     System.out.println("ADDRESS:-\n"+addr);   

  }

}