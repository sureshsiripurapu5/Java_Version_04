// NOTE: PLEASE make sure that values (min 5)
// are passed from commndline as aruguments afterclassNAME
// as follows...
// You can pass : 1 2.3 A Hello true  // all types only 5 values

class CommandLineArgumentsP01DesignVer8
{
  public static void main(String args[])  
  {
	System.out.println("You passed " + args.length+" arguments");  
    for(int i=0;i<=4;i++)
	   System.out.println(args[i]); 
	  
	 
  }
}