class Emp
{
			    int     age;  //default ACCESS
	public		int     id;
	private		double  salary;
    private     boolean married;
				Emp()
				{
					age=23;
					id=1;
                }
			void showData()
			{			
	            System.out.println(age+"\n"+id);  // non private
			}	
			void    setSalary(double s)
				    { 
				      salary=s;
				    }
			double  getSalary()
				    { 
				     return salary;
				    }
			void    setMarried(boolean m)
				    { 
				      married=m;
				    }
			boolean  getMarried()
				    { 
				     return married;
				    }	

}	
	
class INHRTP11SingleWithMethodsSetterGetterVer4
{
    public static void main(String[ ] args)
    {
        Emp satyaNadella = new Emp();   
            satyaNadella.setSalary(1000000.0);
			satyaNadella.setMarried(true);

		    satyaNadella.showData();
	        System.out.println(satyaNadella.getSalary());
		    System.out.println(satyaNadella.getMarried());
	}
}   

      