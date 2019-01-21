package Easy.Challenges;

public class Hex_Colors {
    public static void ConvertToHex(int red, int green, int blue){
        String hexString = "#";
        int[] values = new int []{red,green,blue};
        for(int i=0; i<values.length; i++){
            if(values[i] == 0){
                hexString += "00";
            }
            else{
                hexString += Integer.toHexString(values[i]);
            }
        }
        System.out.println(hexString);
    }
    public static void main(String[] args){
        ConvertToHex(255,99,71);
        ConvertToHex(184, 134, 11);
        ConvertToHex(189, 183, 107);
        ConvertToHex(0, 0, 205);
    }
}
