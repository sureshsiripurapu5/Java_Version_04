// NOTE: PLEASE make sure that values (min 5)
// are passed from commndline as aruguments afterclassNAME
// as follows...
// what happened if u pass 1,2,3,4,5

class CommandLineArgumentsP01DesignVer5
{
  public static void main(String args[])  
  {
    System.out.println(args[0]);
	System.out.println(args[1]+args[2]+args[3]+args[4]); 
	System.out.println("array size(locations) :" + args.length);
  }
}