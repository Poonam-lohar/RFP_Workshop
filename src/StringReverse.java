
public class StringReverse {
    public static void main(String[] args) {
        String string= "RFP Workshop";
        String Reversed = " ";
        for (int i = string.length()-1; i >= 0; i--) {
            Reversed =  Reversed + string.charAt(i);
        }
        System.out.println("reverse the string: " + Reversed);
    }
}
