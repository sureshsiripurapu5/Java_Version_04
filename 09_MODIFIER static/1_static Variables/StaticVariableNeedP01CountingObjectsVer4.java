class Actress 
{
	static int count;
	           
			   Actress()
	           {
		         count++;
	           }
    static void showCount()
			{
			  System.out.println("No of Object(s) = "+count);
          	}		   
}	
class StaticVariableNeedP01CountingObjectsVer4
{
	public static void main(String[] args)
    {
		Actress anushkaShetty=new Actress();
		Actress kajalAggrawal=new Actress();
	   	Actress kairaAdvani=new Actress();
		         
				 Actress.showCount();
				 kairaAdvani.showCount();
		         
	}
}	
