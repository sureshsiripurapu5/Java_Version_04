class Actress 
{
	static int count; // has default=0
	           
			   Actress()
	           {
		         count++;
	           }	   
}	
class StaticVariableNeedP01CountingObjectsVer2
{
	public static void main(String[] args)
    {
		Actress sam=new Actress();
	   	Actress jam=new Actress();
		Actress nayan=new Actress();
	   		
	    System.out.println("No of Object(s) = "+Actress.count);
	}
}	
