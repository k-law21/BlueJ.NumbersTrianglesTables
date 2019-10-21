 
import java.lang.StringBuilder;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String output = "";
        for ( int i =1 ; i <= numberOfStars ; i++){
            
        output = output + "*";
    }
        return output;
    }
    
    public static String getTriangle(int numberOfRows) {
        String output = "";
        for ( int i =1 ; i <= numberOfRows ; i++){
            for(int j=1; j<=i;j++){
                
        output = output +"*";}
        output = output +"\n";
    }
    
      return output;  
    }

    public static String getSmallTriangle() {
        
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
