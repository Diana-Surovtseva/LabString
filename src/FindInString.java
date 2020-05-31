public class FindInString {
    public static void main(String[] args) {
        String str = "Hello my world";
        //finding Characters
        System.out.println("Index of the letter w is " + str.indexOf('w'));
        //finding Substrings
        System.out.println("First occurrence of char World " + "is found at " + str.indexOf("world"));
        //Determine String Length
        System.out.println("String length is " + str.length());
        //Extracting Substrings
        System.out.println("Substring(9,14):" + str.substring(9, 14));
    }
}
