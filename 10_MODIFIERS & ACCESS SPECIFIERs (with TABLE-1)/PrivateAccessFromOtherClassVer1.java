class Student
{
   private int 	 rno;
   private double fee;
   
    public int   setAndGetRnoFee(int r,double f)     
		         {
				    rno=r;
					fee=f;
					//return rno,fee;
	                return rno;
                    return fee;	 // NOT possible				
				  }
  
	
	
}

class PrivateAccessFromOtherClassVer1  // WORST way
{
      public static void main(String[ ] args)
      {
		Student akhil=new Student();
                 
				 //akhil.rno=1;
				 //akhil.fee=7000.0;
				 
				 System.out.println(akhil.setAndGetRnoFee(1,1000.0));
           	     
			       			   
     }
}   

      