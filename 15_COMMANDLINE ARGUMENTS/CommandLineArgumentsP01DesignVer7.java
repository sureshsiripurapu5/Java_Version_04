// NOTE: PLEASE make sure that values (min 5)
// are passed from commndline as aruguments afterclassNAME
// as follows...
// You can pass : 1 2.3 A Hello true  // all types

class CommandLineArgumentsP01DesignVer7
{
  public static void main(String args[])  
  {
	System.out.println("You passed " + args.length+" arguments");  
    for(String val:args)
	   System.out.println(val);
	  
	 
  }
}