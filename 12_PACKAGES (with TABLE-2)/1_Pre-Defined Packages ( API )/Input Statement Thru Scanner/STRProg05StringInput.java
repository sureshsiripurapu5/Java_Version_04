import java.util.*;
class STRProg05StringInput 
{
  public static void main(String[] x)
  {  
    Scanner scnrObj=new Scanner(System.in);       
    //ERROR sequence
    System.out.print("Enter your Name?");
    String  name=scnrObj.next(); //PVR Srinivas (PVR only taken)
    System.out.println("Enter your address:-");
     String  addr=scnrObj.nextLine(); //this receives Srinivas   
    
     System.out.println("NAME:"+name);   
     System.out.println("ADDRESS:-\n"+addr);   

  }

}