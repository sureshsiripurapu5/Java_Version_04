import   studentpackage.Student;
class StudResult extends Student
{
   boolean   result;
                  // rno,fee and showData() are inherited HERE
          void   showResult()
                    {
                            // showData();
                       rno=2;
                       fee=2222.0;
                       result=true;

                       showData();
                       System.out.println("Passed : "+result);
                    }
}                
class Prog4Application2ToUsePackage 
{
   public static void main(String[] args)
   {
      StudResult studResObj=new  StudResult();  
                           studResObj. showResult();        
                   //studObj.
                  // studObj. 
                
   }
}   