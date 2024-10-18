package studentpackage ;   // Must be FIRST LINE

public class Student          // only public or DEFAULT is allowed for class
            {
                 public   int          rno;
                 public   double   fee;
                                     // default constructor provided by Java
                public   void   showData()
                                        {
                                           System.out.println("Roll  Number : "+ rno);
                                          System.out.println("and Fee (Rs.) : "+ fee);
                                        }
           } 
 
/*  // THE FOLLOWING IS NOT VISIBLE to Java 
  public class StudentMarks       // cant be more than ONE public class           
            {
                 public   int     total;
                
                                     // default constructor provided by Java
                public    void   getPutMarks()
                                        {
                                            total=525;
                                          System.out.println("Total Marks="+ total);
                                        }
           } 
 */

