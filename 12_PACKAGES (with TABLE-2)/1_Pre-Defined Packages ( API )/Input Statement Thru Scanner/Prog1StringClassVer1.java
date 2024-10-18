// import java.lang.String; 
    // The above Line is added by default in java, no need to place by Programmer
class Prog1StringClassVer1
{
    public static void main(String[ ] args)
     { 
       
         String   strObjRefVar1;      // created with 'null'
                  strObjRefVar1 = new String(); //constructor call
        System.out.println("empty string :-->"+strObjRefVar1+"<-- is displayed" );
        
        String   strObj=new String();  // Like our class&Object 
        System.out.println("Another empty string :-->"+strObj+"<-- is displayed" );
		         strObj="abdul kalaam";
		         System.out.println(strObj);
		
		String   myName=new String("PVR");
		         System.out.println(myName);
				 
		String   cricName="Sachinc";
		
		         System.out.println(cricName.charAt(0));
		
		         System.out.println(cricName.indexOf('c'));
		         System.out.println(cricName.indexOf('c',9));
				 
				 System.out.println(cricName.toUpperCase());
		          cricName="DHONI";
				 System.out.println(cricName.toLowerCase()); 
				  
      }
}

