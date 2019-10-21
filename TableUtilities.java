 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
       return getMultiplicationTable(5);
       
}
    public static String getLargeMultiplicationTable(){
    
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
            String out = "";
        for ( int i =1 ; i <=tableSize; i++){
            for (int j=1 ; j <= tableSize; j++){
            out += String.format("%3d" , i*j) + " |";
   
    }
    out += "\n";
}
return out;
    }
}
