// NOTE: PLEASE make sure that some values 
// are passed from commandline as aruguments afterclassNAME
// You don't know How many arguments that user will pass

class CommandLineArgumentsP01DesignVer9
{
  public static void main(String args[])  
  {
	System.out.println("You passed " + args.length+" arguments");  
    for(int i=0;i<=args.length-1;i++)  // or i < args.length
	   System.out.println(args[i]); 
	  
	 
  }
}