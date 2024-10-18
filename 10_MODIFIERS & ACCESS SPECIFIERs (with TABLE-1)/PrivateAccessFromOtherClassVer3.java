class Student
{
   private int 	 rno;
   private float fee;
   
            void  setRno(int r)  //Mutator Method  by James Gosling
		          {
				    rno=r;
				  }
			int   getRno()        // Accssor Method by James Gosling
				  {
				    return rno;
				  }	 
		    void  setFee(float f)   // setter method
		          {
				    fee=f;
				  }
			float getFee()         // getter method
				  {
				    return fee;
				  }
}

class PrivateAccessFromOtherClassVer3  // The Best
{
      public static void main(String[ ] args)
      {
		Student akhil=new Student();
                 
				 //akhil.rno=1;
				 //akhil.fee=7000.0F;
				 
				 akhil.setRno(2);
            int  drno=akhil.getRno();
			     System.out.println(drno);
				 
				 akhil.setFee(7000.0F);  // can place 7000 also No Error
				 System.out.println(akhil.getFee());
			       			   
     }
}   

      