
package setlength;
import java.lang.StringBuffer;
        

public class Setlength {
    public static void main(String[] args) {
   StringBuffer buff = new StringBuffer("profesor");
   System.out.println("palbra1 = " + buff);  
   System.out.println("length = " + buff.length());
   buff.setLength(5);   
  System.out.println("palabra2 = " + buff); 
   System.out.println("length = " + buff.length());
    }
    
}
