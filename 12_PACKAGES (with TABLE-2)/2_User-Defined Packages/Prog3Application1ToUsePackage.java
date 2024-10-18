import   studentpackage . Student ;
                     // Student class added here by Java at execution time

class Prog3Application1ToUsePackage 
{
   public static void main(String[] args)
   {
      Student studObj=new Student();  
                                     // NOTE : Student class was not defined above
                   studObj.rno=1;
                   studObj.fee=3500.0; 

                   studObj.showData();
   }
}   