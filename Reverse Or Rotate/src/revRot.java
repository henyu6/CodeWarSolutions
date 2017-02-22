import java.lang.String;

class RevRot {
    
    public static String revRot(String strng, int sz) {
    
    if(sz <= 0) return "";
    if(strng.equals("")) return "";
    
    String currStr = "";
    String output = "";
    
        for(int i = sz; i < strng.length(); i = i + sz) {
            currStr = strng.substring(i - sz, i);
            if((sumOfCubes(currStr) % 2) == 1) {
                output = output + rotateLeft(currStr);
            } else {
                output = output + reverseStr(currStr);
            }
       }
       
        return output;
    }
    
    public static int sumOfCubes(String str) {
        int total = 0;
        int digit = 0;
        
        for(int i = 0; i < str.length(); i++) {
            digit = (int) str.charAt(i) - 48;
            digit = digit * digit * digit;
            total = total + digit;
        }
        
        return total;
    }
    
    public static String rotateLeft(String str) {
        if(str.length() < 2) return str;
        
        str = str.substring(1) + str.charAt(0);
        return str;
    }
    
    public static String reverseStr(String str) {
        char[] output = new char[str.length()];
        for(int i = 0; i < str.length(); i++)
            output[i] = str.charAt(str.length() - i - 1); //get the output string  
            
        return String.valueOf(output);
    }
}