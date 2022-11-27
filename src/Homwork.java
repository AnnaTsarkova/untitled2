import java.util.Locale;

public class Homwork {
    public static void main(String[] args) {
        String string = new String("I study Basic Java!");
        demonstrateString(string);

        }
       static void demonstrateString(String string) {

        int lastSumbolIndex = string.length() -1;
           System.out.println(string.charAt(lastSumbolIndex));
        boolean containsJava = string.contains("Java");
           System.out.println(containsJava);
           String replaced = string.replace ('a', 'o');
           System.out.println(string);
           System.out.println(string.toLowerCase());
           System.out.println(string.toUpperCase());

           int javaIndex = string.indexOf("Java");

           String sub = string.substring(javaIndex, javaIndex + 4);
           System.out.println(sub);






       }
        }



