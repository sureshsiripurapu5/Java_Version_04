// NOTE: PLEASE make sure that values (min 2)
// are passed from commndline as aruguments afterclassNAME
// as follows...
// C:\Users\bablu\OneDrive\Desktop\OSS\javaProgramming>java CommandLineArgumentsP01DesignVer3     (specify some values HERE)

class CommandLineArgumentsP01DesignVer3
{
  public static void main(String argumentsRefVar[3]) // ALLOWED
  {
    System.out.println(argumentsRefVar[0]); // error if no value passed
	System.out.println(argumentsRefVar[1]);
  }
}