class Actress 
{
	static int count;
	           
			   Actress()
	           {
		         count++;
	           }
            void showCount()
			{
			  System.out.println("No of Object(s) = "+count);
          	}		   
}	
class StaticVariableNeedP01CountingObjectsVer3
{
	public static void main(String[] args)
    {
		Actress anushkaShetty=new Actress();
		        //anushkaShetty.showCount();
	   	Actress kajalAggrawal=new Actress();
	   	Actress kairaAdvani=new Actress();
		        kairaAdvan.showCount();
		        anushkaShetty.showCount(); 
	    
	}
}	
