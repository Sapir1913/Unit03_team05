public class Unit03{  
    
    // Shoham
public static int shiftRight(int num) {
    if (num < 0 || num > 9999) {
        return -1;
    }

    if (num < 10) {
        return num;
    }

    int lastDigit = num % 10;
    num = num / 10;

    int length = (int) Math.log10(num) + 1;
    int shifted = lastDigit * (int) Math.pow(10, length) + num;

    return shifted;
}

    }
    public static int shiftRight(int num, int k) {
    
    if (num < 1000 || num > 9999)
        return -1;

    
    if (k < 0 || k > 4)
        return -1;

    
    if (k == 0 || k == 4)
        return num;

    int powK =  (int) Math.pow(10, k);       
    int powNK = (int) Math.pow(10, 4 - k); 

    int lastK = num % powK;  
    int firstPart = num / powK; 

    return lastK * powNK + firstPart;
}
}
    public static int shiftLeft(int num)    {
    if (num < 1000 || num > 9999)
        return -1;

    int firstDigit = num / 1000;   
    int rest = num % 1000;         

    return rest * 10 + firstDigit;
    }
    // Shoham
    public static int shiftLeft(int num, int k){
    if ((num > 9999 || num < 1000) || (k < 1 || k > 4)){
        return -1;
        }
    String sNum = String.valueOf(num);
    String leftPart = sNum.substring(0, k);
    String rightPart = sNum.substring(k);
    String shifted = rightPart + leftPart;
    return Integer.parseInt(shifted); 
    }
    }
     // Shoham
     public static String shiftRight(String s){
    int lngth = s.length();
    if (lngth < 2){
    return s;
    }
    String lastChar = s.substring(lngth - 1);
    String leftPart = s.substring(0, lngth - 1);
    String shifted = lastChar + leftPart;
    return shifted;
    }
    public static String shiftLeft(String s)    {
        return "";
    }
    public static String shiftLeft(String s, int k)    {
        return "";
    }
    public static String shiftRight(String s, int k)    {
        return "";
    }
    public static int countWords(String s)    {
        return -1;
    }
    public static int countParts(String s, char separator)    {
        return -1;
    }
    public static String getParts(String s, char separator)    {
        return "";
    }
    public static void printParts(String s, char separator)    {
        
    } 
    
}
