class CommandLineArgumentsP02ToSumTwoIntegersVer1
{
  public static void main(String a[]) 
  {
	  System.out.println("argument-1 : "+a[0]);
      System.out.println("argument-2 : "+a[1]);
	  
	  int x=Integer.parseInt(a[0]);
	  int y=Integer.parseInt(a[1]);
	  //System.out.println("arguments SUM : "+x+y);
	  System.out.println(x+y);
	  //System.out.println("arguments SUM : "+" "+ x+y );
	  System.out.println("arguments SUM : "+(x+y));
  }
}    










