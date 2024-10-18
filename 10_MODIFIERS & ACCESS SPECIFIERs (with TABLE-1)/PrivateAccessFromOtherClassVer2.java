class Student
{
   private int 	 rno;
   private double fee;
   
    public int   setAndGetRno(int r)     
		         {
				    rno=r;
					return rno;
				  }
  
	public double setAndGetFee(double f)    
		          {
				    fee=f;
					return fee;
				  }
	
}

class PrivateAccessFromOtherClassVer2   // Better way
{
      public static void main(String[ ] args)
      {
		Student akhil=new Student();
                 
				 //akhil.rno=1;
				 //akhil.fee=7000.0;
				 
				 System.out.println(akhil.setAndGetRno(2));
           	     System.out.println(akhil.setAndGetFee(7000.0));
			       			   
     }
}   

      