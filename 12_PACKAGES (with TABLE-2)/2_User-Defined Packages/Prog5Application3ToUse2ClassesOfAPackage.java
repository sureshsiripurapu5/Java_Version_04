// import   studentpackage . Student ;
// import   studentpackage . StudentMarks;
                 //  OR
  import   studentpackage . * ;     // better instead of ABOVE TWO LINES
class Prog5Application3ToUse2ClassesOfAPackage 
{
   public static void main(String[] args)
   {
      Student           studentObj      = new Student();  
      StudentMarks studMarksObj = new StudentMarks();                            
                  studentObj . rno=1;
                   studentObj . fee=3500.0; 
                  studentObj . showData();
 
                   studMarksObj . putGetMarks();
   }
}   