class Actress 
{
	int count; // field
	    		
	    Actress()
	    {
		   count++;
	    }	   
	
}	
	
class StaticVariableNeedP01CountingObjectsVer1
{
	public static void main(String[] args)
    {
		Actress sam=new Actress();
	    System.out.println("No of Object(s) = "+ sam.count);
		Actress jam=new Actress();
	    System.out.println("No of Object(s) = "+jam.count);
	
	}
}	
