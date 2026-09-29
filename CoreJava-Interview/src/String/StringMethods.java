package String;
public class StringMethods {

    public static void main(String[] args) {

        String str = "Hello Java";

        // 1. length()
        System.out.println("Length : " + str.length());

        // 2. toUpperCase()
        System.out.println("Upper Case : " + str.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Lower Case : " + str.toLowerCase());

        // 4. charAt()
        System.out.println("Character at index 4 : " + str.charAt(4));

        // 5. substring()
//        System.out.println("Substring : " + str.substring(6));
 
        // 6. replace()
        System.out.println("Replace : " + str.replace("Java", "World"));

        // 7. contains()
        System.out.println("Contains 'Java' : " + str.contains("Java"));
    }
}