
public class reverseString{
    public static void main(String[] args) {
        String input = "snneha loves money";
        System.out.println(reverseString(input));
    }

    private static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

    }
}